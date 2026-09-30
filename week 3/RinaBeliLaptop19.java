import java.util.Scanner;

public class RinaBeliLaptop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga_laptop, sisa_harga, total_cicil;
        double uang_muka, total_bunga, cicil_setiap_bulan;
        int jumlah_bulan_cicil;
        double bunga = 0.02;

        System.out.print("Masukkan Harga Laptop : ");
        harga_laptop= sc.nextDouble();

        System.out.print("Masukkan Uang Anda : ");
        uang_muka= sc.nextDouble();

        System.out.print("Cicil berapa bulan : ");
        jumlah_bulan_cicil= sc.nextInt();

        sisa_harga = harga_laptop-uang_muka;
        System.out.println("Sisa harga laptop : " +sisa_harga);

        total_bunga=bunga*sisa_harga;
        System.out.println("Total Bunga : " +total_bunga);

        total_cicil = sisa_harga+total_bunga;
        System.out.println("Total yang harus dicicil adalah Rp. " +total_cicil);

        cicil_setiap_bulan=total_cicil/jumlah_bulan_cicil;
        System.out.println("Cicilan perbulan adalah Rp. " +cicil_setiap_bulan);

    }
    
}
