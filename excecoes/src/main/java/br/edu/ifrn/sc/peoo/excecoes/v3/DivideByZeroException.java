/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
*/

package br.edu.ifrn.sc.peoo.excecoes.v3;

public class DivideByZeroException extends ArithmeticException {

    public DivideByZeroException() {
        super("[ERRO] Não é possível dividir por 0. Corrija os valores e tente novamente");
    }

    public DivideByZeroException(String msg) {
        super(msg);
    }

}
