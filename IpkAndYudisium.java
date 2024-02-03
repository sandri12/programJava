import java.util.Scanner;

public class IpkAndYudisium {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrNamaModule;
        String[] arrHarkat;
        int[] arrSks;
        int[] arrScore;

        String statusYudisium = "";
        int banyakModule = 0;
        double ipk, totalSks = 0, totalScore = 0;
        boolean isPending = false;

        // Input banyak module
        banyakModule = Integer.valueOf(input.nextLine());

        // Inisialisasi semua Array yang dibutuhkan berdasarkan Banyak module
        arrNamaModule = new String[banyakModule];
        arrHarkat = new String[banyakModule];
        arrScore = new int[banyakModule];
        arrSks = new int[banyakModule];

        // Looping input data Module berdasarkan Banyak Module
        for (int i = 0; i < banyakModule; i++) {
            System.out.println("Module " + (i + 1));
            arrNamaModule[i] = input.nextLine();
            arrSks[i] = Integer.parseInt(input.nextLine());
            arrHarkat[i] = input.nextLine();
            arrScore[i] = convertHarkat(arrHarkat[i]);
        }

        totalScore = calculateTotalValue(arrScore);
        totalSks = calculateTotalValue(arrSks);
        ipk = calculateIpk(totalSks, totalScore);
        isPending = isPendingValildation(arrHarkat);
        statusYudisium = getYudisium(isPending, ipk);

        // Print hasil
        printHasil(ipk, totalSks, statusYudisium, arrNamaModule, arrHarkat);
    }

    // Menghitung total nilai pada sebuah array
    public static int calculateTotalValue(int[] arrValue) {
        int total = 0;
        for (int value : arrValue) {
            total += value;
        }
        return total;
    }

    // Konversi Harkat ke Nilai
    public static int convertHarkat(String harkat) {
        switch (harkat) {
            case "A":
                return 4;
            case "B":
                return 3;
            case "C":
                return 2;
            case "D":
                return 1;
            case "E":
                return 0;
            default:
                return 0;
        }
    }

    // Menentukan Yudisium
    public static String getYudisium(boolean isPending, double ipk) {
        if (isPending || ipk < 2) {
            return "Pending";
        } else if (ipk >= 3.5) {
            return "Cum Laude";
        } else if (ipk >= 2.75 && ipk < 3.5) {
            return "Sangat Memuaskan";
        } else if (ipk >= 2 && ipk < 2.75) {
            return "Memuaskan";
        } else {
            return "Invalid";
        }
    }

    // Menghitung IPK
    public static double calculateIpk(double totalSks, double totalScore) {
        if (totalSks == 0) {
            return 0;
        } else {
            return totalScore / totalSks;
        }
    }

    // Print Hasil
    public static void printHasil(double ipk, double totalSks, String statusYudisium, String[] arrModule, String[] arrHarkat) {
        int number = 1;

        System.out.println("Yudisium: " + statusYudisium);
        System.out.printf("IPK: %.2f\n", ipk);
        System.out.println("Total SKS: " + totalSks);
        System.out.println("Total Module: " + arrModule.length);
        for (int i = 0; i < arrModule.length; i++) {
            System.out.println(number + ". " + arrModule[i] + " (" + arrHarkat[i] + ")");
            number++;
        }
    }

    // Validasi Pending berdasarkan Nilai Harkat
    public static boolean isPendingValildation(String[] arrHarkat) {
        for (String harkat : arrHarkat) {
            if (harkat.equals("E")) {
                return true;
            }
        }
        return false;
    }
}
