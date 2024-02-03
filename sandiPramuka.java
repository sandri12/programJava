import java.util.Scanner;

public class sandiPramuka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kalimat untuk disandikan
        String input = scanner.nextLine();

        // Memanggil fungsi encodeToSandi untuk menghasilkan array sandi
        int[] sandi = encodeToSandi(input);

        // Memanggil fungsi generateSandiString untuk menghasilkan string sandi
        String sandiString = generateSandiString(sandi);

        // Menampilkan hasil sandi
        System.out.println(sandiString);
    }

    private static int[] encodeToSandi(String input) {
        // Inisialisasi array sandi dengan panjang sesuai dengan jumlah karakter input
        int[] sandi = new int[input.length() * 2];

        // Indeks untuk mengakses array sandi
        int index = 0;

        // Looping untuk setiap karakter dalam input
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Mengisi array sandi dengan nilai sesuai karakter
            sandi[index++] = getSandiNumber(currentChar);

            // Jika karakter memiliki pengulangan lebih dari satu, tambahkan ke array sandi
            int count = getCount(currentChar);
            for (int j = 1; j < count; j++) {
                sandi[index++] = sandi[index - 2];
            }

            // Mengecek apakah karakter merupakan spasi, jika ya, tambahkan 0 ke array sandi
            if (currentChar == ' ') {
                sandi[index++] = 0;
            }
        }

        // Menghapus elemen kosong di akhir array sandi
        int[] result = new int[index];
        System.arraycopy(sandi, 0, result, 0, index);

        return result;
    }

    private static int getSandiNumber(char c) {
        // Mengembalikan angka yang merupakan kode sandi untuk karakter yang diberikan
        switch (c) {
            case 'A':
                return 1;
            case 'E':
                return 2;
            case 'I':
                return 3;
            case 'M':
                return 4;
            case 'Q':
                return 5;
            case 'U':
                return 6;
            case 'Y':
                return 7;
            case 'B':
                return 11;
            case 'F':
                return 22;
            case 'J':
                return 33;
            case 'N':
                return 44;
            case 'R':
                return 55;
            case 'V':
                return 66;
            case 'Z':
                return 77;
            case 'C':
                return 111;
            case 'G':
                return 222;
            case 'K':
                return 333;
            case 'O':
                return 444;
            case 'S':
                return 555;
            case 'W':
                return 666;
            case 'D':
                return 1111;
            case 'H':
                return 2222;
            case 'L':
                return 3333;
            case 'P':
                return 4444;
            case 'T':
                return 5555;
            case 'X':
                return 6666;
            default:
                return 0; // Karakter tidak terdaftar, mengembalikan 0
        }
    }

    private static int getCount(char c) {
        // Mengembalikan jumlah pengulangan karakter berdasarkan karakter yang diberikan
        switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'M':
            case 'Q':
            case 'U':
            case 'Y':
                return 1;
            case 'B':
            case 'F':
            case 'J':
            case 'N':
            case 'R':
            case 'V':
            case 'Z':
                return 2;
            case 'C':
            case 'G':
            case 'K':
            case 'O':
            case 'S':
            case 'W':
                return 3;
            case 'D':
            case 'H':
            case 'L':
            case 'P':
            case 'T':
            case 'X':
                return 4;
            default:
                return 1; // Karakter tidak terdaftar, mengembalikan 1
        }
    }

    private static String generateSandiString(int[] sandi) {
        // Mengubah array of integer yang merepresentasikan sandi menjadi string sandi
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sandi.length; i++) {
            result.append(sandi[i]);

            // Jika bukan elemen terakhir, dan elemen selanjutnya bukan 0, tambahkan tanda minus
            if (i < sandi.length - 1 && sandi[i + 1] != 0) {
                result.append("-");
            }
        }

        return result.toString();
    }
}