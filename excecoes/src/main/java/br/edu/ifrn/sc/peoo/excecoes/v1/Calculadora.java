package br.edu.ifrn.sc.peoo.excecoes.v1;

public class Calculadora {

    public static int dividir(int dividendo, int divisor) {
        try {
            int quosciente = dividendo / divisor;
            return quosciente;
        } catch (ArithmeticException ex) {
            return Integer.MIN_VALUE;
        }
    }
}
