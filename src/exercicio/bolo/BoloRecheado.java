package exercicio.bolo;

public class BoloRecheado extends Bolo{

    public String tipoRecheio;

    //TODO Faça o Construtor
    public BoloRecheado (String sabor, String tipoRecheio){
        this.nome = "Bolo Simples";
        this.preco = 25.0;
        this.sabor = sabor;
        this.tipoRecheio = tipoRecheio;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Tipo de Recheio: " + tipoRecheio);
    }

    @Override
    public double calcularCustoProducao() {
        return 20;
    }
}
