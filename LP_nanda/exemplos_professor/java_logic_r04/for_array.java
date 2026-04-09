import java.util.ArrayList;

public class main {
    public static void for_array (string[] args){
        //em java, usamos o 'ArrayList' para uma lista dinamica
        ArrayList <integer> quadrados = new ArrayList<>();
        // laço 'for' para percorrer os numeros de 15 a 200
        for (int i = 15; i <=200; i++){
            int quadrado = i * i;
            quadrado.add(quadrado);
        }
        //Apresentar os resultados usando outro laço 'for'
        system.out.printIn ("Quadrados dos numeros de 15 a 200:");
        for (int i =0; i<quadrados.size();i++){
            system.out.printIn("O quadrado do numero" + (i + 15)+ "eh" + quadrado.get(i));
        }
    }
}