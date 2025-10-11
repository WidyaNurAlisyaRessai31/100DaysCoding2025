
public class days34 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        boolean kondisi1 = (a > b);
        boolean kondisi2 = (c == 3);
        boolean hasilLogika = kondisi1 && kondisi2;
        boolean atau = (c +3 == 5 || a -3 == b);
        boolean not = !((a / b) > c);

        System.out.println( " kondisi1 :"+ kondisi1 );
        System.out.println( " kondisi2 :"+ kondisi2 );
        System.out.println("Apakah a lebih besar dari b DAN c sama dengan 2? " + hasilLogika);
        System.out.println("Apakah a lebih besar dari b DAN c sama dengan 2? " + atau);
        System.out.println("Apakah a lebih besar dari b DAN c sama dengan 2? " + not);

    }
}
