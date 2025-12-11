public class days95 {
    // Method void dengan parameter
    static void cetakPesan(String nama, int umur) {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }

    public static void main(String[] args) {
        // Memanggil method dengan mengirim parameter
        cetakPesan("Wiwi", 21);
        cetakPesan("Andi", 19);
    }
}
