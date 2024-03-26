package fiap.challenge.sprin3.services;

import fiap.challenge.sprin3.entities.Cadastro;
import fiap.challenge.sprin3.repositories.CadastroRepository;


public class CadastroService {

    private CadastroRepository cadastroRepository;

    public CadastroService(){
        cadastroRepository = new CadastroRepository();
    }

    public void create(Cadastro cadastro){
        // Verifica se o cadastro é válido antes de salvar
        var validation = cadastro.validate();

        if(validation.containsKey(false))
            throw new IllegalArgumentException(validation.get(false).toString());
        else
            cadastroRepository.create(cadastro);
    }

    public void update(int id, Cadastro cadastro){
        // Verifica se o cadastro é válido antes de atualizar
        var validation = cadastro.validate();

        if(validation.containsKey(false))
            throw new IllegalArgumentException(validation.get(false).toString());
        else
            cadastroRepository.update(id, cadastro);
    }



}
