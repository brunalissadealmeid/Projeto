package POO;

public class AlunoAcademia extends Academia{
    public static void main (String[] args) {

        Academia alunoAcademia = new Academia();
        alunoAcademia.nomeAluno = "Bruna";
        alunoAcademia.peso = 79;
        alunoAcademia.altura = 159;

        alunoAcademia.calcularIMC();
        alunoAcademia.mostrarInformacoes();
    }
}
