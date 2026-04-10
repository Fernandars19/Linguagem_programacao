package roteiro_06.versão_modular;

import java.util.Scanner;

public class Ex9_Modular {
    public int contarVogais(String texto) {
        int total = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) total++;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex9_Modular app = new Ex9_Modular();

        System.out.print("Frase: ");
        String f = sc.nextLine();

        System.out.println("Vogais: " + app.contarVogais(f));
        sc.close();
    }
}
