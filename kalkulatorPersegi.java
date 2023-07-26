import java.util.Scanner;

public class kalkulatorPersegi {
    public static void main(String[] args) {
        Scanner kalkulator = new Scanner(System.in);

       System.out.print("Masukkan Alas: ");
       double alas = kalkulator.nextDouble();

       System.out.print("Masukkan Tinggi: ");
       double tinggi = kalkulator.nextDouble();

       double hasil = 0.5 * alas * tinggi;

       String x = "Hasil :";

       System.out.println(x + hasil);
        kalkulator.close();
    }
}
