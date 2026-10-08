import java.util.Scanner;

public class DiskonTokoBukuTrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean hariRabu = true;
        String jenisBuku = "Kamus";
        String JenisBuku = "Novel";
        int jumlBuku;
        int jumlKamusNovel;
        double diskonKamus = 0.1;
        double diskonNovel = 0.07;
        double diskonTambahan = 0.02;
        double diskTambahanNovel = 0.01;
        double diskSelain = 0.05;

        System.out.println("Apakah ini hari Rabu? ");
        hariRabu = sc.nextBoolean();
        
        if (hariRabu) {
            System.out.println("Buku apa yg mau di beli? ");
            jenisBuku = sc.nextLine();
            if (jenisBuku.equalsIgnoreCase("Kamus")) {
                System.out.println("Berapa jumlah kamus yg dibeli? ");
                jumlKamusNovel = sc.nextInt();
                double persentaseDiskKamus;
                if (jumlKamusNovel > 2) {
                    persentaseDiskKamus = diskonTambahan+diskonKamus;
                    System.out.println("Total : " + persentaseDiskKamus);
                } else {
                    System.out.println("Tidak dapat diskon");
                }
            } else if (jenisBuku.equalsIgnoreCase("Novel")) {
                System.out.println("Berapa jumlah novel yg dibeli? ");
                jumlKamusNovel = sc.nextInt();
                double persentaseDiskNovel;
                if (jumlKamusNovel > 3) {
                    persentaseDiskNovel = diskonTambahan+diskonNovel;
                    System.out.println("Total : " + persentaseDiskNovel);
                } else {
                    persentaseDiskNovel = diskTambahanNovel+diskonNovel;
                    System.out.println("Total : " + persentaseDiskNovel);
                }
            } else {
                System.out.println("Berapa jumlah buku yg dibeli? ");
                jumlBuku = sc.nextInt();
                if (jumlBuku > 3) {
                    double persentaseDiskBuku = diskSelain;
                    System.out.println("Total : " + persentaseDiskBuku);
                } else{
                    System.out.println("Tidak dapat diskon");
                }
            }
        } else {
            System.out.println("Tidak ada diskon di hari selain rabu");
        }
    }
}
