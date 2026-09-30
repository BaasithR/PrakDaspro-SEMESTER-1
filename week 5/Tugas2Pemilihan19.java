import java.util.Scanner;

public class Tugas2Pemilihan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSks;
        System.out.println("Masukkan jumlah SKS : ");
        jumlahSks = sc.nextInt();

        if (jumlahSks>24){
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
    }
}
