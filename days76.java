public class days76 {
    public static void main(String[] args) {
        String teksAsli = "Halo Wiwiressai";
        String teksSama = "Halo Wiwiressai";
        String teksBedaKapital = "halo wiwiressai";
        String subTeks = "Halo";
        String teksKosong = "";

        // equals(Object anObject) ---
        System.out.println("--- 1. equals() ---");
        // Membandingkan isi String secara **case-sensitive** (memperhatikan huruf kapital).
        boolean cekEqualsSama = teksAsli.equals(teksSama);
        boolean cekEqualsBeda = teksAsli.equals(teksBedaKapital);
        System.out.println("teksAsli (\"" + teksAsli + "\") equals teksSama (\"" + teksSama + "\"): " + cekEqualsSama); // Output: true
        System.out.println("teksAsli (\"" + teksAsli + "\") equals teksBedaKapital (\"" + teksBedaKapital + "\"): " + cekEqualsBeda); // Output: false

        // equalsIgnoreCase(String anotherString) 
        System.out.println("\n--- 2. equalsIgnoreCase() ---");
        // Membandingkan isi String secara **case-insensitive** (TIDAK memperhatikan huruf kapital).
        boolean cekEqualsIgnoreCase = teksAsli.equalsIgnoreCase(teksBedaKapital);
        System.out.println("teksAsli (\"" + teksAsli + "\") equalsIgnoreCase teksBedaKapital (\"" + teksBedaKapital + "\"): " + cekEqualsIgnoreCase); // Output: true

        // contains(CharSequence s) 
        System.out.println("\n--- 3. contains() ---");
        // Memeriksa apakah String ini mengandung urutan karakter (substring) tertentu.
        // Ini juga **case-sensitive**.
        boolean cekContainsAda = teksAsli.contains(subTeks);
        boolean cekContainsBeda = teksAsli.contains("dunia");
        System.out.println("teksAsli (\"" + teksAsli + "\") contains subTeks (\"" + subTeks + "\"): " + cekContainsAda); // Output: true
        System.out.println("teksAsli (\"" + teksAsli + "\") contains \"dunia\": " + cekContainsBeda); // Output: false

        // isEmpty() 
        System.out.println("\n--- 4. isEmpty() ---");
        // Memeriksa apakah panjang String adalah 0 (tidak ada karakter sama sekali).
        boolean cekIsKosongAsli = teksAsli.isEmpty();
        boolean cekIsKosongTeksKosong = teksKosong.isEmpty();
        System.out.println("teksAsli (\"" + teksAsli + "\") isEmpty(): " + cekIsKosongAsli); // Output: false
        System.out.println("teksKosong (\"" + teksKosong + "\") isEmpty(): " + cekIsKosongTeksKosong); // Output: true
    }
}
