import java.util.Scanner;

public class TanahTonoInput19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lebar, panjang, diameter, sisi;
        double lingkaran = 3.14;

        System.out.println("Masukkan lebar tanah: ");
        lebar = sc.nextDouble();
        System.out.println("Masukkan panjang tanah: ");
        panjang = sc.nextDouble();
        System.out.println("Masukkan diameter kolam: ");
        diameter = sc.nextDouble();
        System.out.println("Masukkan sisi taman: ");
        sisi = sc.nextDouble();
        
        double luasTanah = panjang * lebar;
        double jariJari = diameter / 2;
        double luasKolam = lingkaran * jariJari * jariJari;
        double luasTaman = sisi * sisi;
        double luasTidakDigunakan = luasTanah-luasKolam-luasTaman;

        System.out.println("\nLuas tanah           : " + luasTanah);
        System.out.println("Luas kolam           : " + luasKolam);
        System.out.println("Luas taman           : " + luasTaman);
        System.out.println("Luas tidak digunakan : " +luasTidakDigunakan);
    }
}