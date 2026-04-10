package roteiro_06.versão_modular;

import java.util.Scanner;

public class Ex8_Modular {
    public String classificarTriangulo(int a, int b, int c) {
        if (a == b && b == c) return "Equilátero";
        if (a == b || a == c || b == c) return "Isósceles";
        return "Escaleno";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex8_Modular app = new Ex8_Modular();

        System.out.println("Digite os 3 lados:");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();

        System.out.println("Tipo: " + app.classificarTriangulo(l1, l2, l3));
        sc.close();
    }
}
