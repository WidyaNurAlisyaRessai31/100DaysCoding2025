import java.util.Scanner;

public class days45{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih angka satu.");
                break;
            case 2:
                System.out.println("Kamu memilih angka dua.");
                break;
            case 3:
                System.out.println("Kamu memilih angka tiga.");
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}
