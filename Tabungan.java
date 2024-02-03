import java.util.Scanner;

public class Tabungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah keluarga (m) dan lama tabungan (n)
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Inisialisasi variabel totalTabungan
        long totalTabungan = 0;

        // Loop untuk setiap bulan
        for (int bulan = 1; bulan <= n; bulan++) {
            // Tentukan jumlah hari dalam bulan (30 hari kecuali bulan April, Juni, September, November)
            int jumlahHari = 31;
            if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
                jumlahHari = 30;
            } else if (bulan == 2) {
                // Cek tahun kabisat (29 hari jika tahun kabisat, 28 hari jika tidak)
                jumlahHari = 29 ;
            }

            // Hitung total tabungan per keluarga pada bulan tertentu
            for (int hari = 1; hari <= jumlahHari; hari++) {
                totalTabungan += m * (long) (hari * 1000);
            }
        }

        // Output total tabungan
        System.out.println(totalTabungan);
    }
}

