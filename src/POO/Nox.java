package POO;

public class Nox extends Lampada{
    public static void main (String[] args){

        Lampada nox = new Lampada();
        nox.ligada = true;
        nox.potencia = 12;
        nox.corLuz = "branca";

        nox.ligar();
        nox.desligada();
        nox.mostrarEstado();
    }
}
