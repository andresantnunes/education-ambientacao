import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // String é a classe e o nome é um objeto
        String nome = "";
        Scanner scanner = new Scanner(System.in);

        // .equals existe para todos os objetos no Java
        // eles herdam do Object -> classe interna do java
        while(!nome.equals("FIM")){ // enquanto nome não é igual a "FIM", execute o código
            nome = scanner.next();

            System.out.println(nome);
        }
        scanner.close();

        System.out.println("******");

    }
}