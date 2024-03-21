package fiap.challenge.sprin3.entities;

import fiap.challenge.sprin3.repositories._IBaseRepository;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Dados_Da_Compra extends _BaseEntity implements _IBaseRepository {
    private LocalDateTime DATA;
    private LocalTime HORA;
    private int TOTAL;
    private String LOCAL;
    private Imagens IMAGENS;
    private Feedback FEEDBACK;
    private Login LOGIN;

    public Dados_Da_Compra(){

    }

    public Dados_Da_Compra(int id, LocalDateTime DATA, LocalTime HORA, int TOTAL, String LOCAL, Imagens IMAGENS, Feedback FEEDBACK, Login LOGIN) {
        super(id);
        this.DATA = DATA;
        this.HORA = HORA;
        this.TOTAL = TOTAL;
        this.LOCAL = LOCAL;
        this.IMAGENS = IMAGENS;
        this.FEEDBACK = FEEDBACK;
        this.LOGIN = LOGIN;
    }

    public LocalDateTime getDATA() {
        return DATA;
    }

    public void setDATA(LocalDateTime DATA) {
        this.DATA = DATA;
    }

    public LocalTime getHORA() {
        return HORA;
    }

    public void setHORA(LocalTime HORA) {
        this.HORA = HORA;
    }

    public int getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(int TOTAL) {
        this.TOTAL = TOTAL;
    }

    public String getLOCAL() {
        return LOCAL;
    }

    public void setLOCAL(String LOCAL) {
        this.LOCAL = LOCAL;
    }

    public Imagens getIMAGENS() {
        return IMAGENS;
    }

    public void setIMAGENS(Imagens IMAGENS) {
        this.IMAGENS = IMAGENS;
    }

    public Feedback getFEEDBACK() {
        return FEEDBACK;
    }

    public void setFEEDBACK(Feedback FEEDBACK) {
        this.FEEDBACK = FEEDBACK;
    }

    public Login getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(Login LOGIN) {
        this.LOGIN = LOGIN;
    }

    @Override
    public String toString() {
        return "Dados_Da_Compra{" +
                "DATA=" + DATA +
                ", HORA=" + HORA +
                ", TOTAL=" + TOTAL +
                ", LOCAL='" + LOCAL + '\'' +
                ", IMAGENS=" + IMAGENS +
                ", FEEDBACK=" + FEEDBACK +
                ", LOGIN=" + LOGIN +
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
