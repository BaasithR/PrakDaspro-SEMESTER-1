import java.util.Scanner;

public class tugas2SeleksiAsisten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isAktif;
        boolean sedangDisanksi;
        int nilaiDaspro,nilaiWawancara;
        boolean hasSertifikat;
        
        System.out.print("Apakah status mahasiswa aktif? ");
        isAktif = sc.nextBoolean();
        System.out.print("Apakah Mahasiswa mendapatkan sanksi akademik? ");
        sedangDisanksi = sc.nextBoolean();

        if (isAktif && !sedangDisanksi) {
            System.out.print("Berapa nilai Dasar Pemrograman? ");
            nilaiDaspro = sc.nextInt();
            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? ");
            hasSertifikat = sc.nextBoolean();
            if (nilaiDaspro >= 80 || hasSertifikat) {
                System.out.print("Berapa nilai wawancara? ");
                nilaiWawancara = sc.nextInt();
                if (nilaiWawancara >= 75) {
                    System.out.println("Mahasiswa diterima sebagai asisten");
                } else {
                    System.out.println("Ditolak sebagai asisten");
                }
            } else {
                System.out.println("Maaf syarat berkas tidak terpenuhi");
            } 
        } else {
            System.out.println("Maaf syaratmu tidak terpenuhi");
        }
        sc.close();
    }
}