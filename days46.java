import java.util.Scanner;
public class days46 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        
        System.out.println("===== MENU MAKANAN =====");
        System.out.println("1. nasi goreng");
        System.out.println("2. nasi campur");
        System.out.println("3. soto ayam");
        System.out.println("4. bakso");
        System.out.print("Pilih menu (1-4):");
        int pilih = w.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Anda memilih nasi goreng");
                System.out.println("Harga: Rp 15.000");
                break;
            case 2:
                System.out.println("Anda memilih nasi campur");
                System.out.println("Harga: Rp 13.000");
                break;
            case 3:
                System.out.println("Anda memilih soto ayam");
                System.out.println("Harga: Rp 12.000");
                break;
            case 4:
                System.out.println("Anda Memilih bakso");
                System.out.println("Harga: Rp 15.000");
                break;
            default:
                System.out.println("Pilihan tidak ada. Silakan coba lagi");
                break;
        }
    }
}
