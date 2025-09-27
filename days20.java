public class days20 {
    public static void main(String[] args) {
       //Deklarasi variabel bertipe data primitif
        int angkaInt = 42;
        double angkaDouble = 19.75;
        boolean status = true;
        char huruf = 'A';

        //Mengubah (konversi) ke String dengan String.valueOf()
        String strInt = String.valueOf(angkaInt);
        String strDouble = String.valueOf(angkaDouble);
        String strBoolean = String.valueOf(status);
        String strChar = String.valueOf(huruf);

        //Menampilkan hasil konversi
        System.out.println("int -> String   : " + strInt);
        System.out.println("double -> String: " + strDouble);
        System.out.println("boolean -> String: " + strBoolean);
        System.out.println("char -> String  : " + strChar);
    }
}
