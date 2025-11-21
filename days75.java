
import java.util.Scanner;

public class days75 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = w.nextLine();
      
        System.out.println("Panjang teks         : " + teks.length()); 
        System.out.println("Huruf besar          : " + teks.toUpperCase());
        System.out.println("Huruf kecil          : " + teks.toLowerCase());
       
    }
}
