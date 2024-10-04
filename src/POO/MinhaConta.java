package POO;

public class MinhaConta extends Banco {
    public static void main (String[] args) {

        Banco minhaConta1 = new Banco();
        minhaConta1.nome = "Maria Santos";
        minhaConta1.conta = 2309;
        minhaConta1.agencia = 9;
        minhaConta1.saldo = 23.456;

        minhaConta1.depositar(233);
        minhaConta1.sacar(23);
        minhaConta1.verSaldo();

    }
}
