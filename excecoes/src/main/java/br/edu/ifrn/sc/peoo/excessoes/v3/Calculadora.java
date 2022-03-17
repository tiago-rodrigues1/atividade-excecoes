package br.edu.ifrn.sc.peoo.excessoes.v3;

public class Calculadora {

    public static int dividir(int dividendo, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException();
        } else {
            int quosciente = dividendo / divisor;

            return quosciente;
        }
    }
}
