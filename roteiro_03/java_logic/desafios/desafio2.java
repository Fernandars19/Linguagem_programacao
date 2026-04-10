package roteiro_03.java_logic.desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        while (num <= 10) {
            System.out.print("Digite um numero:");
            num = sc.nextInt();   
        }
        System.out.print("Obrigado por participar");
        sc.close();   

    }
    
}
