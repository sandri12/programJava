import java.util.Scanner;

public class Gaji{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kota cabang (P), posisi jabatan (Q), lama bekerja (R), dan status pernikahan (S)
        String cabang = scanner.nextLine();
        String jabatan = scanner.nextLine();
        int lamaBekerja = scanner.nextInt();
        boolean statusPernikahan = scanner.nextBoolean();

        // Hitung UMK berdasarkan kota cabang
        int umk = hitungUMK(cabang);

        // Hitung gaji pokok berdasarkan posisi jabatan dan lama bekerja
        int gajiPokok = hitungGajiPokok(jabatan, lamaBekerja, umk);

        // Hitung tunjangan keluarga
        int tunjanganKeluarga = (statusPernikahan) ? (int) (0.1 * gajiPokok) : 0;

        // Hitung tunjangan jabatan
        int tunjanganJabatan = (lamaBekerja > 4) ? (int) (0.05 * gajiPokok) : 0;

        // Hitung tunjangan pegawai berdasarkan posisi jabatan
        int tunjanganPegawai = hitungTunjanganPegawai(jabatan);

        // Hitung gaji kotor
        int gajiKotor = gajiPokok + tunjanganKeluarga + tunjanganJabatan + tunjanganPegawai;

        // Hitung potongan pensiun, BPJS, dan PPH
        int potonganPensiun = (int) (0.02 * gajiKotor);
        int potonganBPJS = (int) (0.02 * gajiKotor);
        int potonganPPH = (int) (0.05 * gajiKotor);

        // Hitung gaji bersih
        int gajiBersih = gajiKotor - potonganPensiun - potonganBPJS - potonganPPH;

        // Output hasil perhitungan
        System.out.println(gajiPokok);
        System.out.println(tunjanganKeluarga);
        System.out.println(tunjanganJabatan);
        System.out.println(tunjanganPegawai);
        System.out.println(gajiKotor);
        System.out.println(potonganPensiun);
        System.out.println(potonganBPJS);
        System.out.println(potonganPPH);
        System.out.println(gajiBersih);
    }

    // Fungsi untuk menghitung UMK berdasarkan kota cabang
    public static int hitungUMK(String cabang) {
        switch (cabang.toLowerCase()) {
            case "garut":
                return 1961085;
            case "bandung":
                return 3742276;
            case "jakarta":
                return 4453935;
            case "bekasi":
                return 4782935;
            case "bogor":
                return 4330249;
            case "palembang":
                return 3289409;
            default:
                return 0;
        }
    }

    // Fungsi untuk menghitung gaji pokok berdasarkan posisi jabatan dan lama bekerja
    public static int hitungGajiPokok(String jabatan, int lamaBekerja, int umk) {
        switch (jabatan.toLowerCase()) {
            case "admin":
                return (lamaBekerja < 2) ? umk : (int) (1.2 * umk);
            case "coordinator":
                return (lamaBekerja < 3) ? (int) (1.1 * umk) : (int) (1.3 * umk);
            case "spv":
                if (lamaBekerja < 2) {
                    return (int) (1.25 * umk);
                } else if (lamaBekerja >= 2 && lamaBekerja <= 4) {
                    return (int) (1.4 * umk);
                } else {
                    return (int) (1.5 * umk);
                }
            case "sprinter":
                return (int) (0.9 * umk);
            case "officer":
                return umk;
            case "manager":
                return (lamaBekerja < 3) ? (int) (1.5 * umk) : (int) (2.0 * umk);
            default:
                return 0;
        }
    }

    // Fungsi untuk menghitung tunjangan pegawai berdasarkan posisi jabatan
    public static int hitungTunjanganPegawai(String jabatan) {
        switch (jabatan.toLowerCase()) {
            case "admin":
                return 200000;
            case "coordinator":
                return 500000;
            case "spv":
                return 700000;
            case "manager":
                return 1000000;
            case "sprinter":
            case "officer":
                return 200000;
            default:
                return 0;
        }
    }
}
