import java.util.Scanner;

public class days96 {
    
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static double bagi(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int x = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int y = sc.nextInt();

        int hasilTambah = tambah(x, y);
        int hasilKurang = kurang(x, y);
        int hasilKali = kali(x, y);
        double hasilBagi = bagi(x, y);

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Penjumlahan: " + hasilTambah);
        System.out.println("Pengurangan: " + hasilKurang);
        System.out.println("Perkalian: " + hasilKali);
        System.out.println("Pembagian : " + hasilBagi);

    }
}
