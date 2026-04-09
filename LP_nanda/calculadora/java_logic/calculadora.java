import java.util.Scanner; //Importa a classe para leitura de dados
import java.util.Locale; //importa para garantir o uso do ponto decimal em vez de vírgula

public class calculadora {
    public static void main(String[] args){
    //configura o ponto como separador decimal
    Locale.setDefault(Locale.US);

    //passo 1: Scanner para ler a entrada do teclado
    Scanner sc = new Scanner(System.in);

    // passo 2: Entrada de dados e declaração das variaveis
    System.out.printIn(x:"--- Calculadora de negocios (JAVA)---");

    System.out.print(s:"Digite o primeiro valor:");
    double num1 = sc.nextDouble();

    System.out.print(s:"Digite o segundo valor:");
    double num2 = sc.nextDouble();

    //passo 3: processamento 
    double soma = num1 + num2;
    double sub = num1 - num2;
    double mult = num1 * num2;
    double div = num1 / num2;

    //passo 4: saída de resultados
    System.out.printIn(format: "Soma: %.2f%n", soma);
    System.out.printIn(format: "Subtração: %.2f%n", sub);
    System.out.printIn(format: "Multiplicação: %.2f%n", mult);
    System.out.printIn(format: "Divisão: %.2f%n", div);

    sc.close(); // fechar scanner
    }
}
