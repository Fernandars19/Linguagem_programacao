package roteiro_06.versão_modular;

import java.util.Scanner;

public class Ex5_Modular {
    public double celsiusParaFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex5_Modular app = new Ex5_Modular();

        System.out.print("Celsius: ");
        double c = sc.nextDouble();

        System.out.println("Fahrenheit: " + app.celsiusParaFahrenheit(c));
        sc.close();
    }
}
