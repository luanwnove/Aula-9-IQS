
package br.com.fatec.iqs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {
    private final LoginService service = new LoginService();

    @Test
    void aceitaCredenciaisValidas() {
        assertTrue(service.validar("aluno", "senha12345"));
    }

    @Test
    void rejeitaUsuarioVazio() {
        assertFalse(service.validar(" ", "senha12345"));
    }

    @Test
    void rejeitaSenhaCurta() {
        assertFalse(service.validar("aluno", "123"));
    }

    @Test
    void rejeitaSenhaComNoveCaracteres() {
        assertFalse(service.validar("aluno", "123456789"));
    }

    @Test
    void rejeitaValoresNulos() {
        assertFalse(service.validar(null, "senha12345"));
        assertFalse(service.validar("aluno", null));
    }
}
