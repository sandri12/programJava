import java.util.Scanner;

public class mesinATM {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int jumlahUang = scanner.nextInt();
        double saldoRekening = scanner.nextDouble();
       if (saldoRekening >= jumlahUang + 0.5) {
        saldoRekening -= (jumlahUang + 0.5);

        System.out.printf("%.2f\n", saldoRekening);
        } else {
        System.out.printf("%.2f\n", saldoRekening);
        }
     scanner.close();
    }
}
