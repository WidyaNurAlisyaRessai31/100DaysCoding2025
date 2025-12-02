public class days86 {
    public static void main(String[] args) {
        int[] angka = {12, 45, 7, 30, 56, 22};

        int min = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }

        System.out.println("Angka terkecil dalam array adalah: " + min);
    }
}
