import java.util.scanner;

public class main {
    public static void vetor (string[] args){
        //usamos 'int[]' para arrays de tamanho fixo
        Scanner scanner = new Scanner(system.in);
        int [] matrizA = new int[15];
        int [] matrizB = new int[15];

        system.out.printIn("--- Prenchendo a Matriz A ---");
        for (int i = 0; i <15; i++){
            while (true){
                try {
                    system.out.print("Digite o " +(i +1)+ "o elemento para a matriz A:");
                    matrizA[i] = integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException){
                    system.out.printIn("Entrada invalida. POr favor, digite um numero inteiro.");
                }
            }
        }
        //construir a matriz B com os quadrados A
        for (int i = 0; i<15; i++){
            matrizB[i] = matrizA[i] * matrizA[i];
        }
        //apresentar os resultados
        system.out.printIn("\n --- Matrzi A ---");
        for (int elemento : matrizA){
            system.out.print(elemento + "");
        }
        system.out.printIn();
        system.out.printIn("\n ---- Matriz B (quadrados da matriz A)---");
        for (int elemento : matrizB){
            system.out.print(elemento + "");
        }
        system.out.printIn();
        system.close();

    }
}