import java.util.Scanner;

public class kelipatan{
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      int X = scanner.nextInt();
        int cek = 0;
       if (X % 3 == 0 && X % 4 == 0) {
            cek = 1;
        }
         System.out.println(cek);
        scanner.close();
    }
}
