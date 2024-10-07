package POO;

public class Academia {

    String nomeAluno;
    double peso;
    double altura;

    void calcularIMC() {
        double IMC = peso / (altura * altura);
        System.out.println("IMC: " + IMC);
    }

    void mostrarInformacoes() {
        System.out.println("Nome do Aluno:" + nomeAluno + "; Peso:" + peso + "; Altura:" + altura);
    }
}
