package roteiro_06.versão_procedural;
import java.util.Scanner;
public class EX4_Procedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        // Processamento e Saída direta
        System.out.println("Olá " + nome + ", você tem " + idade + " anos. Seja bem-vindo!");

        sc.close();
    }
}
