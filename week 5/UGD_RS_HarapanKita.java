import java.util.Scanner;

public class UGD_RS_HarapanKita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data pasien dan kondisi UGD
        System.out.print("Masukkan saturasi oksigen (SpO2 dalam %): ");
        double spO2 = scanner.nextDouble();

        System.out.print("Masukkan jumlah sisa bed ICU: ");
        int sisaBedICU = scanner.nextInt();

        System.out.print("Masukkan tekanan darah sistolik (mmHg): ");
        int sistolik = scanner.nextInt();

        System.out.print("Apakah pasien sadar penuh? (true/false): ");
        boolean sadarPenuh = scanner.nextBoolean();

        System.out.print("Masukkan suhu tubuh (°C): ");
        double suhu = scanner.nextDouble();

        System.out.print("Apakah memiliki riwayat komorbid? (true/false): ");
        boolean komorbid = scanner.nextBoolean();

        System.out.print("Masukkan usia pasien (tahun): ");
        int usia = scanner.nextInt();

        System.out.print("Masukkan laju napas (kali/menit): ");
        int lajuNapas = scanner.nextInt();

        String ruangPerawatan = "";

        // Penentuan alokasi ruang berdasarkan kondisi
        if (spO2 < 85 && sisaBedICU > 0) {
            ruangPerawatan = "ICU";
        } else if (spO2 < 85 && sisaBedICU == 0) {
            ruangPerawatan = "UGD_VENTILATOR_MOBIL";
        } else if ((spO2 >= 85 && spO2 <= 89) || (sistolik < 90 || sistolik > 180) || !sadarPenuh) {
            ruangPerawatan = "RESUSITASI_UGD";
        } else if (((spO2 >= 90 && spO2 <= 94) || suhu > 39) && komorbid && usia >= 65) {
            ruangPerawatan = "HCU_ISOLASI";
        } else if ((spO2 >= 90 && spO2 <= 94) || lajuNapas > 24) {
            ruangPerawatan = "RAWAT_INAP_UMUM";
        } else {
            ruangPerawatan = "RAWAT_JALAN";
        }

        // Output hasil
        System.out.println("\n-------------------------------------------");
        System.out.println("Alokasi Ruang Perawatan: " + ruangPerawatan);
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}