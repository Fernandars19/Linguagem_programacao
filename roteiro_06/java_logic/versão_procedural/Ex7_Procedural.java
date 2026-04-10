package roteiro_06.versão_procedural;

import java.util.Scanner;

public class Ex7_Procedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota (0-100): ");
        int nota = sc.nextInt();

        // Decisão sequencial
        if (nota >= 90) {
            System.out.println("Categoria: A");
        } else if (nota >= 80) {
            System.out.println("Categoria: B");
        } else if (nota >= 70) {
            System.out.println("Categoria: C");
        } else if (nota >= 60) {
            System.out.println("Categoria: D");
        } else {
            System.out.println("Categoria: E");
        }

        sc.close();
    }
}
