import java.util.Locale;

public class Main {
    public static void main(String[] args) {
  double salario = 43.5654;

        Locale.setDefault(Locale.US);  // serve para mudar o separador. Muda para o americano. no caso o ponto (.)
        System.out.printf("%.2f", salario);

        /*
         codigo para formatar a variavel, no caso, excluir outras
         casas decimais e deixar apenas as duas primeiras depois do ponto flutuante. No caso, 43,58
         obs: numero de casas pode ser maior ou menor de acordo com a quantidade desejada no codigo.  "%.2f"

         */
    }
}