package roteiro_03.java_logic.desafios;

import java.util.Scanner;
public class desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaCorreta="1234";
        String senhaDigitada="";

        while(!senhaDigitada.equals(senhaCorreta)){
            System.out.println("Digite a senha para entrar:");
            senhaDigitada=sc.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)){
                System.out.println("Senha incorreta! Tente novamente");
            }
        }
        System.out.println("Login realizado com sucesso!!! Bem-vindo");
        sc.close();
    }
    
}
