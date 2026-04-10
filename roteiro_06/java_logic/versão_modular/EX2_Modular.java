package roteiro_06.versão_modular;

import java.util.Scanner;

public class EX2_Modular {
    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EX2_Modular programa = new EX2_Modular();

        System.out.print("Digite a base do retângulo: ");
        double b = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double h = sc.nextDouble();

        // Chamamos a função e guardamos o resultado em uma variável
        double resultado = programa.calcularAreaRetangulo(b, h);

        System.out.println("A área do retângulo é: " + resultado);

        sc.close();
    }
}
