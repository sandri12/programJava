import java.util.Scanner;

public class datainteger {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int data1 = scanner.nextInt();
        int data2 = scanner.nextInt();
        int data3 = scanner.nextInt();

       if (data1 < data2) {
            int temp = data1;
            data1 = data2;
            data2 = temp;
        }
        if (data2 < data3) {
            int temp = data2;
            data2 = data3;
            data3 = temp;
        }
        if (data1 < data2) {
            int temp = data1;
            data1 = data2;
            data2 = temp;
        }
      System.out.printf("%d %d %d\n", data1, data2, data3);
     scanner.close();
    }
}
