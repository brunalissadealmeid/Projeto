package exercicio.bolo;

public abstract class Bolo {

    protected String nome;
    protected double preco;
    protected String sabor;

    public void exibirDetalhes(){
        System.out.println("Nome : " + nome);
        System.out.println("Preco : " + preco);
        System.out.println("Sabor : " + sabor + "\n");
        System.out.println("Custo de Producao : " + calcularCustoProducao() + "\n");
    }

    public double calcularCustoProducao(){

        return 100;
    };


}
