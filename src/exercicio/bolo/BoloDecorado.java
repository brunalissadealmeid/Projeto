package exercicio.bolo;

public class BoloDecorado extends Bolo {

    String temaDecoracao;
    boolean incluiTopperPersonalizado;

    public BoloDecorado(String sabor, String temaDecoracao, boolean incluiTopperPersonalizado) {
        this.nome = "Bolo Decorado";
        this.preco = 150.0;
        this.sabor = sabor;
        this.temaDecoracao = temaDecoracao;
        this.incluiTopperPersonalizado = incluiTopperPersonalizado;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de decoração: " + temaDecoracao);
        System.out.print("Inclui Topper: " + (incluiTopperPersonalizado ? "Sim" : "Não"));

    }

    @Override
    public double calcularCustoProducao() {

        double custoTotalProducao = 150.0;

        if (incluiTopperPersonalizado) {
            custoTotalProducao += 50;
        }
        return custoTotalProducao;
    }
}

