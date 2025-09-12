public class day05 {
    public static void main(String[] args) {
        // Tipe data byte: menyimpan bilangan bulat dari -128 sampai 127
        byte nilaiByte = 100;
        System.out.println("Nilai byte: " + nilaiByte);

        // Tipe data short: menyimpan bilangan bulat dari -32,768 sampai 32,767
        short nilaiShort = 30000;
        System.out.println("Nilai short: " + nilaiShort);

        // Tipe data int: tipe data bilangan bulat standar, dari -2,147,483,648 sampai 2,147,483,647
        int nilaiInt = 1000000000;
        System.out.println("Nilai int: " + nilaiInt);

        // Tipe data long: menyimpan bilangan bulat yang sangat besar
        // Harus diakhiri dengan huruf 'L' agar dikenali sebagai long
        long nilaiLong = 90000000000L;
        System.out.println("Nilai long: " + nilaiLong);
    }
}
