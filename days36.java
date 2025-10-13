import java.util.Scanner;

public class days36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" masukkan angka:");
        int angka = sc.nextInt();

        if (angka >= 50) {
            System.out.println("angka diatas 50");

            if (angka >= 70) {
                System.out.println("angka diatas 70");

            }


        }
        else if (angka >= 20){
            System.out.println("angka dibawah 50");
        }
        else {
            System.out.println("angka dibawah 20");
        }
    }
}
