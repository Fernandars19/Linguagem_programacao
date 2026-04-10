package roteiro_03.java_logic.desafios;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numsecret = 10;
        int palpite = 0;

        System.out.println("----- JOGO DE ADIVINHAÇÃO-----");
        System.out.println("Tente adivinhar o numero secreto!");

        while(palpite!= numsecret){
            System.out.print("Digite seu palpite:");
            palpite = sc.nextInt();
            if (palpite > numsecret){
                System.out.println("TEnte um numero menor!");
            }else if (palpite < numsecret){
                System.out.println("Tente um numeor maior!");
            }
        }
    
        System.out.println("Parabens! voce acertou o numero secreto.");
        sc.close();  
    }
    
}
