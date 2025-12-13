import java.util.Scanner;

public class days97 {

    public static int hitungLuas(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();

        int hasil = hitungLuas(sisi);

        System.out.println("Luas persegi adalah: " + hasil);
    }
}
