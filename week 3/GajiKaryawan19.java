import java.util.Scanner;

public class GajiKaryawan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bonus;
        int totGaji;
        int gajiPokok;
        int tunjTransp = 60000;
        int tunjMkn = 40000;

        System.out.print("Masukkan gaji : ");
        gajiPokok = sc.nextInt();

        bonus= 0.5*gajiPokok;
        totGaji=(int)(gajiPokok+bonus+tunjTransp+tunjMkn-(0.1*gajiPokok));
        System.out.println("Total Bonus :" + bonus);
        System.out.println("Total Gaji : " + totGaji);
    }
}
