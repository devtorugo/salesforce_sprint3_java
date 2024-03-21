package fiap.challenge.sprin3.entities;

import fiap.challenge.sprin3.repositories._IBaseRepository;


import java.util.List;

public class Login extends _BaseEntity implements _IBaseRepository {
    private String EMAIL;
    private String SENHA;
    private Cadastro CADASTRO;

    public Login(){

    }

    public Login(int id, String EMAIL, String SENHA, Cadastro CADASTRO) {
        super(id);
        this.EMAIL = EMAIL;
        this.SENHA = SENHA;
        this.CADASTRO = CADASTRO;
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

    public Cadastro getCADASTRO() {
        return CADASTRO;
    }

    public void setCADASTRO(Cadastro CADASTRO) {
        this.CADASTRO = CADASTRO;
    }

    @Override
    public String toString() {
        return "Login{" +
                "EMAIL='" + EMAIL + '\'' +
                ", SENHA='" + SENHA + '\'' +
                ", CADASTRO=" + CADASTRO +
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
