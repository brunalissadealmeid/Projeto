package POO;

public class Estudante1 extends Estudante {
    public static void main (String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Sophia";
        estudante1.matricula = "Ativa";
        estudante1.curso = "Medicina";

        estudante1.fazerProva();
        estudante1.assistirAula();
    }
}
