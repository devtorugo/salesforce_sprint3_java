package fiap.challenge.sprin3.entities;

import fiap.challenge.sprin3.repositories._IBaseRepository;

import java.util.List;

public class Termo extends _BaseEntity implements _IBaseRepository {

    private boolean ACEITAR_TERMO;


    public void Termo(){

    }

    public Termo(int id, boolean ACEITAR_TERMO) {
        super(id);
        this.ACEITAR_TERMO = ACEITAR_TERMO;
    }


    public boolean isACEITAR_TERMO() {
        return ACEITAR_TERMO;
    }

    @Override
    public String toString() {
        return "Termo{" +
                "ACEITAR_TERMO=" + ACEITAR_TERMO +
                "} " + super.toString();
    }

    public void setACEITAR_TERMO(boolean ACEITAR_TERMO) {
        this.ACEITAR_TERMO = ACEITAR_TERMO;
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
