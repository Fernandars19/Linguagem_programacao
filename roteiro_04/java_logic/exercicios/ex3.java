package roteiro_04.exercicios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int tamanho = 20;

        double[] matrizA = new double[tamanho];
        double[] matrizB = new double[tamanho];
        double[] matrizC = new double[tamanho];

        System.out.println("--- Preencha a Matriz A (20 números) ---");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Matriz A[" + i + "]: ");
            matrizA[i] = sc.nextDouble();
        }

        System.out.println("\n--- Preencha a Matriz B (20 números) ---");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Matriz B[" + i + "]: ");
            matrizB[i] = sc.nextDouble();
        }

        for (int i = 0; i < tamanho; i++) {
            matrizC[i] = matrizA[i] - matrizB[i];
        }

        System.out.println("\n--- Resultado: Matriz C (A - B) ---");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Matriz C[" + i + "] = " + matrizC[i]);
        }

        sc.close();
    }
}

