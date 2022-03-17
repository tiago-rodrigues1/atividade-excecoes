package br.edu.ifrn.sc.peoo.excessoes.v3;

public class DivideByZeroException extends ArithmeticException {

    public DivideByZeroException() {
        super("[ERRO] Não é possível dividir por 0");
    }

    public DivideByZeroException(String msg) {
        super(msg);
    }

}
