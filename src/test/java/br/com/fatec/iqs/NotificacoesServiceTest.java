package br.com.fatec.iqs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacoesServiceTest {
    private final NotificacoesService service = new NotificacoesService();

    @Test
    void aceitaEmailValido() {
        assertTrue(service.enviarEmail("aluno@exemplo.com"));
    }

    @Test
    void rejeitaEmailSemArroba() {
        assertFalse(service.enviarEmail("alunoexemplo.com"));
    }

    @Test
    void rejeitaEmailSemDominio() {
        assertFalse(service.enviarEmail("aluno@"));
    }

    @Test
    void rejeitaEmailNulo() {
        assertFalse(service.enviarEmail(null));
    }
}
