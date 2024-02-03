import java.util.Scanner;
public class GajiPNS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Pegawai: ");
        String nama = validateStringInput(scanner);
        System.out.print("Golongan Pangkat (1-4): ");
        int golonganPangkat = validateIntegerInput(scanner, 1, 4);
        System.out.print("Golongan Ruang Kerja (Tipe Golongan): ");
        String tipeGolongan = validateStringInput(scanner);
        System.out.print("Masa Kerja: ");
        int masaKerja = validateIntegerInput(scanner, 0, 50);
        System.out.print("Status Pernikahan (Kawin/Belum Kawin/Cerai): ");
        String statusPernikahan = validateMaritalStatus(scanner);
        System.out.print("Jumlah Anak: ");
        int jumlahAnak = validateIntegerInput(scanner, 0, 3);
        int gajiPokok = kalkulasiGajiPokok(masaKerja, tipeGolongan, golonganPangkat);
        int tunjanganKeluarga = kalkulasiTunjanganKeluarga(statusPernikahan, gajiPokok);
        int tunjanganAnak = kalkulasiTunjanganAnak(jumlahAnak, gajiPokok);
        int tunjanganBeras = kalkulasiTunjanganBeras(statusPernikahan, jumlahAnak);
        int tunjanganUmumJabatan = kalkulasiTunjanganUmumJabatan(golonganPangkat);
        int gajiKotor = kalkulasiGajiKotor(gajiPokok, tunjanganAnak, tunjanganKeluarga, tunjanganUmumJabatan, tunjanganBeras);
        int potonganPPH = kalkulasiPotonganPPH(gajiPokok, statusPernikahan, gajiKotor, jumlahAnak, tunjanganKeluarga, tunjanganAnak);
        int potonganIWP = kalkulasiPotonganIWP(gajiPokok, tunjanganAnak, tunjanganKeluarga);
        int potonganTaperum = kalkulasiPotonganTaperum(golonganPangkat);
        int gajiBersih = kalkulasiGajiBersih(gajiKotor, potonganPPH, potonganIWP, potonganTaperum);

        displayOutput(nama, gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganBeras,
                tunjanganUmumJabatan, gajiKotor, potonganPPH, potonganIWP, potonganTaperum, gajiBersih);
    }
    private static String validateStringInput(Scanner scanner) {
        String input = "";
        while (input.trim().isEmpty() || !input.matches("[a-zA-Z ]+")) {
            System.out.println("Input tidak valid. Harap masukkan huruf dan spasi.");
            System.out.print("Coba lagi: ");
            input = scanner.nextLine();
        }
        return input;
    }
    private static int validateIntegerInput(Scanner scanner, int min, int max) {
        int input = 0;
        while (true) {
            try {
                input = Integer.parseInt(scanner.next());
                if (input >= min && input <= max) {
                    break;
                } else {
                    System.out.println("Input harus antara " + min + " dan " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                System.out.print("Coba lagi: ");
            }
        }
        return input;
    }
    private static String validateMaritalStatus(Scanner scanner) {
        String status = "";
        while (true) {
            status = scanner.next().toLowerCase();
            if (status.equals("kawin") || status.equals("belum kawin") || status.equals("cerai")) {
                break;
            } else {
                System.out.println("Input tidak valid. Harap masukkan 'Kawin', 'Belum Kawin', atau 'Cerai'.");
                System.out.print("Coba lagi: ");
            }
        }
        return status;
    }
    private static int kalkulasiGajiPokok(int masaKerja, String tipeGolongan, int golonganPangkat) {
        return 0;
    }
    private static int kalkulasiTunjanganKeluarga(String statusPernikahan, int gajiPokok) {
        return 0; 
    }
    private static int kalkulasiTunjanganAnak(int jumlahAnak, int gajiPokok) {
        return 0;
    }
    private static int kalkulasiTunjanganBeras(String statusPernikahan, int jumlahAnak) {
        return 0; 
    }
    private static int kalkulasiTunjanganUmumJabatan(int golonganPangkat) {
        return 0; 
    }
    private static int kalkulasiGajiKotor(int gajiPokok, int tunjanganAnak, int tunjanganKeluarga,
                                          int tunjanganUmumJabatan, int tunjanganBeras) {
        return 0; 
    }
    private static int kalkulasiPotonganPPH(int gajiPokok, String statusPernikahan, int gajiKotor,
                                            int jumlahAnak, int tunjanganKeluarga, int tunjanganAnak) {
        return 0; 
    }
    private static int kalkulasiPotonganIWP(int gajiPokok, int tunjanganAnak, int tunjanganKeluarga) {
        return 0; 
    }
    private static int kalkulasiPotonganTaperum(int golonganPangkat) {
        return 0;
    }
    private static int kalkulasiGajiBersih(int gajiKotor, int potonganPPH, int potonganIWP, int potonganTaperum) {
        return 0; 
    }
    private static void displayOutput(String nama, int gajiPokok, int tunjanganKeluarga, int tunjanganAnak,
                                      int tunjanganBeras, int tunjanganUmumJabatan, int gajiKotor, int potonganPPH,
                                      int potonganIWP, int potonganTaperum, int gajiBersih) {
        System.out.println("\n===== OUTPUT =====");
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan Keluarga: " + tunjanganKeluarga);
        System.out.println("Tunjangan Anak: " + tunjanganAnak);
        System.out.println("Tunjangan Beras: " + tunjanganBeras);
        System.out.println("Tunjangan Umum Jabatan: " + tunjanganUmumJabatan);
        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Potongan PPH 21: " + potonganPPH);
        System.out.println("Potongan IWP: " + potonganIWP);
        System.out.println("Potongan Taperum: " + potonganTaperum);
        System.out.println("Gaji Bersih (Take Home Pay): " + gajiBersih);
    }
}
