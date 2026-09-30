import java.util.Scanner;

public class TugasParkir19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lamaParkir;
        int totalParkir;
        int tarifDasar = 2000;
        int tambahanTarif = 1000;
        System.out.println("Masukkan lama parkir (jam) : ");
        lamaParkir = sc.nextInt();

        if(lamaParkir>2){
            System.out.println("Total Parkir : Rp." + lamaParkir*tambahanTarif);
        } else {
            System.out.println("Total Parkir : Rp." + tarifDasar);
        }
    }
}