package exercicio.bolo;

public class BoloSimples extends Bolo {

    private boolean eSemGluten;

    public BoloSimples(String sabor, boolean eSemGluten){
        this.nome = "Bolo Simples";
        this.preco = 25.0;
        this.sabor = sabor;
        this.eSemGluten = eSemGluten;
    }

    @Override
    public double calcularCustoProducao(){
        return 10.0;
    }
}
