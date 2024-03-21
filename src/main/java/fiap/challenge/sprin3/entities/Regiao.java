package fiap.challenge.sprin3.entities;

import fiap.challenge.sprin3.repositories._IBaseRepository;


import java.util.List;

public class Regiao extends _BaseEntity implements _IBaseRepository {

    private String PAIS_NOME;


    public void Regiao(){

    }

    public Regiao(int id, String PAIS_NOME) {
        super(id);
        this.PAIS_NOME = PAIS_NOME;
    }

    public String getPAIS_NOME() {
        return PAIS_NOME;
    }

    public void setPAIS_NOME(String PAIS_NOME) {
        this.PAIS_NOME = PAIS_NOME;
    }

    @Override
    public String toString() {
        return "Regiao{" +
                "PAIS_NOME='" + PAIS_NOME + '\'' +
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
