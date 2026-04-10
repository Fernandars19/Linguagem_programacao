import java.util.Scanner;
import java.util.Locale;

public class roi {
    public static void main (String[] arg){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("--- Calculo do ROI em JAVA ---");

    System.out.print("Digite o valor do ganho:");
    Double ganho = sc.nextDouble();

    System.out.print("Digite o valor de investimento:");
    Double invest = sc.nextDouble();

    if (invest == 0){
        throw new IllegalArgumentException("Investimento deve ser maior que zero");
        }

    Double roi = (ganho - invest)/invest;

    System.out.printf("o calculo do ROI é: %.2f%%\n", roi*100);

    }
}