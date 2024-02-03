import java.util.Scanner;

public class SistemKeamanan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputKalimat = scanner.nextLine();

        // Menghapus spasi
        String kalimatTanpaSpasi = hapusSpasi(inputKalimat);

        // Pengecekan palindrom
        boolean isPalindrom = isPalindrom(kalimatTanpaSpasi);

        // Menghitung jumlah huruf
        int jumlahHuruf = hitungJumlahHuruf(kalimatTanpaSpasi);

        // Menampilkan hasil
        System.out.println(kalimatTanpaSpasi);
        System.out.println(isPalindrom);
        System.out.println(jumlahHuruf);

        // Memberikan keterangan
        if (isPalindrom) {
            System.out.println("Silahkan Masuk");
        } else {
            System.out.println("Akses Ditolak");
        }
    }

    public static String hapusSpasi(String kalimat) {
        return kalimat.replaceAll("\\s", "");
    }

    public static boolean isPalindrom(String kalimat) {
        int panjang = kalimat.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kalimat.charAt(i) != kalimat.charAt(panjang - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int hitungJumlahHuruf(String kalimat) {
        return kalimat.length();
    }
}
