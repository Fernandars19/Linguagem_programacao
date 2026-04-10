package roteiro_06.versão_procedural;

import java.util.Scanner;

public class Ex8_Procedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os três lados:");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();

        if (l1 == l2 && l2 == l3) {
            System.out.println("O triângulo é Equilátero.");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triângulo é Escaleno.");
        }

        sc.close();
    }
}
