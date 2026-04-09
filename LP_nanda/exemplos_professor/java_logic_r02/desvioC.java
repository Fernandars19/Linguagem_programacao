import java.util.Scanner;
public class desvioC {
    public static void main (string[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        if (quantidade < 1){
            System.out.printIn("Status: Em falta.");
        } else if (quantidade < 5 ) {
            system.out.printIn("Status: Alerta de estoque baixo.");
        } else {
            system.out.printIn("Status: Estoque OK.");
        }
        scanner.close();
    }
}
