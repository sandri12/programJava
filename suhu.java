import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    double suhuReamur = scanner.nextDouble();
     double suhuKelvin = suhuReamur * 1.25 + 273;
     System.out.printf("%.2f\n", suhuKelvin);
     scanner.close();
    }
}
