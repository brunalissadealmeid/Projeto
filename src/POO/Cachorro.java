package POO;

public class Cachorro {

    String nome;
    String raca;
    int idade;
    double peso;

    void latir() {
        System.out.println("Au au");
    }

    void comer(double valor) {
        if (peso > 5) {
            peso += valor;
            System.out.println(peso);
        }
    }

    void caminhar(double valor) {
        if (peso > 30) {
            peso -= valor;
            System.out.println(valor);
        }
    }
}
