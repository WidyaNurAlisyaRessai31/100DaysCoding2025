import java.util.Scanner;

public class days73 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        
        int angka;
        int total = 0;

        while (true) {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            angka = w.nextInt();

            if (angka < 0) {
                break; 
            }

            total += angka;
        }

        System.out.println("\nTotal penjumlahan: " + total);
    }
}
