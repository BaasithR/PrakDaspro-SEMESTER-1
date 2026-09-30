import java.util.Scanner;

public class MenghitungTotalBayar19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        double potongan;
        double jml_bayar;
        double diskon =0.15;

        System.out.print("Masukkan harga baju : ");
        harga = sc.nextInt();
        potongan=harga*diskon;
        jml_bayar=harga-potongan;

        System.out.println("Potongan : " +potongan);
        System.out.println("Jumlah yg harus anda bayar adalah Rp." +jml_bayar);
    }
}
