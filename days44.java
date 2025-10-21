import java.util.Scanner;

public class days44 {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Masukkan nilai angka (0-100): ");
        
        int nilai = w.nextInt(); 
        String predikat;

        if (nilai >= 85) {
            predikat = "A";
        } else if (nilai >= 70) {
            predikat = "B";
        } else if (nilai >= 55) {
            predikat = "C";
        } else if (nilai >= 40) { 
            predikat = "D";
        } else { 
            predikat = "E";
        }

        System.out.println("Nilai Anda: " + nilai);
        System.out.println("Predikat: " + predikat);
        
    }
}
