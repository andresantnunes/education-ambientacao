public class Main { // contém os códigos Java

    static int inteiroGlobal = 10; // essa variavel é visivel em qualquer lugar da classe Main


    public static void main(String[] args) { // indica o incio do programa Java
//        System.out.println("Hello world!"); // como exibimos dados

        // Variavel => tipo + nome + valor
        int inteiroLocal = 11; // é visivel apenas dentro do método main

        float saldoContaComercial = 10.01f; // numero com ponto flutuante, precisa do f pois o double é o padrão
        double valorProduto = 10.01; // numero com ponto flutuante, é o dobro de bits do float

        byte idade = 127; // 8 bits, -128 até 127
        int numeroInteiro = 123121111; // numeros inteiro, com um limite, é o padrão de inteiros
        long numerosL = 127397129123123123L; // numeros inteiros, dobro de bits do int, precisa ter um "L" no final

        boolean binarioBoolean = true; // só pode ter 2 valores, true ou false
        binarioBoolean = false;

        var a = 10; // não é recomendado, pois é dinamico, assume um tipo
        // nesse caso tipo int
        // vai contra o padrão Java

/*        System.out.println(saldoContaComercial);
        System.out.println(idade);
        System.out.println(valorProduto);
        System.out.println(numerosL);
        System.out.println(binarioBoolean);

        System.out.println(numeroInteiro);*/

        metodoSeparado(); // sai do método main
        // ao executar o metodoSeparado o programa volta a executar o main de onde parou
        System.out.println(inteiroGlobal);
        System.out.println("Pós método");

    }

    public static void metodoSeparado(){ // executa o metodoSeparado linha a linha
        int inteiroLocal = 12;

        inteiroGlobal = 20; // muda o valor do globa para a classe toda
        System.out.println(inteiroGlobal); // escopo global
        System.out.println(inteiroLocal);  // escopo local, que apenas o método pode ver
    }
}