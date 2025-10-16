import java.util.Scanner;

public class days39 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.println("== Menu Kopi ===");
        System.out.println("1. Americano");
        System.out.println("2. V60");
        System.out.println("3. Expresso");
     
        System.out.print("Pilih menu (1-3): ");
        int pilihan = w.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Americano. Harga: Rp17.000");
        } 
        else if (pilihan == 2) {
            System.out.println("Anda memilih V60. Harga: Rp30.000");
        } 
        else if (pilihan == 3) {
            System.out.println("Anda memilih Expresso. Harga: Rp15.000");
        } 
      
        else {
            System.out.println("Pilihan tidak tersedia.");
        }
    }
}
