package POO;

public class Estudante {

    String nome;
    String matricula;
    String curso;

    void assistirAula() {
        System.out.println("Estudante" + nome + "está assistindo aula.");
    }

    void fazerProva() {
        System.out.println("Estudante" + nome + "está fazendo prova.");
    }
}