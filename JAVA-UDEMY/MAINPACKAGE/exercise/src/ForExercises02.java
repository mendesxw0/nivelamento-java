import java.util.Scanner;

public class ForExercises02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int x =  sc.nextInt();
        for (int i = 1; i <= x; i ++){
            if(i % 2!= 0){
                System.out.println("Esse número é impar "+ i);
            }
        }

        sc.close();
    }
}
