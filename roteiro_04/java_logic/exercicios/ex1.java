package roteiro_04.exercicios;

public class ex1 {
    public static void main(String[] args) {
        int[] matrizA={2,4,6,8,10,12,14,16};
        int [] matrizB = new int[8];

        for (int i = 0; i < matrizA.length; i++) {
            matrizB[i] = matrizA[i]*3;
            
        }
        System.out.println("---Matrzi B(multiplos de 3 da matriz A)---");
        for (int i = 0; i < matrizB.length; i++) {
            System.out.println("Posição["+ i +"]"+ matrizB[i]);//

            
        }

    }
    
}
