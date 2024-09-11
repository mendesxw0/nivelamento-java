import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);

        double pi = 3.14;
        double raio;
        double A;

        raio = imprimir.nextDouble();
        A = raio * 2;

        double result = pi * A;

        System.out.println(result);
        imprimir.close();
    }
}
