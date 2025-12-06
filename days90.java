public class days90 {

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static String sapaan(String nama) {
        return "Halo, " + nama + "!";
    }

    public static void main(String[] args) {
        int hasil = tambah(5, 7);
        System.out.println("Hasil penjumlahan: " + hasil);

        String text = sapaan("Wiwi");
        System.out.println(text);
    }
}
