import java.util.Scanner;

public class VerificadorDeSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password;
        password = sc.nextInt();
      while (password != 2007){
           password = sc.nextInt();

           if (password == 2007){
               System.out.println("acesso valido");
           } else {
               System.out.println("Acesso invalido");
           }
           }
        System.out.println(password);
        sc.close();
    }
}
