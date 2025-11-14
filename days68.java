import java.util.Scanner;

public class days68 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi: ");
        int n = w.nextInt();

        for (int i = 0; i < n; i++) {        
            for (int j = 0; j < n; j++) {    
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
