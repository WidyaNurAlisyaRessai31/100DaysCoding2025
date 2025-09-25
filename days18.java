public class days18 {
    public static void main(String[] args) {
        // tipe data kecil
        byte a = 42;
        short b = a;      // otomatis: byte -> short
        int c = b;        // otomatis: short -> int
        long d = c;       // otomatis: int -> long
        float e = d;      // otomatis: long -> float
        double f = e;     // otomatis: float -> double

        System.out.println("byte   : " + a);
        System.out.println("short  : " + b);
        System.out.println("int    : " + c);
        System.out.println("long   : " + d);
        System.out.println("float  : " + e);
        System.out.println("double : " + f);
    }
}
