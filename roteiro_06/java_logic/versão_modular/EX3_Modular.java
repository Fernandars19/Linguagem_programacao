package roteiro_06.versão_modular;

import java.util.Scanner;

public class EX3_Modular {

    // Método que retorna True se a senha tiver 8 ou mais caracteres
    public boolean validarSenha(String senha) {
        return senha.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EX3_Modular programa = new EX3_Modular();
        
        String senhaDigitada;
        boolean eValida = false;
        
        while (!eValida) {
            System.out.print("Digite uma senha (mínimo 8 caracteres): ");
            senhaDigitada = sc.nextLine();

            // Usamos a função para verificar
            eValida = programa.validarSenha(senhaDigitada);

            if (!eValida) {
                System.out.println("Senha muito curta! Tente novamente.");
            }
        }

        System.out.println("Senha cadastrada com sucesso!");
        sc.close();
    }
}
