import java.util.ArrayList;
class array {
    public static void main (string [] args){
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("Fernanda");
        nomes.add("Jonathan");
        nomes.add("Vinicius");

        system.out.printIn("\n interando sobre uma lista em Java:");
        for(String nome: nomes){
            system.out.printIn(nome);
        }

    }
}