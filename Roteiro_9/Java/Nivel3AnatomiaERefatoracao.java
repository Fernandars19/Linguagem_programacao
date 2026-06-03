import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Nivel3AnatomiaERefatoracao {
    public static void main(String[] args) {
        String nomeArquivo = "dados_financeiros.json";
        File arquivo = new File(nomeArquivo);
        
        try {
            FileReader reader = new FileReader(arquivo);
            System.out.println("Arquivo lido com sucesso.");
            reader.close();
            
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Aviso: O arquivo '" + nomeArquivo + "' não foi encontrado.");
            System.out.println("Iniciando Fallback: Criando arquivo com estrutura padrão...");
            
            try (FileWriter writer = new FileWriter(arquivo)) {
                writer.write("{\n  \"saldo_inicial\": 0.0,\n  \"status\": \"novo\"\n}");
                System.out.println("Fallback concluído! Arquivo '" + nomeArquivo + "' gerado com sucesso.");
            } catch (IOException ioException) {
                System.out.println("Falha crítica ao tentar criar o arquivo padrão.");
            }
            
        } catch (IOException e) {
            System.out.println("Ocorreu um erro geral de I/O: " + e.getMessage());
        }
    }
}
