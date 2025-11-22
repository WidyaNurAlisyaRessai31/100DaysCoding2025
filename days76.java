public class days76 {
    public static void main(String[] args) {

        String teks1 = "halo wiwiressai here";
        String teks2 = "Halo Wiwiressai Here";
        String kosong = "";

        System.out.println("equals() : " + teks1.equals(teks2));
        System.out.println("equalsIgnoreCase() : " + teks1.equalsIgnoreCase(teks2));
        System.out.println("contains(\"wiwiressai\") : " + teks1.contains("wiwiressai"));
        System.out.println("isEmpty() : " + kosong.isEmpty());
    }
}
