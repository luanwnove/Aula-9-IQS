
package br.com.fatec.iqs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacoesServiceTest {
    private final NotificacoesService service = new NotificacoesService();

    @Test
    void aceitaEmailValido() {
        assertTrue(service.enviarEmail("aluno@fatec.sp.gov.br"));
    }

    @Test
    void rejeitaEmailInvalido() {
        assertFalse(service.enviarEmail("email-invalido"));
    }

    @Test
    void rejeitaEmailNulo() {
        assertFalse(service.enviarEmail(null));
    }
}
