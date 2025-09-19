import java.util.Scanner;

public class days12 {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner scanner = new Scanner(System.in);

        // Input data dari user
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer agar tidak error saat input String berikutnya

        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();

        System.out.print("Masukkan Hobi: ");
        String hobi = scanner.nextLine();

        // Output biodata
        System.out.println("\n=== BIODATA ===");
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur + " tahun");
        System.out.println("Alamat  : " + alamat);
        System.out.println("Hobi    : " + hobi);

        // Menutup scanner
        scanner.close();
    }
}
