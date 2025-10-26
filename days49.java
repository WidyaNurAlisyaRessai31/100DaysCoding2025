import java.util.Scanner;

public class days49 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Masukkan nilai Wiwi: ");
        int nilai = w.nextInt();

        String hasil = (nilai >= 75) ? "Wiwi lulus " : "Wiwi belum lulus";

        System.out.println(hasil);
    }
}
