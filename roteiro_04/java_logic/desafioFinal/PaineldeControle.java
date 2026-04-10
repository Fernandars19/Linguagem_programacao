package roteiro_04.desafioFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class PaineldeControle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomesInsumos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        System.out.println("--- Cadastro de Inventário - Sorveteria do Dener ---");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome do " + i + "º insumo: ");
            String nome = sc.nextLine();
            
            System.out.print("Digite a quantidade de " + nome + ": ");
            int qtd = sc.nextInt();
            sc.nextLine(); // Limpa o buffer para o próximo nome

            nomesInsumos.add(nome);
            quantidades.add(qtd);
            System.out.println("Item cadastrado!\n");
        }
        System.out.println("----- RELATÓRIO FINAL DE ESTOQUE -----");
        
        for (int i = 0; i < nomesInsumos.size(); i++) {
            String nomeItem = nomesInsumos.get(i);
            int qtdItem = quantidades.get(i);
            String etiqueta = "";

            if (qtdItem < 5) {
                etiqueta = " [REPOSIÇÃO NECESSÁRIA]";
            }

            // Exibição formatada
            System.out.println("Produto: " + nomeItem + " | Estoque: " + qtdItem + " unidades" + etiqueta);
        }

        System.out.println("---------------------------------------");
        sc.close();
    }
}