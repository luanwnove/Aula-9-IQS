package br.com.fatec.iqs;

import java.util.regex.Pattern;

public class NotificacoesService {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public boolean enviarEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
}
