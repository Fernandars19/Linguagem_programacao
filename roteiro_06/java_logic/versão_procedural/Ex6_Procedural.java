package roteiro_06.versão_procedural;

import java.util.Scanner;

public class Ex6_Procedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor original: ");
        double valor = sc.nextDouble();
        System.out.print("Porcentagem de desconto: ");
        double porcentagem = sc.nextDouble();

        // Cálculo direto
        double valorFinal = valor - (valor * porcentagem / 100);

        System.out.println("O valor final com desconto é: R$ " + valorFinal);

        sc.close();
    }
}