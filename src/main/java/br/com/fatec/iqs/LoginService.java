package br.com.fatec.iqs;

/**
 * Valida credenciais de acesso de forma simplificada para a atividade.
 */
public class LoginService {
    /**
     * Verifica se o usuário e a senha atendem aos critérios básicos.
     *
     * @param usuario nome do usuário
     * @param senha senha informada
     * @return true quando os dados são válidos
     */
    public boolean validar(String usuario, String senha) {
        return usuario != null && !usuario.isBlank()
                && senha != null && senha.length() >= 10;
    }
}
