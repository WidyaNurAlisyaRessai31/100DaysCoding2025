import java.util.Scanner;

public class days48 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = w.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = w.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = w.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break; yg 
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
        }

        
    }
}
