// Nama : Mochamad Razan Al Baasith
// NIM  : 264107020145

import java.util.Scanner;    //untuk mengimport file

public class Mochamad_Razan_Al_Baasith19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   //untuk menscan file program kita

        String[] barang = new String[4];   //untuk mendeklarasikan nama barang
        barang[0] = "Handphone";
        barang[1] = "Kabel";
        barang[2] = "Earphone";

        // mendeklarasikan input output
        int jumlahTerjual;
        float rataRata;
        String namaBarang="";
        double hargaBeli, hargaJual;
        double biayaPengemasan, biayaPengiriman;
        double diskon, resikoKerusakan;
        double keuntunganPerItem,KeuntunganProduk, JumlahItemPKeuntungan;
        double persentaseKeuntungan, targetKeuntungan;

        // untuk menginputkan nilai dari sebuah variabel diatas 
        System.out.println("Masukkan barang : ");
        namaBarang=sc.next();
        System.out.println("Masukkan harga jual : ");
        hargaJual=sc.nextDouble();
        System.out.println("Masukkan harga beli : ");
        hargaBeli=sc.nextDouble();
        System.out.println("Berapa biaya pengemasannya : ");
        biayaPengemasan=sc.nextDouble();
        System.out.println("Berapa biaya pengiriman : ");
        biayaPengiriman=sc.nextDouble();
        System.out.println("Masukkan Diskon barang : ");
        diskon=sc.nextDouble();
        System.out.println("Hitung faktor resiko kerusakan barang : ");
        resikoKerusakan=sc.nextDouble();
        System.out.println("Berapa jumlah barang yang terjual : ");
        jumlahTerjual=sc.nextInt();
        System.out.println("Berapa target keuntungan : ");
        targetKeuntungan=sc.nextDouble();
            
        // menghitung jumlah item penghitung keuntungan 
        JumlahItemPKeuntungan= jumlahTerjual-(resikoKerusakan/100*jumlahTerjual);
        System.out.println("Jumlah Item penghitung Keuntungan : "+JumlahItemPKeuntungan);
        // menghitung keuntungan per item
        keuntunganPerItem=hargaJual-hargaBeli-biayaPengiriman-biayaPengemasan-diskon;
        System.out.println("Keuntungan per Item :"+keuntunganPerItem);
        // menghitung keuntungan produk
        KeuntunganProduk=keuntunganPerItem*JumlahItemPKeuntungan;
        System.out.println("Keuntungan Produknya : "+KeuntunganProduk);

        System.out.println("Keuntungan dari tiap jenis produk Rp." +keuntunganPerItem);
        System.out.println("Total keuntungan dari semua jenis produk Rp. "+KeuntunganProduk);

        rataRata= (float)(KeuntunganProduk/JumlahItemPKeuntungan);
        System.out.println("Rata rata keuntungan dari semua produk Rp. "+rataRata);
        persentaseKeuntungan= (double)(KeuntunganProduk/targetKeuntungan*100/100);




        




        // if (a){
        //     System.out.println("Berapa harga jualnya : ");
        //     hargaJual = sc.nextDouble();
        //     System.out.println("Berapa harga belinya : ");
        //     hargaBeli = sc.nextDouble();
        // } else if (b){
        //     System.out.println("Berapa harga jualnya");
        //     hargaJual = sc.nextDouble();
        //     System.out.println("Berapa harga belinya : ");
        //     hargaBeli = sc.nextDouble();
        // } else {
        //     System.out.println("Berapa harga jualnya");
        //     hargaJual = sc.nextDouble();
        //     System.out.println("Berapa harga belinya : ");
        //     hargaBeli = sc.nextDouble();
        // }
        
        

        

    }
}