import java.util.Scanner;

public class wujudBenda{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

       double suhu = scanner.nextDouble();
    
        if (suhu > -150 && suhu < 150) {
            System.out.println("berwujud cair");
        } else {
            System.out.println("berwujud non cair");
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
