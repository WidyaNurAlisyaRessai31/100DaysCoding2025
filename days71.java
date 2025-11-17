import java.util.Scanner;

public class days71 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga (n): ");
        int n = w.nextInt();

        for (int i = 1; i <= n; i++) {         
            for (int j = 1; j <= i; j++) { 
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
