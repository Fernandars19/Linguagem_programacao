package roteiro_06.versão_modular;

import java.util.Scanner;

public class EX1_Modular {

    // Versão 2: Método (Função) que executa a lógica
    public static void verificarParidade(int n) {
        if (n % 2 == 0) {
            System.out.println("O número " + n + " é PAR.");
        } else {
            System.out.println("O número " + n + " é ÍMPAR.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // O programa principal apenas lê o dado e delega a tarefa para a função
        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = sc.nextInt();

        // Chamada da função
        verificarParidade(numeroDigitado);

        sc.close();
    }
}
