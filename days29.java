public class Days29 {
    public static void main(String[] args) {
        int angka1 = 15;
        int angka2 = 20;

        // Operator perbandingan <
        boolean hasilKurangDari = angka1 < angka2; 
        // true karena 15 lebih kecil dari 20

        // Operator perbandingan >
        boolean hasilLebihDari = angka1 > angka2; 
        // false karena 15 tidak lebih besar dari 20

        System.out.println("Nilai angka1 = " + angka1);
        System.out.println("Nilai angka2 = " + angka2);

        System.out.println("Apakah angka1 < angka2? " + hasilKurangDari);
        System.out.println("Apakah angka1 > angka2? " + hasilLebihDari);
    }
}
