package br.com.fatec.iqs;

import java.util.regex.Pattern;

/**
 * Valida o endereço de e-mail usado para envio de notificações.
 */
public class NotificacoesService {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    /**
     * Indica se o e-mail tem formato válido.
     *
     * @param email endereço a validar
     * @return true quando o formato é válido
     */
    public boolean enviarEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
}
