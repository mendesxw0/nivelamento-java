import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
//        Scanner src = new Scanner(System.in);
//        int x;
//        x = src.nextInt();
//        System.out.println("Você digitou "+ x);

        Scanner one = new Scanner(System.in);
        double number;

        number = one.nextDouble();

        System.out.println("O número digitado foi: "+ number);

        one.close(); // serve para encerrar o recurso.
    }
}
