package pessoa;

public class Pessoa {

    //atributos -> Caracteristicas que todas as pessoas compatilham
    public String nome;
    public int idade;
    public double altura;
    public String corCabelo;

    public String pintarCabelo(String corCabelo){
        this.corCabelo = corCabelo;
        return corCabelo;
    }


}
