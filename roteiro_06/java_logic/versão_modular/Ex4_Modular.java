package roteiro_06.versão_modular;

import java.util.Scanner;

public class Ex4_Modular {
    // Método sem static (Modular)
    public String gerarMensagem(String nome, int idade) {
        return "Olá " + nome + ", você tem " + idade + " anos. Seja bem-vindo!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Instanciando para não usar static no método acima
        Ex4_Modular app = new Ex4_Modular();

        System.out.print("Nome: ");
        String n = sc.nextLine();
        System.out.print("Idade: ");
        int i = sc.nextInt();

        System.out.println(app.gerarMensagem(n, i));
        sc.close();
    }
}
