import java.util.Scanner;

public class rhythmGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama pemain
        String playerName = scanner.nextLine();

        // Input jumlah poin "Perfect", "Great", "Good", dan "Miss"
        int perfectCount = scanner.nextInt();
        int greatCount = scanner.nextInt();
        int goodCount = scanner.nextInt();
        int missCount = scanner.nextInt();

        // Hitung total skor dan total maksimal skor
        int totalScore = calculateScore(perfectCount, greatCount, goodCount, missCount);
        int totalMaxScore = calculateTotalMaxScore(100, 0, 0);

        // Hitung persentase skor
        double percentage = (double) totalScore / totalMaxScore * 100;

        // Dapatkan peringkat pemain
        String rank = getRank(percentage);

        // Tampilkan hasil
        printResult(playerName, totalScore, totalMaxScore, rank);
    }

    // Function untuk menghitung skor berdasarkan jumlah ketepatan
    public static int calculateScore(int perfectCount, int greatCount, int goodCount, int missCount) {
        return perfectCount * 100 + greatCount * 80 + goodCount * 60 + missCount * 0;
    }

    // Function untuk menghitung total maksimal skor yang bisa dicapai pada lagu tertentu
    public static int calculateTotalMaxScore(int maxPerfect, int maxGreat, int maxGood) {
        return maxPerfect * 100 + maxGreat * 80 + maxGood * 60;
    }

    // Function untuk mendapatkan peringkat berdasarkan persentase skor yang diperoleh
    public static String getRank(double percentage) {
        if (percentage >= 90) {
            return "S (Super)";
        } else if (percentage >= 80) {
            return "A (Amazing)";
        } else if (percentage >= 70) {
            return "B (Brilliant)";
        } else if (percentage >= 60) {
            return "C (Cool)";
        } else {
            return "D (Decent)";
        }
    }

    // Function untuk menampilkan hasil perhitungan skor dan peringkat pemain
    public static void printResult(String playerName, int totalScore, int totalMaxScore, String rank) {
        System.out.println(totalScore);
        System.out.println(playerName + " peringkat " + rank);
    }
}
