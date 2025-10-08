
public class days31 {
    public static void main(String[] args) {
        
        int nilai1 = 80;
        int nilai2 = 90;

        // Operator logika AND (&&)
        // Kondisi hanya TRUE jika keduanya TRUE
        boolean hasil = (nilai1 > 70) && (nilai2 > 85);

        System.out.println("Nilai 1: " + nilai1);
        System.out.println("Nilai 2: " + nilai2);
        System.out.println("Apakah kedua nilai di atas standar? " + hasil);
    }
}
