package fiap.challenge.sprin3.services;

import fiap.challenge.sprin3.entities.Cadastro;
import fiap.challenge.sprin3.repositories.CadastroRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CadastroService {

    private static final Logger logger = LogManager.getLogger(CadastroService.class);
    private CadastroRepository cadastroRepository;

    public CadastroService(){
        cadastroRepository = new CadastroRepository();
    }

    public void create(Cadastro cadastro){
        // Verifica se o cadastro é válido antes de salvar
        var validation = cadastro.validate();

        if(validation.containsKey(false)) {
            logger.error("Erro ao criar o cadastro: {}", validation.get(false).toString());
            throw new IllegalArgumentException(validation.get(false).toString());
        } else {
            try {
                cadastroRepository.create(cadastro);
                logger.info("Cadastro criado com sucesso: {}", cadastro);
            } catch (Exception e) {
                logger.error("Erro ao criar o cadastro: {}", e.getMessage());
                throw new RuntimeException("Erro ao criar o cadastro", e);
            }
        }
    }

    public void update(int id, Cadastro cadastro){
        // Verifica se o cadastro é válido antes de atualizar
        var validation = cadastro.validate();

        if(validation.containsKey(false)) {
            logger.error("Erro ao atualizar o cadastro: {}", validation.get(false).toString());
            throw new IllegalArgumentException(validation.get(false).toString());
        } else {
            try {
                cadastroRepository.update(id, cadastro);
                logger.info("Cadastro atualizado com sucesso: {}", cadastro);
            } catch (Exception e) {
                logger.error("Erro ao atualizar o cadastro: {}", e.getMessage());
                throw new RuntimeException("Erro ao atualizar o cadastro", e);
            }
        }
    }
}
