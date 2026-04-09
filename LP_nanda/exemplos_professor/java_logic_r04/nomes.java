import java.util.Scanner;

public class nomes {
    public static void main (String[] args){
        Scanner scanner = new scanner (system.in);
        //usamos 'string[]' para arrays de strings de tamanho fixo
        String[] matrizA = new string[10];

        system.out.printIn("--- Digite 10 nomes ---");
        for (int i =0; i<10; i++){
            system.out.print("digite o "+(i+1)+ "o nome:");
            matrizA[i] = scanner.nextLine();
        }
        //apresentar os nomes
        system.out.printIn("\n --- Nomes Inseridos ---");
        for (string nome: matrizA){
            system.out.printIn(nome);
        }
        scanner.close();

    }
}