package pessoa;

import pessoa.Pessoa;

public class MainPessoa {

    public static void main(String[] args) { //método = ação = execução de código

        Pessoa andre = new Pessoa(); //crio uma pessoa
        // objeto = instancia

        andre.nome = "Andre";
        andre.idade = 120;
        andre.altura = 1.99;
        andre.corCabelo = "platinado";

        andre.pintarCabelo("azul");

        System.out.println(andre.nome);
        System.out.println(andre.idade);
        System.out.println(andre.altura);
        System.out.println(andre.corCabelo);

        Pessoa pedro = new Pessoa(); //crio uma pessoa

        pedro.nome = "Pedro";
        pedro.idade = 110;
        pedro.altura = 2.50;
        pedro.corCabelo = "prata";
//
//        System.out.println(pedro.nome);
//        System.out.println(pedro.idade);
//        System.out.println(pedro.altura);
//        System.out.println(pedro.corCabelo);

        andre = pedro; // pedro e andre tem o mesmo objeto na memória

        pedro.nome = "Pedrão";

        System.out.println("Nome andre "+ andre.nome);
        System.out.println("Nome pedro "+ pedro.nome);

    }
}