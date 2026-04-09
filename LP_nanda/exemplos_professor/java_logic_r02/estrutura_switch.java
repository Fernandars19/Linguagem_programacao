import java.util.scanner;

public class estrutura_switch{
    public static void main (string [] args){
        Scanner scanner = new scanner(system.in);
        system.out.print("Digite o código de status (1 - disponivel, 2 - Reposição, 3 -descontinuado):");
        int codigo_status = scanner.nextInt();

        switch (codigo_status){
            case 1:
                system.out.printIn("Status: Disponivel:");
                break;
            case 2:
                system.out.printIn("Status: em reposição:");
                break;
            case 3:
                system.out.printIn("Status: Descontinuado:");
                break;
            case 4:
                system.out.printIn("Código de status inválido.");

        }
        scanner.close();
    }
}