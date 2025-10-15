import java.util.Scanner;

public class days38{
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = w.nextInt();
       
        if (bilangan > 0) {
            System.out.println("Bilangan " + bilangan + " adalah bilangan positif.");
        } else if (bilangan < 0) {
            System.out.println("Bilangan " + bilangan + " adalah bilangan negatif.");
        } else {
            System.out.println("Bilangan yang dimasukkan adalah nol (0).");
        }
    }
}
