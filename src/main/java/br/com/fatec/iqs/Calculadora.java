package br.com.fatec.iqs;

/**
 * Operações matemáticas básicas utilizadas na atividade de code review.
 */
public class Calculadora {
    /**
     * Divide o primeiro número pelo segundo.
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado inteiro da divisão
     * @throws ArithmeticException quando o divisor é zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor não pode ser zero");
        }
        return a / b;
    }
}
