import java.util.Scanner;

public class KonsultanPajak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pkp, pph;

        System.out.print("Masukkan penghasilan kena pajak (PKP) : Rp. ");
        pkp = sc.nextDouble();
        if (pkp <= 0) {
            pph = 0;
        } else if(pkp>0 && pkp<=60000000){
            pph=0.05*pkp;
        } else if (pkp>60000000 && pkp <= 250000000){
            double sisaPkp = pkp-60000000;
            pph=(0.05*60000000)+(0.15*sisaPkp);
        } else if(pkp>250000000 && pkp<=500000000){
            pph=(0.05*60000000)+(0.15*190000000)+(0.25*(pkp-250000000));
        } else{
            pph=(0.05*60000000)+(0.15*190000000)+(0.25*250000000)+(0.3*(pkp-50000000));
        }
        System.out.println(String.format("Total PPH Rp %,.2f", pph));
    }
}
