import java.util.Scanner;

public class MainSwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorValidacao = scanner.next();

        switch (valorValidacao) {
            case "1":
                System.out.println("Valor 1 ebaaa!!");
                break; // para a execução do case
            case "2":
                System.out.println("Valor 2 wwebaaa!!"); // não tem case, então o case 3 tambem será executado ao cair no case 2
            case "3":
                System.out.println("Valor 3 nooo!!");
                break;
            default: // caem valor que são diferentes de 1,2 e 3
                System.out.println("Valor invalido");
        }

        System.out.println("Após Switch case");
    }
}