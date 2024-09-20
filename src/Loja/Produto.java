package Loja;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> produtos = new HashMap<>();
        produtos.put(1, "Notebook");
        produtos.put(2, "Smartphone");
        produtos.put(3, "Televisão");
        produtos.put(4, "Fone de Ouvido");
        produtos.put(5, "Câmera Digital");

        Map<Integer, Double> precos = new HashMap<>();
        precos.put(1, 3500.00);
        precos.put(2, 2500.00);
        precos.put(3, 4000.00);
        precos.put(4, 200.00);
        precos.put(5, 2800.00);


        Map<Integer, Integer> compras = new HashMap<>();
        //Exemplo:
        // compras.put(1,10) <- chave 1 do Notebook, quantidade comprada seria 10
        // compras.get(1) vai retornar 10, pq 10 eh o valor, sendo 1 a chave
        // se eu tenho um objeto do tipo Map.Entry<Integer, Integer> com nome produtoQueEstouComprando por exemplo,
        // produtoQueEstouComprando.getKey() vai retornar a chave do produto, e produtoQueEstouComprando.getValue() vai
        // retornar a quantidade comprada daquele produto

        //Pedir pro usuario os numeros dos produtos que eles quer adicionar no carrinho
        //Mostrar o valor final
        boolean continuarPrograma = true;
        Double somaTotal = 0.0;
        while (continuarPrograma) {
            System.out.println("1. Adicionar Produto na Lista de Compras");
            System.out.println("2. Remover Produto na Lista de Compras");
            System.out.println("3. Verificar Lista de Compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    boolean continuarAdicionar = true;
                    while (continuarAdicionar) {
                        for (Map.Entry<Integer, String> p : produtos.entrySet()) {
                            System.out.printf("%s - %s: R$ %.2f %n", p.getKey(), p.getValue(), precos.get(p.getKey()));
                        }

                        System.out.println("Digite o número do produto que quer adicionar, ou 0 para nenhum");
                        opcao = scanner.nextInt();

                        if (opcao == 0) {
                            continuarAdicionar = false;
                            continue;
                        } else if (opcao < 0 || opcao > produtos.size())
                            System.out.printf("Você digitou um número inválido %n%n%n");
                        else {
                            System.out.printf("Voce escolheu o produto %s %n", produtos.get(opcao));

                            if (compras.get(opcao) != null) {
                                int quantidade = compras.get(opcao);
                                compras.put(opcao, quantidade + 1);
                            } else {
                                compras.put(opcao, 1);
                            }

                            System.out.printf("Lista de compras atual: %n");

                            for (Map.Entry<Integer, Integer> c : compras.entrySet()) {
                                System.out.printf("%s - %s unidades %n", produtos.get(c.getKey()), c.getValue());
                            }
                            System.out.printf("%n%n%n");
                            continuarAdicionar = false;
                        }
                    }
                    break;
                case 2:
                    if (compras.isEmpty()) {
                        System.out.println("A lista de Compra Atual está vazia! \n\n ");
                        break;
                    }

                    boolean continuarRemover = true;
                    while (continuarRemover) {
                        System.out.println("Lista de Compra Atual: ");
                        for (Map.Entry<Integer, Integer> c : compras.entrySet()) {
                            System.out.printf("%s - %s : %s unidades %n", c.getKey(), produtos.get(c.getKey()), c.getValue());
                        }

                        System.out.println("Digite o número do produto que quer remover da lista, ou 0 para nenhum");
                        opcao = scanner.nextInt();

                        if (opcao == 0) {
                            continuarRemover = false;
                        } else if (!compras.containsKey(opcao))
                            System.out.printf("Você digitou o numero de um produto que nao esá na sua lista de compras %n%n%n");
                        else {
                            System.out.printf("Voce escolheu o produto %s para remover%n", produtos.get(opcao));

                            if (compras.get(opcao) != null) {
                                int quantidade = compras.get(opcao);

                                if (quantidade == 1)
                                    compras.remove(opcao);
                                else
                                    compras.put(opcao, quantidade - 1);
                            }
                            continuarRemover = false;
                        }
                    }
                    break;
                case 3:
                    if (compras.isEmpty())
                        System.out.println("A lista de Compra Atual está vazia! \n\n ");
                    else {
                        System.out.println("Lista de Compra Atual: ");
                        for (Map.Entry<Integer, Integer> c : compras.entrySet()) {
                            System.out.printf("%s - %s unidades %n", produtos.get(c.getKey()), c.getValue());
                        }
                    }
                    break;
                case 4:
                    continuarPrograma = false;

                    for (Map.Entry<Integer, Integer> produtoQueEstouComprando : compras.entrySet()) {
                        somaTotal += produtoQueEstouComprando.getValue() * precos.get(produtoQueEstouComprando.getKey());
                    }

                    if (somaTotal > 5000) {
                        double precoComDesconto = somaTotal * 0.90;
                        System.out.printf("O valor era R$%.2f, mas com desconto de 10 por cento, agora é R$%.2f %n", somaTotal, precoComDesconto);
                    } else if (somaTotal > 3000) {
                        double precoComDesconto = somaTotal * 0.95;
                        System.out.printf("O valor era R$%.2f, mas com desconto de 5 por cento, agora é R$%.2f %n", somaTotal, precoComDesconto);
                    } else {
                        System.out.printf("VALOR FINAL: R$ %.2f %n%n%n%n%n", somaTotal);
                    }
                    break;
                default:
                    System.out.printf("Você digitou uma opcao inválida %n%n%n");

            }
        }

       
    }
}



