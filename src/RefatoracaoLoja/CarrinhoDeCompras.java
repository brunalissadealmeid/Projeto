package RefatoracaoLoja;

import java.util.Map;

public class CarrinhoDeCompras extends Produto{
        private final Map<Produto, Integer> itens = new HashMap<>();

        public void adicionarProduto(Produto produto) {
            itens.put(produto, itens.getOrDefault(produto, 0) + 1);
            System.out.println(produto.getNome() + " adicionado ao carrinho.");
        }

        public void removerProduto(Produto produto) {
            if (itens.containsKey(produto)) {
                int quantidade = itens.get(produto);
                if (quantidade > 1) {
                    itens.put(produto, quantidade - 1);
                } else {
                    itens.remove(produto);
                }
                System.out.println(produto.getNome() + " removido do carrinho.");
            } else {
                System.out.println(produto.getNome() + " não está no carrinho.");
            }
        }

        public void exibirCarrinho() {
            if (itens.isEmpty()) {
                System.out.println("O carrinho está vazio.");
            } else {
                System.out.println("Carrinho atual:");
                for (Map.Entry<Produto, Integer> item : itens.entrySet()) {
                    System.out.printf("%s - %d unidades%n", item.getKey().getNome(), item.getValue());
                }
            }
        }

        public double calcularTotal() {
            double total = 0;
            for (Map.Entry<Produto, Integer> item : itens.entrySet()) {
                total += item.getValue() * item.getKey().getPreco();
            }
            return total;
        }
    }

