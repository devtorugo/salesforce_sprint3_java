package fiap.challenge.sprin3.repositories;

import fiap.challenge.sprin3.configuration.OracleDatabaseConnection;
import fiap.challenge.sprin3.entities.Cadastro;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CadastroRepository {
    private Connection connection;

    public CadastroRepository() {
        try {
            this.connection = OracleDatabaseConnection.getConnection(); // Inicialize a conexão corretamente
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void cadastrar(Cadastro cadastro) {
        String sql = "INSERT INTO CADASTRO (ID, NOME, TELEFONE, EMAIL, SENHA, EMPRESA, IDIOMA, REGIAO, TERMO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, cadastro.getId());
            stmt.setString(2, cadastro.getNOME());
            stmt.setString(3, cadastro.getTELEFONE());
            stmt.setString(4, cadastro.getEMAIL());
            stmt.setString(5, cadastro.getSENHA());
            stmt.setString(6, cadastro.getEMPRESA());
            stmt.setString(7, cadastro.getIDIOMA());
            stmt.setString(8, cadastro.getREGIAO().getPAIS_NOME());
            stmt.setBoolean(9, cadastro.getTERMO().isACEITAR_TERMO());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Cadastro inserido com sucesso!");
            } else {
                System.out.println("Erro ao inserir cadastro.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir cadastro: " + e.getMessage());
        }
    }

    public Cadastro getCadastroById(int id) {
        String selectSQL = "SELECT * FROM CADASTRO WHERE ID = ?";
        Cadastro cadastro = null;

        try (PreparedStatement pstmt = connection.prepareStatement(selectSQL)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                cadastro = new Cadastro(
                        rs.getInt("ID"), rs.getString("NOME"), rs.getString("TELEFONE"),
                        rs.getString("EMAIL"), rs.getString("SENHA"), rs.getString("EMPRESA"),
                        rs.getString("IDIOMA"), rs.getString("REGIAO"), rs.getBoolean("TERMO")
                );
            }
        } catch (SQLException e) {
            System.out.println("Erro ao obter usuário: " + e.getMessage());
        }
        return cadastro;
    }

    public void deleteCadastro(int id) {
        String sql = "DELETE FROM CADASTRO WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Cadastro deletado com sucesso!");
            } else {
                System.out.println("Nenhum cadastro encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar cadastro: " + e.getMessage());
        }
    }

    public List<Cadastro> listAllCadastros() {
        List<Cadastro> cadastrolist = new ArrayList<>();
        String selectAllSQL = "SELECT * FROM CADASTRO";

        try (PreparedStatement pstmt = connection.prepareStatement(selectAllSQL)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Cadastro cadastro = new Cadastro(
                        rs.getInt("ID"), rs.getString("NOME"), rs.getString("TELEFONE"),
                        rs.getString("EMAIL"), rs.getString("SENHA"), rs.getString("EMPRESA"),
                        rs.getString("IDIOMA"), rs.getString("REGIAO"), rs.getBoolean("TERMO")
                );
                cadastrolist.add(cadastro);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar usuários " + e.getMessage());
        }
        return cadastrolist;
    }
}
