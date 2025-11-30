import java.util.Scanner;

public class days84 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = w.nextInt();

        int[] angka = new int[n];
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = input.nextInt();
            total += angka[i]; 
        }

        System.out.println("Total jumlah elemen array : " + total);
    }
}
