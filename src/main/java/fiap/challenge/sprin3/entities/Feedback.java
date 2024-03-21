package fiap.challenge.sprin3.entities;

import fiap.challenge.sprin3.repositories._IBaseRepository;

import java.time.LocalDateTime;
import java.util.List;

public class Feedback extends _BaseEntity implements _IBaseRepository {
    private String COMENTARIOS;
    private LocalDateTime DATA_AVALIACAO;
    private String AUTOR_AVALIACAO;
    private int CLASSIFICACAO_SERVICO;

    public Feedback(){

    }

    public Feedback(int id, String COMENTARIOS, LocalDateTime DATA_AVALIACAO, String AUTOR_AVALIACAO, int CLASSIFICACAO_SERVICO) {
        super(id);
        this.COMENTARIOS = COMENTARIOS;
        this.DATA_AVALIACAO = DATA_AVALIACAO;
        this.AUTOR_AVALIACAO = AUTOR_AVALIACAO;
        this.CLASSIFICACAO_SERVICO = CLASSIFICACAO_SERVICO;
    }

    public String getCOMENTARIOS() {
        return COMENTARIOS;
    }

    public void setCOMENTARIOS(String COMENTARIOS) {
        this.COMENTARIOS = COMENTARIOS;
    }

    public LocalDateTime getDATA_AVALIACAO() {
        return DATA_AVALIACAO;
    }

    public void setDATA_AVALIACAO(LocalDateTime DATA_AVALIACAO) {
        this.DATA_AVALIACAO = DATA_AVALIACAO;
    }

    public String getAUTOR_AVALIACAO() {
        return AUTOR_AVALIACAO;
    }

    public void setAUTOR_AVALIACAO(String AUTOR_AVALIACAO) {
        this.AUTOR_AVALIACAO = AUTOR_AVALIACAO;
    }

    public int getCLASSIFICACAO_SERVICO() {
        return CLASSIFICACAO_SERVICO;
    }

    public void setCLASSIFICACAO_SERVICO(int CLASSIFICACAO_SERVICO) {
        this.CLASSIFICACAO_SERVICO = CLASSIFICACAO_SERVICO;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "COMENTARIOS='" + COMENTARIOS + '\'' +
                ", DATA_AVALIACAO=" + DATA_AVALIACAO +
                ", AUTOR_AVALIACAO='" + AUTOR_AVALIACAO + '\'' +
                ", CLASSIFICACAO_SERVICO=" + CLASSIFICACAO_SERVICO +
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
