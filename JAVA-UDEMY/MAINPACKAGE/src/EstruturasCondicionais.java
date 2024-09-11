import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
     int hora;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas são no seu dispositivo?");

        hora = sc.nextInt();
        if(hora < 12){
            System.out.print("São "+ hora + " da manhã. ");
            System.out.println("Bom dia!");
        } else if (hora <= 18) {
            System.out.println("são "+ hora + " da tarde.");
            System.out.print("Boa tarde!");
        } else{
            System.out.println("São "+ hora + " da noite.");
            System.out.print("Boa noite.");
        }

        sc.close();
    }
}
