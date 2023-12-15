public class MainOperadoresLogicos {

    public static void main(String[] args) {
        int numero1 = 11;
        int numero2 = 11;


        boolean logicoMaior = numero1 > numero2; // maior
        boolean logicoMenor = numero1 < numero2;
        boolean logicoIgualdade = numero1 == numero2;
        boolean logicoMaiorIgual = numero1 >= numero2;
        boolean logicoMenorIgual = numero1 <= numero2;
        boolean logicoDiferente = numero1 != numero2;

        System.out.println("logicoMaior "+logicoMaior);
        System.out.println("logicoMenor "+logicoMenor);
        System.out.println("logicoIgualdade "+logicoIgualdade);
        System.out.println("logicoMaiorIgual "+logicoMaiorIgual);
        System.out.println("logicoMenorIgual "+logicoMenorIgual);
        System.out.println("logicoDiferente "+logicoDiferente);




        // tabela lógica AND - E
        boolean logicoAnd = true && true;
        boolean logicoAnd1 = false && true;
        boolean logicoAnd2 = true && false;
        boolean logicoAnd3 = false && false;

        System.out.println("logicoAnd  "+logicoAnd );
        System.out.println("logicoAnd1 "+logicoAnd1);
        System.out.println("logicoAnd2 "+logicoAnd2);
        System.out.println("logicoAnd3 "+logicoAnd3);


        // tabela lógica OR - OU
        boolean logicoOr = true || true;
        boolean logicoOr1 = false || true;
        boolean logicoOr2 = true || false;
        boolean logicoOr3 = false || false;

        System.out.println("logicoOr  "+logicoOr );
        System.out.println("logicoOr1 "+logicoOr1);
        System.out.println("logicoOr2 "+logicoOr2);
        System.out.println("logicoOr3 "+logicoOr3);

        boolean logicoNotTrue = !true; // false
        boolean logicoNotFalse = !false; // false

        System.out.println("logicoNotTrue "+logicoNotTrue);
        System.out.println("logicoNotFalse "+logicoNotFalse);
    }
}
