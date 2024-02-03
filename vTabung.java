import java.util.Scanner;

public class vTabung {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
         double jariJari = scanner.nextDouble();
         double tinggi = scanner.nextDouble();
         double volume = 3.14 * Math.pow(jariJari, 2) * tinggi;
        System.out.printf("%.2f\n", volume);
        scanner.close();
    }
}