package br.com.fatec.iqs;

public class LoginService {

    public boolean validar(String usuario, String senha) {
        return usuario != null && !usuario.isBlank()
                && senha != null && senha.length() >= 8;
    }
}
