import java.util.Scanner;

public class days74{
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        int pilihan;
        do {
            // Tampilkan menu
            System.out.println("===========================");
            System.out.println("  *** MENU MINUMAN *** ");
            System.out.println("===========================");
            System.out.println("1. COFFEE ");
            System.out.println("2. JUICE");
            System.out.println("3. TEA");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda (1-4): ");

            pilihan = w.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("\nAnda memesan KOPI.");
                    break;
                case 2:
                    System.out.println("\nAnda memesan JUICE.");
                    break;
                case 3:
                    System.out.println("\nAnda memesan TEA.");
                    break;
                case 4:
                    System.out.println("\nAnda memilih: Keluar. Sampai jumpa!");
                    break;
                default:
                    System.out.println("\nInput tidak valid. Silakan masukkan angka 1 sampai 4.");
            }
            if (pilihan != 4) {
                System.out.println("\nTekan ENTER untuk melanjutkan...");
                input.nextLine(); 
                input.nextLine(); 
            }
        } while (pilihan != 4);
    }
}
