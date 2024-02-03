import java.util.Scanner;

public class detik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan bulat detik
        int totalDetik = scanner.nextInt();

        // Memanggil fungsi untuk konversi detik
        convertDetik(totalDetik);
    }

    private static void convertDetik(int detik) {
        // Menghitung jumlah hari, jam, menit, dan detik
        int hari = detik / 86400;
        int sisaDetik1 = detik % 86400;

        int jam = sisaDetik1 / 3600;
        int sisaDetik2 = sisaDetik1 % 3600;

        int menit = sisaDetik2 / 60;
        int sisaDetik3 = sisaDetik2 % 60;

        // Menampilkan hasil konversi
        System.out.println(hari);
        System.out.println(jam);
        System.out.println(menit);
        System.out.println(sisaDetik3);
    }
}
