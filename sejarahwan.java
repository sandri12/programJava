import java.util.Scanner;

public class sejarahwan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan bulat antara 1 hingga 3999
        int decimalNumber = scanner.nextInt();

        // Memanggil fungsi untuk mengkonversi angka desimal ke Romawi
        String romanNumber = convertToRoman(decimalNumber);

        // Menampilkan hasil konversi
        System.out.println(romanNumber);
    }

    private static String convertToRoman(int number) {
        // Array untuk simbol-simbol Romawi
        String[] romanSymbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        // Array untuk nilai-nilai yang sesuai dengan simbol-simbol Romawi
        int[] romanValues = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        // StringBuilder untuk menyimpan hasil konversi
        StringBuilder result = new StringBuilder();

        // Looping dari nilai-nilai terbesar ke terkecil
        for (int i = romanValues.length - 1; i >= 0; i--) {
            // Mengulang selama nilai input lebih besar atau sama dengan nilai Romawi
            while (number >= romanValues[i]) {
                // Mengurangkan nilai input dan menambahkan simbol Romawi ke hasil
                number -= romanValues[i];
                result.append(romanSymbols[i]);
            }
        }

        return result.toString();
    }
}
