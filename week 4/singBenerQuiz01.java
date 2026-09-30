import java.util.Scanner;

public class singBenerQuiz01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array nama produk
        String[] namaProduk = {"Handphone", "Kabel", "Earphone"};
        
        // Array untuk menyimpan hasil kalkulasi per produk
        double[] keuntunganProduk = new double[3];
        int[] itemPenghitungKeuntungan = new int[3];
        int[] barangRusak = new int[3];

        double totalKeuntungan = 0;
        int totalItemPenghitungKeuntungan = 0;

        // Loop untuk menginput data 3 jenis produk
        for (int i = 0; i < 3; i++) {
            System.out.println("=== Input Data Produk: " + namaProduk[i] + " ===");
            System.out.print("Harga Jual (Rp)              : ");
            double hargaJual = input.nextDouble();
            
            System.out.print("Harga Beli (Rp)              : ");
            double hargaBeli = input.nextDouble();
            
            System.out.print("Biaya Pengiriman (Rp)        : ");
            double biayaPengiriman = input.nextDouble();
            
            System.out.print("Biaya Pengemasan (Rp)        : ");
            double biayaPengemasan = input.nextDouble();
            
            System.out.print("Diskon (Rp)                  : ");
            double diskon = input.nextDouble();
            
            System.out.print("Faktor Resiko Kerusakan (%)  : ");
            double resikoKerusakan = input.nextDouble();
            
            System.out.print("Jumlah Penjualan ( unit )    : ");
            int jumlahTerjual = input.nextInt();

            // 1. Hitung Keuntungan per Item
            // Keuntungan per Item = Harga jual - Harga Beli - Biaya Pengiriman - Biaya Pengemasan - Diskon
            double keuntunganPerItem = hargaJual - hargaBeli - biayaPengiriman - biayaPengemasan - diskon;

            // 2. Hitung jumlah barang beresiko rusak
            barangRusak[i] = (int) ( (resikoKerusakan / 100.0) * jumlahTerjual );

            // 3. Hitung jumlah item penghitung keuntungan
            // Jumlah Item Penghitung Keuntungan = Jumlah Terjual - (Faktor Resiko Kerusakan / 100 * Jumlah Terjual)
            itemPenghitungKeuntungan[i] = jumlahTerjual - barangRusak[i];

            // 4. Hitung Keuntungan Produk
            // Keuntungan Produk = Keuntungan per Item * Jumlah Item Penghitung Keuntungan
            keuntunganProduk[i] = keuntunganPerItem * itemPenghitungKeuntungan[i];

            // Akumulasi total keseluruhan
            totalKeuntungan += keuntunganProduk[i];
            totalItemPenghitungKeuntungan += itemPenghitungKeuntungan[i];

            System.out.println();
        }

        // Input target keuntungan total yang diharapkan
        System.out.print("Masukkan Target Keuntungan Total (Rp): ");
        double targetKeuntungan = input.nextDouble();

        // 5. Hitung Rata-rata keuntungan dari semua produk (Rp/produk)
        // Rata-rata = Total Keuntungan / Total jumlah Item Penghitung Keuntungan
        double rataRataKeuntungan = 0;
        if (totalItemPenghitungKeuntungan > 0) {
            rataRataKeuntungan = totalKeuntungan / totalItemPenghitungKeuntungan;
        }

        // 6. Hitung Persentase keuntungan dari target
        // Persentase = (Total Keuntungan / Target Keuntungan) * 100%
        double persentaseTarget = 0;
        if (targetKeuntungan > 0) {
            persentaseTarget = (totalKeuntungan / targetKeuntungan) * 100;
        }

        // Output Hasil
        System.out.println("\n================ HASIL KALKULASI ================");
        
        // Menampilkan barang rusak & keuntungan tiap jenis produk
        for (int i = 0; i < 3; i++) {
            System.out.printf("Keuntungan dari %s: Rp %.2f (Barang rusak: %d unit)\n", 
                               namaProduk[i], keuntunganProduk[i], barangRusak[i]);
        }

        System.out.println("-------------------------------------------------");
        System.out.printf("Total Keuntungan dari Semua Produk : Rp %.2f\n", totalKeuntungan);
        System.out.printf("Rata-rata Keuntungan               : Rp %.2f / produk\n", rataRataKeuntungan);
        System.out.printf("Persentase Keuntungan dari Target  : %.2f%%\n", persentaseTarget);
        System.out.println("=================================================");

        input.close();
    }
}

