import java.util.Scanner;

public class hitungK {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
         String kalimat = scanner.nextLine();
        scanner.close();
      int jumlahKarakter = hitungJumlahKarakter(kalimat);
     System.out.println("Jumlah karakter dalam kalimat adalah: " + jumlahKarakter);
    }

    private static int hitungJumlahKarakter(String kalimat) {
        return kalimat.length();
    }
}
