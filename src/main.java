import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int km;
        double perKm = 2.20 , total = 10;

        System.out.println("Mesafeyi km cinsinden giriniz :");
        km = input.nextInt();

        total += (perKm * km );

        total = (total < 20) ? 20 : total;

        System.out.println("Taksimetre ücretiniz :" + total);


    }
}
