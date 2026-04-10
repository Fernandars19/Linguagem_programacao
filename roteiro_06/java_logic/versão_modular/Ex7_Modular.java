package roteiro_06.versão_modular;

import java.util.Scanner;

public class Ex7_Modular {
    public char classificar(int nota) {
        if (nota >= 90) return 'A';
        if (nota >= 80) return 'B';
        if (nota >= 70) return 'C';
        if (nota >= 60) return 'D';
        return 'E';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex7_Modular app = new Ex7_Modular();

        System.out.print("Nota (0-100): ");
        int n = sc.nextInt();

        System.out.println("Categoria: " + app.classificar(n));
        sc.close();
    }
}
