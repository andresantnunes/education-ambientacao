public class MainWrapper {
    public static void main(String[] args) {
//        double numeroDouble = Double.parseDouble("1010");//parseDouble -> String
        String numeroString = "123";

        double numeroDouble = Double.valueOf(10L);//valueOf -> Valores Numericos
        int numeroInt = Integer.parseInt(numeroString);

        System.out.println(numeroInt);
    }
}
