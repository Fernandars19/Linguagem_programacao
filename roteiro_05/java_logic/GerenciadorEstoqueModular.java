package roteiro_05;

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciadorEstoqueModular {
    public static String verificar_estoque_critico(int quantidade){
        if(quantidade <5){
            return "[reposição necessaria]";
        }return ""; //retorna vazio se nao precisar de reposição.
    }
public static void cabecalho(String[] args) {
    System.out.println("===============================================================");//personalização
    System.out.println("SORVETERIA DO DENER - MVP FINALIZADO");
    System.out.println("=========================================================");
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<Integer>quantidades = new ArrayList<>();

    cabecalho(args);
    for (int i = 0; i < 3; i++) {
        System.out.print("Insumo:");
        nomes.add(sc.nextLine());
        System.out.print("Quantidade:");
        quantidades.add(sc.nextInt());
        sc.nextLine();
    }
    System.out.println("-----RELATORIO DE PROCESSAMENTO-----");
    int i =0;
    while(i<nomes.size()){
        String nome = nomes.get(i);
        int qtd = quantidades.get(i);

        //verificação
        String aviso = verificar_estoque_critico(qtd);

        System.out.println("item:"+ nome + "| qtd:"+ qtd + aviso);
        i++;
    }
    sc.close();
}
}
