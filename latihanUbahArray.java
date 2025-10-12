public class LatihanUbahArray {
    public static void main(String[] args) {
        int[] angka = {1, 2, 5, 3, 6};

        System.out.println("Array sebelum diubah:");
        for (int a : angka) {
            System.out.print(a + " ");
        }

        // Ubah urutan elemen sesuai permintaan
        int[] hasil = {angka[0], angka[4], angka[1], angka[2], angka[3]};

        System.out.println("\n\nArray setelah diubah:");
        for (int a : hasil) {
            System.out.print(a + " ");
        }
    }
}
