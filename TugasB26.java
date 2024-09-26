import java.util.Scanner;

/**
 * TugasB26
 */
public class TugasB26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kategori = "input tidak valid";

        System.out.print("Masukkan Usia Anda: ");
        int usia = sc.nextInt();

        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else {
            System.out.println("input tidak valid");
        }
     
        System.out.println(" Kategori usia anda " + kategori);

        sc.close();

    }
}