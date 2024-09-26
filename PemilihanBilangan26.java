import java.util.Scanner;

public class PemilihanBilangan26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String Hasil = (angka % 2==0)? "genap" : "ganjil";

        System.out.println(angka + " adalah Bilangan " + Hasil);
    }
    
}
