package roteiro_06.versão_procedural;

import java.util.Scanner;

public class EX2_Procedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base:");
        double base = sc.nextDouble();

        System.out.print("Digite o valor da altura:");
        double altura = sc.nextDouble();

        double area = base * altura;
        
        System.out.println("A Area do retangulo é:" + area);
        sc.close();
    }
    
}
