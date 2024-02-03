import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KarakteristikHewan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input batas minimal kesamaan
        System.out.print("Masukkan batas minimal kesamaan (N): ");
        double batasMinimal = scanner.nextDouble();

        // Input ciri hewan A
        System.out.print("Masukkan ciri hewan A (dipisahkan oleh spasi): ");
        scanner.nextLine(); // Membaca karakter newline
        String ciriHewanA = scanner.nextLine();

        // Input ciri hewan B
        System.out.print("Masukkan ciri hewan B (dipisahkan oleh spasi): ");
        String ciriHewanB = scanner.nextLine();

        // Menghitung persentase kesamaan
        double persentaseKesamaan = hitungPersentaseKesamaan(ciriHewanA, ciriHewanB);

        // Menampilkan hasil
        System.out.println("Persentase Kesamaan: " + persentaseKesamaan + "%");

        // Membandingkan dengan batas minimal
        if (persentaseKesamaan >= batasMinimal) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }
    }

    public static double hitungPersentaseKesamaan(String ciriHewanA, String ciriHewanB) {
        Set<Character> setHewanA = new HashSet<>();
        Set<Character> setHewanB = new HashSet<>();

        // Mengubah string menjadi set karakter
        for (char c : ciriHewanA.toCharArray()) {
            setHewanA.add(c);
        }

        for (char c : ciriHewanB.toCharArray()) {
            setHewanB.add(c);
        }

        // Menghitung persentase kesamaan
        Set<Character> intersection = new HashSet<>(setHewanA);
        intersection.retainAll(setHewanB);

        double persentaseKesamaan = (double) intersection.size() / setHewanA.size() * 100;
        return persentaseKesamaan;
    }
}
