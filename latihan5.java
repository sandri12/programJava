import java.util.Scanner;

public class latihan5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double jumlahHarga = scanner.nextDouble();
        int tanggalLahir = scanner.nextInt();

      double totalPembayaran = hitungTotalPembayaran(jumlahHarga, tanggalLahir);
     System.out.printf("%.2f\n", totalPembayaran);

        scanner.close();
    }

         private static double hitungTotalPembayaran(double jumlahHarga, int tanggalLahir) {
          if (jumlahHarga >= 50000) {
              double potonganHarga = 0.02 * tanggalLahir * jumlahHarga;
              double totalPembayaran = jumlahHarga - potonganHarga;
            return totalPembayaran;
        } else {
           return jumlahHarga;
        }
    }
}
