package Supermercado;
import java.util.HashMap;
import java.util.Map;

public class Supermercado {
    public static void main(String[] args) {
        // Map com as quantidades que você deseja comprar
        Map<String, Integer> listaDeCompras = new HashMap<>();
        listaDeCompras.put("Macarrao", 3); // 3 pacotes
        listaDeCompras.put("Achocolatado", 2); // 2 latas
        listaDeCompras.put("Cafe", 1); // 1 pacote
        listaDeCompras.put("Pao de Forma", 4); // 4 pacotes
        listaDeCompras.put("Aveia", 2); // 2 pacotes
        listaDeCompras.put("Duzia de Ovos", 1); // 1 dúzia

        // Map com os preços dos produtos no Supermercado 1
        Map<String, Double> precosSupermercado1 = new HashMap<>();
        precosSupermercado1.put("Macarrao", 3.50);
        precosSupermercado1.put("Achocolatado", 7.50);
        precosSupermercado1.put("Cafe", 12.00);
        precosSupermercado1.put("Pao de Forma", 5.00);
        precosSupermercado1.put("Aveia", 4.00);
        precosSupermercado1.put("Duzia de Ovos", 8.00);

        // Map com os preços dos produtos no Supermercado 2
        Map<String, Double> precosSupermercado2 = new HashMap<>();
        precosSupermercado2.put("Macarrao", 4.00);
        precosSupermercado2.put("Achocolatado", 8.00);
        precosSupermercado2.put("Cafe", 11.50);
        precosSupermercado2.put("Pao de Forma", 4.50);
        precosSupermercado2.put("Aveia", 4.20);
        precosSupermercado2.put("Duzia de Ovos", 8.50);

        // Map com os preços dos produtos no Supermercado 3
        Map<String, Double> precosSupermercado3 = new HashMap<>();
        precosSupermercado3.put("Macarrao", 4.20);
        precosSupermercado3.put("Achocolatado", 7.80);
        precosSupermercado3.put("Cafe", 13.00);
        precosSupermercado3.put("Pao de Forma", 4.80);
        precosSupermercado3.put("Aveia", 4.00);
        precosSupermercado3.put("Duzia de Ovos", 7.90);

        for(Map.Entry<String, Integer> produtoDaListaDeCompras : listaDeCompras.entrySet()) {
            String nomeProduto = produtoDaListaDeCompras.getKey();
            double precos1 = precosSupermercado1.get(nomeProduto);
            double precos2 = precosSupermercado2.get(nomeProduto);
            double precos3 = precosSupermercado3.get(nomeProduto);

            System.out.println(nomeProduto + ": ");
            if (precos1 < precos2 && precos1 < precos3) {
                System.out.println("O produto do supermercado 1 é mais barato.");
            } else if (precos2 < precos1 && precos2 < precos3) {
                System.out.println("O produto do supermercado 2 é mais barato.");
            } else {
                System.out.println("O produto do supermercado 3 é mais barato.");
            }
        }
        /*double total1 = 0.0;
        double total2 = 0.0;
        double total3 = 0.0;
        for (Map.Entry<String, Integer> produtoDaListaDeCompras : listaDeCompras.entrySet()){
            total1 += produtoDaListaDeCompras.getValue() * precosSupermercado1.get(produtoDaListaDeCompras.getKey());
            total2 += produtoDaListaDeCompras.getValue() * precosSupermercado2.get(produtoDaListaDeCompras.getKey());
            total3 += produtoDaListaDeCompras.getValue() * precosSupermercado3.get(produtoDaListaDeCompras.getKey());
        }

        System.out.println("O valor total do supermercado 1 é: " + total1);
        System.out.println("O valor total do supermercado 2 é: " + total2);
        System.out.println("O valor total do supermercado 3 é: " + total3);

        if (total1 < total2 && total1 < total3) {
            System.out.println("O supermercado 1 é mais barato.");
        } else if (total2 < total1 && total2 < total3) {
            System.out.println("O supermercado 2 é mais barato.");
        } else {
            System.out.println("O supermercado 3 é mais barato.");
        }*/

    }
}
