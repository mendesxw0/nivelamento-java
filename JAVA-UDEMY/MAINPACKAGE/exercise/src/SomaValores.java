import java.util.Scanner;

public class SomaValores {
    public static void main(String[] args) {
        Scanner imprime = new Scanner(System.in);
        int number;
        int number2;

        number = imprime.nextInt();
        number2 = imprime.nextInt();

        int result = number2 + number;
        System.out.println(number);
        System.out.println(number2);
        System.out.println(result);
        imprime.close();
    }
}
