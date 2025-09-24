public class days17 {
    public static void main(String[] args) {
        // Mendeklarasikan variabel integer
        int a = 10;
        int b = 3;
        int c = 11;
        int d = 4;
        
        // Menggunakan operator modulus
        int hasil1 = a % b; // 10 dibagi 3 sisanya 1
        int hasil2 = c % d; // 11 dibagi 4 sisanya 3 `        
        // Menampilkan hasil
        System.out.println("Hasil dari 10 % 3 adalah: " + hasil1); // Output: 1
        System.out.println("Hasil dari 11 % 4 adalah: " + hasil2); // Output: 3
    }
}
