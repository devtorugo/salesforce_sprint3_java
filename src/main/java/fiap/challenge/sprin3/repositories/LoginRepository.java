package fiap.challenge.sprin3.repositories;


import fiap.challenge.sprin3.entities.Cadastro;
import fiap.challenge.sprin3.entities.Login;

public class LoginRepository extends _BaseRepositoryImpl<Login> {

    public boolean realizarLogin(Cadastro cadastro) {
        if (cadastro.getEMAIL().equals("usuario@exemplo.com") && cadastro.getSENHA().equals("senha123")) {
            return true;
        } else {
            return false;
        }
    }
}

