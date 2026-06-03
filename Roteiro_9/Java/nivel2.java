import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class nivel2 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("log_sistema.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            
            printWriter.println("AUDITORIA: Saída de 20 unidades de Pote Chocolate 2L realizada.");
            System.out.println("Dados de movimentação gravados com sucesso no log.");
            
        } catch (IOException e) {
            System.out.println("Erro ao interagir com o arquivo de log: " + e.getMessage());
        } finally {
            System.out.println("Rotina de persistência finalizada, recursos liberados.");
        }
    }
}