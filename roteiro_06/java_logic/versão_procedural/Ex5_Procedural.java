package roteiro_06.versão_procedural;

import java.util.Scanner;
public class Ex5_Procedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        // Cálculo direto no fluxo
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        sc.close();
    }
}
