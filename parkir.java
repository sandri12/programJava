import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int Kendaraan = scanner.nextInt();
      int lama = scanner.nextInt();

       int Biaya = 0;

        if (Kendaraan == 1) {
            // Biaya parkir untuk mobil
            Biaya = 2000 + (lama - 1) * 1000;
        } else if (Kendaraan == 2) {
            // Biaya parkir untuk motor
            Biaya = 1000 + (lama - 1) * 500;
        }

        System.out.println(Biaya);

        scanner.close();
    }
}
