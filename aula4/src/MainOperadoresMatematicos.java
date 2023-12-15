public class MainOperadoresMatematicos {

    public static void main(String[] args) {
        double numero = 10;

        double operacaoSoma = 1+1;
        double operacaoSubtracao = 2-1;
        double operacaoMultiplicacao = 5*7;
        double operacaoDivisao = 40/2;
        double operacaoResto = 11%4; // divisão de 7 por 3 e ao final teremos resto 1, esse resto é o valor da operação
        // 0, 1 , 2, 3

        double operacaoIncremento = ++numero; // numero++ -> numero += 1 // numero = numero + 1
        double operacaoDecremento = --numero; // alteramos operacao e a variavel numero

        // se colocamos ++numero -> alteramos o valor de numero e depois disso salvamos o valor em operacaoIncremento
        // se colocamos numero++ -> primeiro salvamos o valor em operacaoIncremento e depois aumentamos o valor de numero

        double operacao = Math.pow(5,3);
        double operacaoRaiz = Math.sqrt(5.3);

        System.out.println("operacaoSoma  " + operacaoSoma);
        System.out.println("operacaoSubtracao  " + operacaoSubtracao);
        System.out.println("operacaoMultiplicacao  " + operacaoMultiplicacao);
        System.out.println("operacaoDivisao  " + operacaoDivisao);
        System.out.println("operacaoResto  " + operacaoResto);
        System.out.println("operacaoIncremento  " + operacaoIncremento);
        System.out.println("operacaoDecremento  " + operacaoDecremento);
        System.out.println("operacao  " + operacao);
        System.out.println("operacaoRaiz  " + operacaoRaiz);
    }
}
