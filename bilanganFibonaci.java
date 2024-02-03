import java.util.Scanner;

public class bilanganFibonaci {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
      int nilaiMaksimum = scanner.nextInt();
    scanner.close();
    tampilkanFibonacci(nilaiMaksimum);
    }
  private static void tampilkanFibonacci(int nilaiMaksimum) {
        int a = 0, b = 1, c;
        System.out.println("Deret Fibonaci " + nilaiMaksimum + " adalah:");
    System.out.print(a + ", " + b + ", ");
   while ((a + b) <= nilaiMaksimum) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
    }
}
