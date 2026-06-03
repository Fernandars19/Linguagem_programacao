public class amendoim {

    String nome;
    int quantidade;
    Integer mesValidade; 

    public amendoim(String nome, int quantidade, int mesValidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.mesValidade = null; 
        setMesValidade(mesValidade); 
    }

    public void setMesValidade(int mes) {

        if (mes >= 1 && mes <= 12) {
            this.mesValidade = mes;
        } else {
            System.out.println("ERRO: Mês de validade (" + mes + ") inválido. O valor deve estar entre 1 e 12.");
        }
    }

    public boolean estaValido(int mesAtual) {
        // Lógica: Se o mês de validade for menor que o mês atual, está vencido
        if (this.mesValidade != null && this.mesValidade < mesAtual) {
            System.out.println("ALERTA: Risco de Amendoim Murcho! Produto Vencido");
            return false;
        }
        return true;
    }
}