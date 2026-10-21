package br.com.fatec.iqs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    void deveDividirNumerosInteiros() {
        assertEquals(4, calculadora.divide(12, 3));
    }

    @Test
    void deveLancarExcecaoQuandoDivisorForZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.divide(10, 0));
    }
}
