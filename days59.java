import java.util.Scanner;

public class days59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();


        System.out.println("Angka ganjil dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        
        System.out.println("Angka genap dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) { 
                System.out.print(i + " ");
            }
        }

        
    }
}
