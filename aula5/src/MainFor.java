public class MainFor {

    public static void main(String[] args) {

        for (int i=10; i > 5; i = i - 2) {
            // i existe apenas dentro do for
            System.out.println("Valor de i = " + i);
        }
    }
}
