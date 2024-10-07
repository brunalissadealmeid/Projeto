package POO;

public class MeuCachorro extends Cachorro{
    public static void main (String[] args) {

        Cachorro meuCachorro1 = new Cachorro();
        meuCachorro1.nome = "Gaia";
        meuCachorro1.raca = "Bernese";
        meuCachorro1.idade = 1;
        meuCachorro1.peso = 22;

        meuCachorro1.latir();
        meuCachorro1.comer();
        meuCachorro1.caminhar();
    }
}
