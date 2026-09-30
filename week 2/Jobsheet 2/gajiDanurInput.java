import java.util.Scanner;

public class gajiDanurInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double potonganPensiun = 0.10;

        System.out.println("Masukkan gaji pokok : ");
        double gaji = sc.nextDouble();
        System.out.println("Masukkan Tunjangan anak perbulan : ");
        double tunjangan = sc.nextDouble();
        System.out.println("Masukkan jumlah anak : ");
        int jumlah = sc.nextInt();

        double totalPotongan =gaji*potonganPensiun;
        double totalTunjangan =tunjangan*jumlah;
        double totalGaji = gaji+totalTunjangan-totalPotongan;

        System.out.println("Total tunjangan anak : " +totalTunjangan);
        System.out.println("Total potongan gaji  : " + totalPotongan);
        System.out.println("Total gaji bersih    : " +totalGaji);
    }
}
