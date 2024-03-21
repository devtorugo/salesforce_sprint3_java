package fiap.challenge.sprin3.entities;

import fiap.challenge.sprin3.repositories._IBaseRepository;

import java.util.List;

public class Cadastro extends _BaseEntity implements _IBaseRepository {
    private String NOME;
    private String TELEFONE;
    private String EMAIL;
    private String SENHA;
    private String EMPRESA;
    private String IDIOMA;
    private Regiao REGIAO;
    private Termo TERMO;


    public Cadastro(){

    }

    public Cadastro(int id, String NOME, String TELEFONE, String EMAIL, String SENHA, String EMPRESA, String IDIOMA, Regiao REGIAO, Termo TERMO) {
        super(id);
        this.NOME = NOME;
        this.TELEFONE = TELEFONE;
        this.EMAIL = EMAIL;
        this.SENHA = SENHA;
        this.EMPRESA = EMPRESA;
        this.IDIOMA = IDIOMA;
        this.REGIAO = REGIAO;
        this.TERMO = TERMO;
    }



    public Cadastro(String nome, String telefone, String email, String senha, String empresa, String idioma, String regiao, boolean termo) {
    }

    public Cadastro(int id, String nome, String telefone, String email, String senha, String empresa, String idioma, String regiao, boolean termo) {
    }


    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getTELEFONE() {
        return TELEFONE;
    }

    public void setTELEFONE(String TELEFONE) {
        this.TELEFONE = TELEFONE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSENHA() {
        return SENHA;
    }

    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }

    public String getEMPRESA() {
        return EMPRESA;
    }

    public void setEMPRESA(String EMPRESA) {
        this.EMPRESA = EMPRESA;
    }

    public String getIDIOMA() {
        return IDIOMA;
    }

    public void setIDIOMA(String IDIOMA) {
        this.IDIOMA = IDIOMA;
    }

    public Regiao getREGIAO() {
        return REGIAO;
    }

    public void setREGIAO(Regiao REGIAO) {
        this.REGIAO = REGIAO;
    }

    public Termo getTERMO() {
        return TERMO;
    }

    public void setTERMO(Termo TERMO) {
        this.TERMO = TERMO;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "NOME='" + NOME + '\'' +
                ", TELEFONE='" + TELEFONE + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", SENHA='" + SENHA + '\'' +
                ", EMPRESA='" + EMPRESA + '\'' +
                ", IDIOMA='" + IDIOMA + '\'' +
                ", REGIAO=" + REGIAO +
                ", TERMO=" + TERMO +
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

