package fiap.challenge.sprin3.entities;

import fiap.challenge.sprin3.repositories._IBaseRepository;

import java.util.List;

public class Imagens extends _BaseEntity implements _IBaseRepository {

    private String DESCRICAO;
    private String NOME_ARQUIVO;
    private int TAMANHO_ARQUIVO;

    public void Imagens (){

    }

    public Imagens(int id, String DESCRICAO, String NOME_ARQUIVO, int TAMANHO_ARQUIVO) {
        super(id);
        this.DESCRICAO = DESCRICAO;
        this.NOME_ARQUIVO = NOME_ARQUIVO;
        this.TAMANHO_ARQUIVO = TAMANHO_ARQUIVO;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    public String getNOME_ARQUIVO() {
        return NOME_ARQUIVO;
    }

    public void setNOME_ARQUIVO(String NOME_ARQUIVO) {
        this.NOME_ARQUIVO = NOME_ARQUIVO;
    }

    public int getTAMANHO_ARQUIVO() {
        return TAMANHO_ARQUIVO;
    }

    public void setTAMANHO_ARQUIVO(int TAMANHO_ARQUIVO) {
        this.TAMANHO_ARQUIVO = TAMANHO_ARQUIVO;
    }

    @Override
    public String toString() {
        return "Imagens{" +
                "DESCRICAO='" + DESCRICAO + '\'' +
                ", NOME_ARQUIVO='" + NOME_ARQUIVO + '\'' +
                ", TAMANHO_ARQUIVO=" + TAMANHO_ARQUIVO +
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
