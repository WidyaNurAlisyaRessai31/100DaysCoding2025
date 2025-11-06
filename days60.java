import java.util.Scanner;

public class days60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.println("\nAngka ganjil dari 1 sampai " + (N - 1) + ":");
        for (int i = 1; i < N; i++) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nAngka genap dari 1 sampai " + (N - 1) + ":");
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) { 
                System.out.print(i + " ");
            }
        }

     
    }
}
