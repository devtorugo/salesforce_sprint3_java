package fiap.challenge.sprin3.entities;

import fiap.challenge.sprin3.repositories._IBaseRepository;


import java.util.List;

public class Informacoes_Do_Servico extends _BaseEntity implements _IBaseRepository {
    private String NOME;
    private String DESCRICAO;
    private String CATEGORIA;
    private double PRECO;
    private Dados_Da_Compra DADOS_DA_COMPRA;

    public Informacoes_Do_Servico(){

    }

    public Informacoes_Do_Servico(int id, String NOME, String DESCRICAO, String CATEGORIA, double PRECO, Dados_Da_Compra DADOS_DA_COMPRA) {
        super(id);
        this.NOME = NOME;
        this.DESCRICAO = DESCRICAO;
        this.CATEGORIA = CATEGORIA;
        this.PRECO = PRECO;
        this.DADOS_DA_COMPRA = DADOS_DA_COMPRA;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }

    public double getPRECO() {
        return PRECO;
    }

    public void setPRECO(double PRECO) {
        this.PRECO = PRECO;
    }

    public Dados_Da_Compra getDADOS_DA_COMPRA() {
        return DADOS_DA_COMPRA;
    }

    public void setDADOS_DA_COMPRA(Dados_Da_Compra DADOS_DA_COMPRA) {
        this.DADOS_DA_COMPRA = DADOS_DA_COMPRA;
    }

    @Override
    public String toString() {
        return "Informacoes_Do_Servico{" +
                "NOME='" + NOME + '\'' +
                ", DESCRICAO='" + DESCRICAO + '\'' +
                ", CATEGORIA='" + CATEGORIA + '\'' +
                ", PRECO=" + PRECO +
                ", DADOS_DA_COMPRA=" + DADOS_DA_COMPRA +
                "} " + super.toString();
    }

    @Override
    public void Create(_BaseEntity entity) {

    }

    @Override
    public List ReadAll() {
        return null;
    }

    @Override
    public void Update(_BaseEntity entity) {

    }

    @Override
    public void Delete(_BaseEntity entity) {

    }

    @Override
    public void DeleteById(int id) {

    }
}
