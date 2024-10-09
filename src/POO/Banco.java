package POO;

public class Banco {

    String nome;
    int agencia;
    int conta;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposit: R$" + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    void verSaldo(){
        System.out.println("Saldo atual:" + saldo);
    }
}
