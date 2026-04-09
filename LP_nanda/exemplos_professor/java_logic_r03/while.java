import java.util.scanner;

public class while {
    public static void main (string [] args){
        system.out.printIn ("\n Adivinhe o numero com o 'while' em Java");
        Scanner scanner = new sacnner(system.in);
        int num_secret = 7;
        int num_dig = 0;

        while (num_dig != num_secret){
            system.out.print("Digite um número:");
            num_dig = scanner.nextInt();
            if (num_dig != num_secret){
                system.out.printIn ("Numero incorreto. Tente novamente.");
            }
        }
        system.out.printIn("Parabéns! Voce acertou!");
        scanner.close();
    }
}