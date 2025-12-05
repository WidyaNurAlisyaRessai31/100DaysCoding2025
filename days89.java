public class days89 {
    public void salam() {
        System.out.println("hii guys, ini method void wiwiressai!");
    }

    public void hitungPersegi(int sisi) {
        int luas = sisi * sisi;
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas Persegi: " + luas);
    }

    public static void main(String[] args) {
        days89 objek = new days89();

        objek.salam();

        objek.hitungPersegi(5);
    }
}
