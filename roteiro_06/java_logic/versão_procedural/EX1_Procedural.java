package roteiro_06.versão_procedural;
import java.util.Scanner;

public class EX1_Procedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Digite um numero inteiro:");

        int num = sc.nextInt();

        if (num % 2 == 0 ){
            System.out.print("O numero" + num + "é PAR");
        }else {
            System.out.print("O numero" + num + "é IMPAR");
        }
        sc.close();
    }
    
}
