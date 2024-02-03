import java.util.Scanner;

public class Traveling{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();
        int d = scanner.nextInt();
        int b = scanner.nextInt();
        
        int budgetLombok = p * (2170000 + (125000 + 75000) * d + 250000);
        int budgetBangkok = p * (3780000 + (155000 + 55000) * d + 300000);
        int budgetSingapura = p * (1200000 + (170000 + 85000) * d + 360000);
        int budgetTokyo = p * (4760000 + (170000 + 105000) * d + 325000);

        // Cek destinasi mana yang sesuai dengan budget
        if (budgetLombok <= b) {
            printRecommendation("Lombok", budgetLombok);
        } else if (budgetBangkok <= b) {
            printRecommendation("Bangkok", budgetBangkok);
        } else if (budgetSingapura <= b) {
            printRecommendation("Singapura", budgetSingapura);
        } else if (budgetTokyo <= b) {
            printRecommendation("Tokyo", budgetTokyo);
        } else {
            System.out.println("Need more budget");
        }
    }

    // Fungsi untuk mencetak rekomendasi destinasi dan total budget
    public static void printRecommendation(String destination, int totalBudget) {
        System.out.println(destination + " " + totalBudget);
    }
}
