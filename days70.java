import java.util.Scanner;

public class days70 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = w.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = w.nextInt();

        for (int i = 0; i < baris; i++) {      
            for (int j = 0; j < kolom; j++) {   
                System.out.print("* ");
            }
            System.out.println(); 
        }

       
    }
}
