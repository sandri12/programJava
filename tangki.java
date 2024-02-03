import java.util.Scanner;

public class tangki {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int uang = scanner.nextInt();
        double kapasitasTangki = scanner.nextDouble();

          int hargaPremium = 7600;

          double jumlahBensin = uang / (double) hargaPremium;

           System.out.printf("%.2f\n", jumlahBensin);

           if (jumlahBensin > kapasitasTangki) {
            System.out.println("Bensin Berlebih");
        }

           scanner.close();
    }
}