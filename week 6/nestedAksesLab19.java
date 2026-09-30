import java.util.Scanner;

public class nestedAksesLab19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah status mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.println("Apakah dikenakan sanksi? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();
        System.out.println("Apakah punya izin dari dosen? (true/false): ");
        boolean punyaIzinDosen = sc.nextBoolean();
        System.out.println("Apakah merupakan asisten lab? (true/false): ");
        boolean asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
