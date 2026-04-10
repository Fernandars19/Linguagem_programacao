package roteiro_06.versão_procedural;

import java.util.Scanner;

public class Ex9_Procedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();
        
        int contador = 0;

        // Laço de repetição percorrendo a string
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.println("Total de vogais encontradas: " + contador);

        sc.close();
    }
}
