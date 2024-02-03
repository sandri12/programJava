import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gajiKaryawan {

    static final int JUMLAH_HARI_KERJA_SEBULAN = 22;

    static final Map<String, Integer> POSISI_INDEX_MAP = new HashMap<>();
    static final Map<String, Integer> DIVISI_INDEX_MAP = new HashMap<>();

    static final double[][] GAJI_POKOK = {
            {8000000, 9000000, 7500000, 7200000, 8500000},  // Software Engineer
            {7000000, 8000000, 6500000, 6200000, 7500000},  // Data Analyst
            {7500000, 8500000, 7000000, 6800000, 8000000},  // UX Designer
            {10000000, 11000000, 9500000, 9200000, 10500000},  // Project Manager
            {7500000, 8500000, 7000000, 6800000, 8000000}   // QA Engineer
    };

    static final double[] TUNJANGAN_TRANSPORT = {1000000, 1500000, 1200000, 1100000, 1300000};

    static final int TUNJANGAN_MAKAN_PER_HARI = 50000;
    static final double TUNJANGAN_KESEHATAN_PERSENTASE = 0.02;
    static final double POTONGAN_BPJS_PERSENTASE = 0.03;
    static final double POTONGAN_PPH_PERSENTASE = 0.05;

    static {
        POSISI_INDEX_MAP.put("Software Engineer", 0);
        POSISI_INDEX_MAP.put("Data Analyst", 1);
        POSISI_INDEX_MAP.put("UX Designer", 2);
        POSISI_INDEX_MAP.put("Project Manager", 3);
        POSISI_INDEX_MAP.put("QA Engineer", 4);

        DIVISI_INDEX_MAP.put("Surabaya", 0);
        DIVISI_INDEX_MAP.put("Jakarta", 1);
        DIVISI_INDEX_MAP.put("Bandung", 2);
        DIVISI_INDEX_MAP.put("Medan", 3);
        DIVISI_INDEX_MAP.put("Makassar", 4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String posisi = scanner.nextLine();
         
        String divisi = scanner.nextLine();

        // Menghitung total gaji bersih
        double totalGajiBersih = calculateGajiBersih(posisi, divisi, JUMLAH_HARI_KERJA_SEBULAN);

        // Menampilkan output
        System.out.println(posisi);
        System.out.println(divisi);
        System.out.println(JUMLAH_HARI_KERJA_SEBULAN + " hari");
        System.out.println(formatCurrency(totalGajiBersih));
    }

    static String formatCurrency(double amount) {
        DecimalFormat currencyFormat = new DecimalFormat("###,###,##0.00");
        return currencyFormat.format(amount);
    }

    static double getGajiPokok(String posisi, String divisi) {
        int posisiIndex = POSISI_INDEX_MAP.get(posisi);
        int divisiIndex = DIVISI_INDEX_MAP.get(divisi);

        return GAJI_POKOK[posisiIndex][divisiIndex];
    }

    static double getTunjanganTransport(String divisi) {
        int divisiIndex = DIVISI_INDEX_MAP.get(divisi);
        return TUNJANGAN_TRANSPORT[divisiIndex];
    }

    static double calculateTunjanganKesehatan(double gajiPokok) {
        return TUNJANGAN_KESEHATAN_PERSENTASE * gajiPokok;
    }

    static double calculatePotonganBPJS(double gajiPokok) {
        return POTONGAN_BPJS_PERSENTASE * gajiPokok;
    }

    static double calculatePotonganPPH(double gajiPokok) {
        return POTONGAN_PPH_PERSENTASE * gajiPokok;
    }

    static double calculateGajiBersih(String posisi, String divisi, int totalHariKerja) {
        double gajiPokok = getGajiPokok(posisi, divisi);
        double tunjanganTransport = getTunjanganTransport(divisi);
        double tunjanganMakan = TUNJANGAN_MAKAN_PER_HARI * totalHariKerja;
        double tunjanganKesehatan = calculateTunjanganKesehatan(gajiPokok);
        double potonganBPJS = calculatePotonganBPJS(gajiPokok);
        double potonganPPH = calculatePotonganPPH(gajiPokok);

        double gajiBersih = gajiPokok + tunjanganTransport + tunjanganMakan + tunjanganKesehatan - potonganBPJS - potonganPPH;

        return gajiBersih;
    }
}
