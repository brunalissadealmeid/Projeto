package POO;

public class Lampada {

    boolean ligada;
    int potencia;
    String corLuz;

    void ligar() {
        ligada = true;
    }

    void desligada() {
        ligada = false;
    }

    void mostrarEstado() {
        if (true) {
            System.out.println ("A lampada está ligada.");
        } else {
            System.out.println ("A lampada está desligada.");
        }
    }
}
