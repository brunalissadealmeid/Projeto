package POO;

public class Livro {

    String titulo;
    String autor;
    int numeroPaginas;

    void abrir() {
        System.out.println("Você abriu o livro" + titulo + ".");
    }

    void folhear(int pagina) {
        System.out.println("Você está na página" + pagina + ".");
    }

    void fechar() {
        System.out.println("Você fechou o livro.");
    }
}
