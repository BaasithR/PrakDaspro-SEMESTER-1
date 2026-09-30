import java.util.Scanner;

public class Cetak_Jilid19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lembar;
        int totalCetak, totalSemua;
        int biayaCetak = 500;
        int biayaJilid = 5000;

        System.out.print("Cetak berapa lembar : ");
        lembar = sc.nextInt();

        totalCetak = lembar * biayaCetak;
        totalSemua = totalCetak+biayaJilid;

        System.out.println("Total Biaya : Rp. " +totalSemua);

    }
}
