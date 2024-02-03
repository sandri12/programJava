import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
      String teks = scanner.nextLine();
  if (teks.length() > 10) {
            System.out.println("Panjang teks melebihi batas maksimal (10 karakter).");
        } else {
         String teksTerbalik = balikTeks(teks);
            System.out.println(teksTerbalik);
        }
      scanner.close();
    }
     private static String balikTeks(String teks) {
        char[] karakter = teks.toCharArray();
        int panjang = karakter.length;
    for (int i = 0; i < panjang / 2; i++) {
            char temp = karakter[i];
            karakter[i] = karakter[panjang - 1 - i];
            karakter[panjang - 1 - i] = temp;
        }
        return new String(karakter);
    }
}