public class days30 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 5;

        System.out.println("Nilai A = " + a + ", B = " + b + ", C = " + c);

        // Operator Lebih dari atau Sama dengan (>=)
        System.out.println("A >= B: " + (a >= b)); // Hasil: true (karena A sama dengan B)
        System.out.println("A >= C: " + (a >= c)); // Hasil: true (karena A lebih dari C)
        System.out.println("C >= A: " + (c >= a)); // Hasil: false (karena C tidak lebih besar maupun sama)

        // Operator Kurang dari atau Sama dengan (<=)
        System.out.println("B <= A: " + (b <= a)); // Hasil: true (karena B sama dengan A)
        System.out.println("C <= A: " + (c <= a)); // Hasil: true (karena C kurang dari A)
        System.out.println("A <= C: " + (a <= c)); // Hasil: false (karena A tidak kurang dari maupun sama)
    }
}
