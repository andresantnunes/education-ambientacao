import java.util.Scanner;

public class MainEntradaDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Entrada de dados pelo Console

        double entradaDouble = scanner.nextDouble(); // o scanner vai ler o próximo double que eu digitar no console
        // detalhe: escreva com ","

        System.out.println(entradaDouble);
    }

}
