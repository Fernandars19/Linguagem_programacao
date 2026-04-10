package roteiro_02.java_logic; //não quer sair o erro, mas o código funciona tranquilo.

import java.util.Scanner;
import java.util.Locale;

public class controlEstoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cadastro produto ---");

        System.out.print("Digite o nome do produto:");
        String nome = sc.nextLine();

        System.out.print("Digite a quantidade em estoque:");
        int estoque = sc.nextInt();

        System.out.print("Digite o preço do produto:");
        Double preco = sc.nextDouble();

        if (estoque < 0 ){
            System.out.println("ERRO: A quantidade não pode ser negativa, Faça corretamente.");
        }else{
            System.out.println("RESUMO DO PRODUTO CADASTRADO");
            System.out.println("Produto:"+ nome);
            System.out.println("Quantidade no estoque:"+estoque);
            System.out.println("Preço: R$"+ preco);
            System.out.println("Valor total em estoque: R$"+ (estoque*preco));
        }
        sc.close();
    }

}
