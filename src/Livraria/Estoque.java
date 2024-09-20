package Livraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        List<String> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Verificar Disponibilidade");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String adicionarLivro = scanner.nextLine();
                    if (estoque.contains(adicionarLivro)) {
                        System.out.println("O livro já está disponível.");
                    } else {
                        estoque.add(adicionarLivro);
                        System.out.println("Livro adicionado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do livro: ");
                    String removerLivro = scanner.nextLine();
                    if (estoque.contains(removerLivro)) {
                        estoque.remove(removerLivro);
                        System.out.println("Livro removido com sucesso!");
                    } else {
                        System.out.println("O livro não está disponível.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do livro: ");
                    String livroVerificar = scanner.nextLine();
                    if (estoque.contains(livroVerificar)) {
                        System.out.println("O livro está disponível no estoque.");
                    } else {
                        System.out.println("O livro não está disponível no estoque.");
                    }
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
