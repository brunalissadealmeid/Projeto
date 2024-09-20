package exercicio.bolo;

public class LojaDeBolos {

    public static void main (String[] args) {

        Bolo boloSimples = new BoloSimples("Morango", false);

        boloSimples.exibirDetalhes();

        //TODO instancie e exiba os detalhes de um exercicio.bolo recheado
        Bolo boloRecheado = new BoloRecheado("Chocolate", "Brigadeiro");

        boloRecheado.exibirDetalhes();

        //TODO instancie e exiba os detalhes de um exercicio.bolo decorado
        Bolo boloDecorado = new BoloDecorado(
                "Morango","Inside Out", true);

        boloDecorado.exibirDetalhes();

        BoloPersonalizado boloPersonalizado = new BoloPersonalizado(
                false, false, true);

        boloPersonalizado.exibirDetalhes();
    }
}
