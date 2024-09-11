import java.util.Scanner;

public class VerificadorDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberValor;

        numberValor = sc.nextDouble();
        if(numberValor % 2 == 0){
            System.out.println("Este valor é par.");
        } else {
            System.out.println("Este valor é Impar.");
        }

        sc.close();
    }
}
