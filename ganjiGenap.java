import java.util.Scanner;

public class ganjiGenap {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      int x = scanner.nextInt();

        // Menentukan apakah bilangan ganjil atau genap
        if (x % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
        scanner.close();
    }
}
