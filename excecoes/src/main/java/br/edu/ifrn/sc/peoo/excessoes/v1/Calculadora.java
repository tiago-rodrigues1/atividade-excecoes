package br.edu.ifrn.sc.peoo.excessoes.v1;

public class Calculadora {

    public static int dividir(int dividendo, int divisor) {
        try {
            int quosciente = dividendo / divisor;
            return quosciente;
        } catch (ArithmeticException ex) {
            System.out.println("[ERRO] Não é possível dividir por 0");
            return 0;
        }
    }
}
