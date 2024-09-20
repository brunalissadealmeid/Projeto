package exercicio.bolo;

public class BoloPersonalizado extends Bolo {
    boolean incluiRecheio;
    boolean incluiFrutas;
    boolean incluiCaldas;

    public BoloPersonalizado(boolean incluiRecheio, boolean incluiCaldas, boolean incluiFrutas) {
        this.nome = "Bolo Personalizado";
        this.preco = 85.0;
        this.sabor = sabor;
        this.incluiRecheio = incluiRecheio;
        this.incluiCaldas = incluiCaldas;
        this.incluiFrutas = incluiFrutas;
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.print("Recheio: ");
        if (incluiRecheio) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        System.out.print("Calda: ");
        if (incluiCaldas) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        System.out.print("Frutas: ");
        if (incluiFrutas) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

    }

    @Override
    public double calcularCustoProducao() {
        double custoTotalProducao = 110.0;

        if (incluiFrutas) {
            custoTotalProducao += 5.0;
        }
        if (incluiCaldas) {
            custoTotalProducao += 7.0;
        }
        if (incluiRecheio) {
            custoTotalProducao += 4.0;
        }
        return custoTotalProducao;
    }
}
















