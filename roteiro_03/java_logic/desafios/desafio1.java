package roteiro_03.java_logic.desafios;

import java.util.ArrayList;

public class desafio1 {
    public static void main(String[] args) {
        System.out.println("---- Listagem de numeros----");

        for (int i = 1; i <= 10; i++) { 
            System.out.println(""+ i);
        }

        System.out.println("----Listagem de nomes----");
        String[] nomes = {"fernanda","julia","guilherme","davi","rodolfo"};
        
        for (String nome : nomes) {
            System.out.println("" + nome);
        }
        
    }
    
}
