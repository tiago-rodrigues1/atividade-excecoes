/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
*/

package br.edu.ifrn.sc.peoo.excecoes.v2;

public class TesteCalculadora {

    public static void main(String[] args) {
        try {
            System.out.println(Calculadora.dividir(4, 0));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
