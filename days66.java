import java.util.Scanner;

public class days66 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.print("Masukkan tinggi (n): ");
        int n = w.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
