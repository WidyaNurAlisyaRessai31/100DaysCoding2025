import java.util.Scanner;

public class eval04_soal2 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        String a = w.nextLine();
        String folder1 = w.nextLine();
        String folder2 = w.nextLine();

        String output = a+ ":\\" + folder1 + "\\" + folder2;
        System.out.println(output);

    }
}
