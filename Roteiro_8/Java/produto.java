public class produto {
    private String nome;
    private int estoqueReal;
    private int estoqueIdeal;

    public produto(String nome, int estoqueReal, int estoqueIdeal) {
        this.nome = nome;
        this.estoqueReal = estoqueReal;
        this.estoqueIdeal = estoqueIdeal;
    }

    public boolean verificarNecessidadeCompra() {
        double limiteMinimo = this.estoqueIdeal * 0.20;
        return this.estoqueReal < limiteMinimo;
    }

    public void registrarSaida(int quantidade) {

        if (quantidade <= this.estoqueReal) {
            this.estoqueReal -= quantidade;
            System.out.println("Venda realizada! Novo saldo de " + this.nome + ": " + this.estoqueReal);
        } else {
            System.out.println("ERRO: Operação Bloqueada para " + this.nome + "!");
            System.out.println("Risco de Estoque Negativo. Saldo disponível: " + this.estoqueReal);
        }
    }
}