import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {

        int tamanho = 10;

        int[] numeros = new int[tamanho]; // array que vai de 0 a 9
        // toda vez que temos um new, a variável apontará para um novo espaço na memória

        numeros[0] = 10;
        numeros[1] = 11;
        numeros[2] = 12;
        numeros[3] = 13;

        int tamanhoNovo = 11;
        int[] numerosNovos = new int[tamanhoNovo];

        // tranfere os itens de numeros, começando na posição 0,
        // para os numerosNovos, também começando na posição 0
        // e ele copiará o numero que colocarmos no tamanho
        System.arraycopy(numeros, 0, numerosNovos, 0, tamanho);

//        for (int i = 0; i < tamanho; i++){
//            numerosNovos[i] = numeros[i];
//        }

        numerosNovos[10] = 1011;

        // repetição limitada, já sabemos os valors
        for (int i = 0; i < numerosNovos.length; i++){ // pega o numero total de itens dentro da lista
            // se tem 10 o length retorna 10, o numeros vão de 0 a 9
            System.out.println("Numeros Novos: " +numerosNovos[i]);
        }

        // repetição que não está tão bem definida
        // pode entrar em loop infinito
        int i = 0;
        while ( i < tamanhoNovo){
            System.out.println("Numeros Novos: " +numerosNovos[i]);
            i++;
        }

    }
}
