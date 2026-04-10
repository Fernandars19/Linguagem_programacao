package roteiro_06.versão_procedural;

import java.util.Scanner;

public class EX3_procedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;

        // 1. Início do laço de repetição
        while (true) {
            System.out.print("Digite uma senha (mínimo 8 caracteres): ");
            senha = sc.nextLine();

            // 2. Verificação direta dentro do laço
            if (senha.length() >= 8) {
                // Se for válida, sai do laço
                break; 
            } else {
                System.out.println("Erro: A senha precisa ter pelo menos 8 caracteres.");
            }
        }

        // 3. Saída final
        System.out.println("Senha validada com sucesso!");
        
        sc.close();
    }
}
