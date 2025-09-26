import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // minta pengguna memasukkan angka
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        // cek genap atau ganjil
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah genap");
        } else {
            System.out.println("Angka " + angka + " adalah ganjil");
        }

        input.close();
    }
}
