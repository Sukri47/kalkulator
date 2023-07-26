import java.util.Scanner;
public class kalkulatorTrapesium {
    public static void main(String[] args) {
        Scanner hitung = new Scanner(System.in);

        // Judul
        System.out.println("Trapesium");
        
        //isi nilai
        System.out.print("Masukkan Nilai Sisi AB (Sisi Atas Trapesium) : ");
        double sisiAtas = hitung.nextDouble();

        System.out.print("Masukkan Nilai Sisi BC dan DA (Sisi Kanan Dan Kiri Trapesium) : ");
        double sisiSamping = hitung.nextDouble();

        System.out.print("Masukkan Nilai Sisi CD (Sisi Bawah Trapesium) : ");
        double sisiBawah = hitung.nextDouble();

        System.out.print("Masukkan Nilai Tinggi : ");
        double tinggi = hitung.nextDouble();

        // hasil keliling
        double hasilKeliling = sisiAtas + sisiBawah + (sisiSamping * 2);
        System.out.println("Keliling = " + hasilKeliling);
        // hasil luas
        double hasilLuas = 0.5 * (sisiAtas + sisiBawah) * tinggi;
        System.out.println("Luas = " + hasilLuas);
        // close scanner
        hitung.close();
    }
}
