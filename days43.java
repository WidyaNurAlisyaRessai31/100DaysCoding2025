public class days43 {
    public static void main(String[] args) {
        System.out.println("Bilangan kelipatan 3, 5, dan 3 & 5 dari 1 sampai 50:\n");

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " adalah kelipatan 3 dan 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " adalah kelipatan 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " adalah kelipatan 5");
            }
        }
    }
}
