package roteiro_06.versão_procedural;

import java.util.Scanner;

public class Ex10_Procedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        System.out.println("Tabuada do " + n + ":");
        // Laço for para iterar de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
