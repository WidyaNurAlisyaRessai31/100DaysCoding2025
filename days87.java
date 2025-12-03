import java.util.Scanner;

public class days87 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        int[] data = {10, 20, 30, 40, 50};

        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = w.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan dalam array.");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan dalam array.");
        }
    }
}
