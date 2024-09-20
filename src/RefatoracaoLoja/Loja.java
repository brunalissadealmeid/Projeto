package RefatoracaoLoja;

public class Loja {

    protected int ID;
    protected String nome;
    protected double preco;

    public void menuinicial() {
        System.out.println("1. Adicionar Produto na Lista de Compras");
        System.out.println("2. Remover Produto na Lista de Compras");
        System.out.println("3. Verificar Lista de Compras");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");

    }

    public double somaTotal;
        if (somaTotal > 5000) {
            double precoComDesconto = somaTotal * 0.90;
            System.out.printf("O valor era R$%.2f, mas com desconto de 10 por cento, agora é R$%.2f %n", somaTotal, precoComDesconto);
        } else if (somaTotal > 3000) {
            double precoComDesconto = somaTotal * 0.95;
            System.out.printf("O valor era R$%.2f, mas com desconto de 5 por cento, agora é R$%.2f %n", somaTotal, precoComDesconto);
        } else {
            System.out.printf("VALOR FINAL: R$ %.2f %n%n%n%n%n", somaTotal);
        }
    }



