import java.util.Scanner;

public class days79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = "wiwiressai";
        String pass = "wiwi123";

        String username, password;

        while (true) {
            System.out.print("Masukkan username: ");
            username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            password = scanner.nextLine();

            if (username.equals(user) && password.equals(pass)) {
                System.out.println("Login berhasil! Selamat datang.");
                break;
            } else {
                System.out.println("Username atau password salah. Coba lagi.");
            }
        }

        scanner.close();
    }
}
