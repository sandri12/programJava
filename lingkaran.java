import java.util.Scanner;

public class lingkaran {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double jariJari = scanner.nextDouble();
     int jumlahLingkaran = scanner.nextInt();
     double luasLingkaran = 3.14 * jariJari* jariJari ;
     double totalLuas = luasLingkaran * jumlahLingkaran;
     System.out.printf("%.2f\n", totalLuas);
     scanner.close();
    }
}