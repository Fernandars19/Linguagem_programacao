package roteiro_06.versão_modular;

import java.util.Scanner;

public class Ex10_Modular {
    // Void pois apenas imprime, não retorna valor
    public void gerarTabuada(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex10_Modular app = new Ex10_Modular();

        System.out.print("Número: ");
        int num = sc.nextInt();

        app.gerarTabuada(num);
        sc.close();
    }
}
