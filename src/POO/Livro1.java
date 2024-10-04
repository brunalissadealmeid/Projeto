package POO;

public class Livro1 extends Livro{
    public static void main (String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Todas as Suas (Im)Perfeições";
        livro1.autor = "Cooleen Hoover";
        livro1.numeroPaginas = 304;

        livro1.abrir();
        livro1.folhear(23);
        livro1.fechar();
    }
}
