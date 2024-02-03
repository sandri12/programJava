import java.util.Scanner;
public class Angkutan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] kursi = {60, 45, 32, 18, 12, 120};
        int[] harga = {2300000, 2000000, 1800000, 1500000,1300000, 4600000};
        int termurah = Integer.MAX_VALUE;
        for (int i = 0; i < kursi.length; i++) {
        if (kursi[i] >= n) {termurah = Math.min(termurah,harga[i]);
           }
        }
        System.out.println(termurah);
    }
}
