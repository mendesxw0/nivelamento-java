import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String product01 = "Computer";
        String product02 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.00;
        double measure = 53.234567;

        String result = product01 + " which price is $ " + price1 + product02 + ", which price is $ " + price2;
        String record = age + " years old, code " + code + " and gender: " + gender;


        Locale.setDefault(Locale.US);
        String record2 = " measure with eight decimal places: " + measure +" Rouded (three decimal places): " + measure + "US decimal point: "+ measure;

        System.out.println(result);
        System.out.println(record);
        System.out.printf("%.2f",measure);
    }
}