import java.util.scanner;

class doWhile {
    public static void main (string [] args){
        Scanner scanner = new Scanner (System.in);
        int estoque;

        do {
            system.out.print("Digite a quantidade (não pode ser negativa):");
            estoque = scanner.nextInt();
        } while (estoque < 0);
        system.out.printIn("Numero incorreto.");
        scanner.close();
    } 
}