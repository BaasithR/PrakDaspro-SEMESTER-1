import java.util.Scanner;

public class TugasAntrean19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Kode Layanan : ");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Legalisir Ijazah, menuju loket A");
                break;
            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah, menuju loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT, menuju loket C");
                break;
            case 4:
                System.out.println("Pengajuan Cuti Kuliah, menuju loket D");
                break;
            default:
                System.out.println("Kode Layanan Invalid");
                break;
        }
    }
}
