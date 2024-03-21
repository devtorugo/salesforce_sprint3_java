package fiap.challenge.sprin3.entities;

import fiap.challenge.sprin3.repositories._IBaseRepository;


import java.time.LocalDateTime;
import java.util.List;

public class Licenca_Software extends _BaseEntity implements _IBaseRepository {

    private String CHAVE_ATIVACAO;
    private LocalDateTime DATA_ATIVACAO;
    private String LOCAL_ATIVACAO;
    private Informacoes_Do_Servico INFORMACOES_DO_SERVICO;

    public Licenca_Software(){

    }

    public Licenca_Software(int id, String CHAVE_ATIVACAO, LocalDateTime DATA_ATIVACAO, String LOCAL_ATIVACAO, Informacoes_Do_Servico INFORMACOES_DO_SERVICO) {
        super(id);
        this.CHAVE_ATIVACAO = CHAVE_ATIVACAO;
        this.DATA_ATIVACAO = DATA_ATIVACAO;
        this.LOCAL_ATIVACAO = LOCAL_ATIVACAO;
        this.INFORMACOES_DO_SERVICO = INFORMACOES_DO_SERVICO;
    }

    public String getCHAVE_ATIVACAO() {
        return CHAVE_ATIVACAO;
    }

    public void setCHAVE_ATIVACAO(String CHAVE_ATIVACAO) {
        this.CHAVE_ATIVACAO = CHAVE_ATIVACAO;
    }

    public LocalDateTime getDATA_ATIVACAO() {
        return DATA_ATIVACAO;
    }

    public void setDATA_ATIVACAO(LocalDateTime DATA_ATIVACAO) {
        this.DATA_ATIVACAO = DATA_ATIVACAO;
    }

    public String getLOCAL_ATIVACAO() {
        return LOCAL_ATIVACAO;
    }

    public void setLOCAL_ATIVACAO(String LOCAL_ATIVACAO) {
        this.LOCAL_ATIVACAO = LOCAL_ATIVACAO;
    }

    public Informacoes_Do_Servico getINFORMACOES_DO_SERVICO() {
        return INFORMACOES_DO_SERVICO;
    }

    public void setINFORMACOES_DO_SERVICO(Informacoes_Do_Servico INFORMACOES_DO_SERVICO) {
        this.INFORMACOES_DO_SERVICO = INFORMACOES_DO_SERVICO;
    }

    @Override
    public String toString() {
        return "Licenca_Software{" +
                "CHAVE_ATIVACAO='" + CHAVE_ATIVACAO + '\'' +
                ", DATA_ATIVACAO=" + DATA_ATIVACAO +
                ", LOCAL_ATIVACAO='" + LOCAL_ATIVACAO + '\'' +
                ", INFORMACOES_DO_SERVICO=" + INFORMACOES_DO_SERVICO +
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
