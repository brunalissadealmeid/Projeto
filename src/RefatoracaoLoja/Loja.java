package RefatoracaoLoja;

class Loja extends Produto {
    private static final Scanner scanner = new Scanner(System.in);
    private final Map<Integer, Produto> produtos = new HashMap<>();
    private final CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    public Loja() {
        inicializarProdutos();
    }

    private void inicializarProdutos() {
        produtos.put(1, new Produto(1, "Notebook", 3500.00));
        produtos.put(2, new Produto(2, "Smartphone", 2500.00));
        produtos.put(3, new Produto(3, "Televisão", 4000.00));
        produtos.put(4, new Produto(4, "Fone de Ouvido", 200.00));
        produtos.put(5, new Produto(5, "Câmera Digital", 2800.00));
    }

    public void exibirMenu() {
        boolean continuarPrograma = true;
        while (continuarPrograma) {
            System.out.println("1. Adicionar Produto no Carrinho");
            System.out.println("2. Remover Produto do Carrinho");
            System.out.println("3. Verificar Carrinho");
            System.out.println("4. Finalizar Compra e Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> adicionarProduto();
                case 2 -> removerProduto();
                case 3 -> carrinho.exibirCarrinho();
                case 4 -> {
                    finalizarCompra();
                    continuarPrograma = false;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private void adicionarProduto() {
        exibirProdutos();
        System.out.println("Digite o número do produto para adicionar ao carrinho ou 0 para voltar ao menu:");
        int idProduto = scanner.nextInt();

        if (idProduto == 0) {
            return;
        }

        Produto produto = produtos.get(idProduto);
        if (produto != null) {
            carrinho.adicionarProduto(produto);
        } else {
            System.out.println("Produto inválido.");
        }
    }

    private void removerProduto() {
        if (carrinho.calcularTotal() == 0) {
            System.out.println("O carrinho está vazio.");
            return;
        }

        exibirProdutos();
        System.out.println("Digite o número do produto para remover do carrinho ou 0 para voltar ao menu:");
        int idProduto = scanner.nextInt();

        if (idProduto == 0) {
            return;
        }

        Produto produto = produtos.get(idProduto);
        if (produto != null) {
            carrinho.removerProduto(produto);
        } else {
            System.out.println("Produto inválido.");
        }
    }

    private void exibirProdutos() {
        System.out.println("Produtos disponíveis:");
        for (Produto produto : produtos.values()) {
            System.out.printf("%d - %s%n", produto.getId(), produto);
        }
    }

    private void finalizarCompra() {
        double total = carrinho.calcularTotal();

        if (total == 0) {
            System.out.println("Seu carrinho está vazio.");
            return;
        }

        if (total > 5000) {
            total *= 0.90;
            System.out.printf("Desconto de 10%% aplicado. Valor final: R$ %.2f%n", total);
        } else if (total > 3000) {
            total *= 0.95;
            System.out.printf("Desconto de 5%% aplicado. Valor final: R$ %.2f%n", total);
        } else {
            System.out.printf("Valor final: R$ %.2f%n", total);
        }
    }

    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.exibirMenu();
    }
}