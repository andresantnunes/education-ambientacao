package aluno;

public class Aluno {

    String nome;
    long idade; // 0
    String matricula; // ""
    boolean passou; // nasce com o valor padrão false
    boolean recuperacao;

    public void passou(double nota) {
        if (nota >= 7.0) {
            System.out.println("Aluno passou!");
            this.passou = true;

        } else if (nota >= 5.0) {
            System.out.println("Aludo de Recuperação");
            this.passou = false;
            this.recuperacao = true;

        } else { // não é maior que 5 e não é maior que 7
            System.out.println("Aluno não passou!");
            this.passou = false;

        }
    }

    public void passou2(double nota) {
        if (nota >= 7.0) {
            System.out.println("Aluno passou!");
            this.passou = true;
            return;// para a execução do método e volta ao fluxo anterior

        } else if (nota >= 5.0) {
            System.out.println("Aludo de Recuperação");
            this.passou = false;
            this.recuperacao = true;
            return;
        }

        // não é maior que 5 e não é maior que 7

        if( nota < 5) {
            System.out.println("Aluno não passou!");
            this.passou = false;
        }

    }

    public void passou3(double nota) {
        this.passou = nota >= 7.0;
        this.recuperacao = nota < 7.0 && nota >= 5.0;

    }
}
