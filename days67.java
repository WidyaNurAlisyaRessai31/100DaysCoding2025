import java.util.Scanner;

public class days67 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bintang/panjang garis horizontal: ");
        int n = w.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        
      
    }
}
