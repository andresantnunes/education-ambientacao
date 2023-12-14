import pessoa.Pessoa;

public class Main {

    public static void main(String[] args) { //método = ação = execução de código
        System.out.println("Hello world!");

        Pessoa pessoa = new Pessoa();
        System.out.println(pessoa);

        pessoa = new Pessoa();
        System.out.println(pessoa);

        pessoa.nome = "Andre";
        System.out.println(pessoa.nome);

    }
}