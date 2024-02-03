import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double hargaBarang = scanner.nextDouble();
      int jumlahBarang = scanner.nextInt();
    double totalHarga = calculateTotalPrice(hargaBarang, jumlahBarang);
     System.out.printf("%.2f%n", totalHarga);
     scanner.close();
    }
          private static double calculateTotalPrice(double hargaBarang, int jumlahBarang) {
         double totalHarga = hargaBarang * jumlahBarang;
          if (jumlahBarang % 3 == 0 && jumlahBarang % 4 == 0) {
            double potongan = 0.15 * totalHarga;
         totalHarga -= potongan;
        }
       return totalHarga;
    }
}