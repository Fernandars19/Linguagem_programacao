package roteiro_03.java_logic.desafioFinal;//esse cacete não quer tirar o erro mas ta rodando suave.

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciadorEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        int opcao =0;

        while (opcao!=3){
             System.out.println("\n--- MENU SORVETERIA ---");
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Listar produtos em estoque");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            if (opcao == 1){ //não é erro é sugestão do vscode
                // 2. Funcionalidade de Adicionar
                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();

                int qtd = -1;
                while (qtd < 0) { // Validação de quantidade negativa
                    System.out.print("Quantidade: ");
                    qtd = sc.nextInt();
                    if (qtd < 0) System.out.println("Erro: A quantidade não pode ser negativa!");
                }

                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                // Salvando nas listas
                nomes.add(nome);
                quantidades.add(qtd);
                precos.add(preco);
                System.out.println("Produto cadastrado com sucesso!");

            } else if (opcao == 2) {
                // 3. Funcionalidade de Listar com laço for
                System.out.println("\n--- PRODUTOS EM ESTOQUE ---");
                if (nomes.isEmpty()) {
                    System.out.println("O estoque está vazio.");
                } else {
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println("Produto: " + nomes.get(i) + 
                                           " | Qtd: " + quantidades.get(i) + 
                                           " | Preço: R$ " + precos.get(i));
                    }
                }
            } else if (opcao == 3) {
                // 4. Condição de Saída
                System.out.println("Saindo... Obrigado por usar o sistema!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}

