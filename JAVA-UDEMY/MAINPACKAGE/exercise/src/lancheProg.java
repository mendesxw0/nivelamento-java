import java.util.Scanner;

public class lancheProg {
    public static void main(String[] args) {

        System.out.println("Digite apenas números inteiros.");
        Scanner sc = new Scanner(System.in);
        int products;
        int quantidadeDeProducts;

        products = sc.nextInt();
        quantidadeDeProducts = sc.nextInt();


        if(products == 1){
            double result1 = (double) (products * quantidadeDeProducts);
            System.out.println(result1);
        }
        else if (products == 2) {

            double result2 = (double) (products * quantidadeDeProducts);
            System.out.println(result2);

        }
        else if (products == 3) {

            double result3 = (double) (products * quantidadeDeProducts);
            System.out.println(result3);
        } else {
            System.out.println("Produto não cadastrado.");
        }
        sc.close();
    }

}
