public class MainDoWhile {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        numeros[0] = 10;
        numeros[1] = 11;
        numeros[2] = 12;
        numeros[3] = 13;
        numeros[4] = 14;
        numeros[5] = 15;

        int i = 0;

        // para cenários onde o código tem que ser executado e pode entrar em loop
        do{ // sempre executa o bloco de código pelo menos uma vez
            System.out.println(numeros[i]);
            i++;
        }while (false);
    }
}
