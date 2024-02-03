import java.util.Scanner;

public class satpam {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    int nomorKasus = scanner.nextInt();
        int banyakKasus = scanner.nextInt();
        if (nomorKasus == 1) {
            if (banyakKasus < 4) {
                System.out.println("Serahkan KTP anda !!!");
            } else {
                System.out.println("Bayar Denda 10000 !!!");
            }
        } else if (nomorKasus == 2) {
            System.out.println("Ambil STNK dulu !!!");
        } else {
            System.out.println("Nomor kasus tidak valid");
        }
      scanner.close();
    }
}