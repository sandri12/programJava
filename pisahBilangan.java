import java.util.Scanner;

public class pisahBilangan {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

      for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }

      scanner.close();
    }
}
