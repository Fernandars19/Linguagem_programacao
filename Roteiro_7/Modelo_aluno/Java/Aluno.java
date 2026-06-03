public class Aluno {
    //atributos
    String nome;
    int idade;
    int nota;

    public Aluno (String nome, int idade, int nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    public String Estudar(){
        return nome + " está estudando para prova ";
    }
    public String fazerProva(){
        return nome + " está fazendo uma prova ";
    }
    public static void main (String[]args){
        Aluno Aluno1 = new Aluno("Guilherme", 21, 4);
        Aluno Aluno2 = new Aluno("Julia", 21, 2);

        //acessando os atributos
        System.out.println("Nome: " + Aluno1.nome + " , idade: " + Aluno1.idade + " anos " + " , A nota dele é: " + Aluno1.nota);
        System.out.println("Nome: " + Aluno2.nome + " , idade: " + Aluno2.idade + " anos " + " , A nota dela é: " + Aluno2.nota);

        System.out.println(Aluno1.Estudar());
        System.out.println(Aluno2.fazerProva());
    }
}
