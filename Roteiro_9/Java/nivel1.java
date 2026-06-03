import java.util.Scanner;

public class nivel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de produtos vendidos: ");
        
        // Zona de teste para capturar a entrada do usuário
        try {
            String entrada = scanner.nextLine();
            int quantidade = Integer.parseInt(entrada); // Pode lançar NumberFormatException
            
            System.out.println("Processamento concluído com sucesso. Quantidade: " + quantidade);
            
        } catch (NumberFormatException e) {
            // Falhando com graciosidade: oculta o erro técnico (traceback) do usuário final
            System.out.println("Erro: Insira apenas caracteres numéricos.");
        } finally {
            scanner.close();
        }
    }
}
