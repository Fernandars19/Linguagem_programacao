package roteiro_06.versão_modular;

import java.util.Scanner;

public class Ex6_Modular {
    public double aplicarDesconto(double valor, double porc) {
        return valor - (valor * porc / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex6_Modular app = new Ex6_Modular();

        System.out.print("Valor: ");
        double v = sc.nextDouble();
        System.out.print("Desconto (%): ");
        double d = sc.nextDouble();

        System.out.println("Valor final: " + app.aplicarDesconto(v, d));
        sc.close();
    }
}
