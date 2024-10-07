package POO;

public class Elevador1 extends Elevador{
    public static void main (String[] args) {

        Elevador elevador1 = new Elevador();
        elevador1.andarAtual = 23;
        elevador1.totalAndares = 45;
        elevador1.capacidade = 8;
        elevador1.pessoasPresentes = 6;

        elevador1.subir();
        elevador1.descer();
        elevador1.entrar();
        elevador1.sair();
        elevador1.mostraStatus();
    }
}
