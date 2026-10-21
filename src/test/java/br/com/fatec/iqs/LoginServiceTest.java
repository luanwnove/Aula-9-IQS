package br.com.fatec.iqs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {
    private final LoginService service = new LoginService();

    @Test
    void aceitaCredenciaisValidas() {
        assertTrue(service.validar("aluno", "senha123"));
    }

    @Test
    void rejeitaUsuarioVazio() {
        assertFalse(service.validar(" ", "senha123"));
    }

    @Test
    void rejeitaSenhaCurta() {
        assertFalse(service.validar("aluno", "123"));
    }

    @Test
    void rejeitaValoresNulos() {
        assertFalse(service.validar(null, "senha123"));
        assertFalse(service.validar("aluno", null));
    }
}
