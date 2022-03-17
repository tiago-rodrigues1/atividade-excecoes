package br.edu.ifrn.sc.peoo.excessoes.v2;

public class Calculadora {

    public static int dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("[ERRO] Não é possível dividir por 0");
        } else {
            int quosciente = dividendo / divisor;

            return quosciente;
        }
    }
}
