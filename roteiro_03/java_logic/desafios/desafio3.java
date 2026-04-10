package roteiro_03.java_logic.desafios;

import java.util.Scanner;

public class desafio3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite sua nota:"+ i + ":");
            double nota = sc.nextDouble();
            soma +=nota; 
        }
        double media = soma/5;
        System.out.println("A média final das notas é:"+ media);
        sc.close();
    }

    
}
