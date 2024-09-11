import java.util.Scanner;

public class WhileExercise {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int number;

        int soma = 0;
        number = sc.nextInt();

        while (number != 0){
            soma += number;
            number = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }
}
