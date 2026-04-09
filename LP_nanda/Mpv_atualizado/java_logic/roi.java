import java.util.Scanner;
import java.util.Locale;

public class roi {
    public static void main (string[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.printIn(x:"--- Calculo do ROI em JAVA ---");

    system.out.print(s:"Digite o valor do lucro:");
    double ganho = sc.nextDouble();

    system.out.print(s:"Digite o valor de investimento:");
    double invest = sc.nextDouble();

    if (invest == 0);
        throw new IllegalArgumentException("Investimento deve ser maior que zero");
        }

    if (ganho < 0) {
        throw new IllegalArgumentException("Ganho não pode ser negativo");
        }

    double cal = (num1 + num2)/num2;

    system.out.printIn(format:" O calculo do ROI é:  %.2f%n", cal);

    }
    scanner.close();
}