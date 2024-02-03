import java.util.Scanner;

public class hurufBelubangdiKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kata tanpa spasi
        String kata = scanner.nextLine();

        // Membuat fungsi untuk menghitung jumlah lubang pada suatu karakter
        int totalLubang = 0;
        for (char karakter : kata.toCharArray()) {
            totalLubang += hitungLubang(karakter);
        }

        // Output total jumlah lubang
        System.out.println(totalLubang);
    }

    // Fungsi untuk menghitung jumlah lubang pada suatu karakter
    public static int hitungLubang(char karakter) {
        switch (karakter) {
            case 'a':
            case 'b':
            case 'd':
            case 'e':
            case 'g':
            case 'o':
            case 'p':
            case 'q':
            case 'A':
            case 'D':
            case 'O':
            case 'P':
            case 'Q':
            case '9':
            case '6':
            case '0':
            case 'G':
            case '4':

                return 1;
            case '8':
            case 'B':
                return 2;
            default:
                return 0;
        }
    }
}
