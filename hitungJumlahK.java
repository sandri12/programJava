import java.util.Scanner;

public class hitungJumlahK{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        char hurufDicari = scanner.next().charAt(0);
        scanner.close();
       int jumlahHuruf = hitungJumlahHuruf(kalimat, hurufDicari);
     System.out.println("Jumlah huruf '" + hurufDicari + "' dalam kalimat adalah: " + jumlahHuruf);
    }

   private static int hitungJumlahHuruf(String kalimat, char hurufDicari) {
        int jumlah = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == hurufDicari || Character.toLowerCase(kalimat.charAt(i)) == Character.toLowerCase(hurufDicari)) {
                jumlah++;
            }
        }

        return jumlah;
    }
}
