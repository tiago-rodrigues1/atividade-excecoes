package br.edu.ifrn.sc.peoo.excecoes.v3;

public class TesteCalculadora {

    public static void main(String[] args) {
        try {
            System.out.println(Calculadora.dividir(4, 0));
        } catch (DivideByZeroException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
