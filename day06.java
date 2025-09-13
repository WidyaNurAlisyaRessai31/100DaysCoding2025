public class day06 {
        public static void main(String[] args) {
            // --- PENJELASAN TIPE DATA ---
            System.out.println("=== Penjelasan Tipe Data Pecahan ===");
            System.out.println("float  : tipe pecahan 32-bit (sekitar 6-7 digit presisi)");
            System.out.println("double : tipe pecahan 64-bit (sekitar 15-16 digit presisi)");
            System.out.println("double adalah default untuk angka desimal di Java\n");

            // --- CONTOH NILAI ---
            float  contohFloat  = 3.141592f;          // harus diakhiri huruf f
            double contohDouble = 3.141592653589793;  // tidak perlu akhiran

            System.out.println("Contoh nilai float  : " + contohFloat);
            System.out.println("Contoh nilai double : " + contohDouble + "\n");

            // --- PERBEDAAN PRESISI ---
            System.out.println("=== Perbedaan Presisi ===");
            float  hasilFloat  = 1.0f / 7.0f;
            double hasilDouble = 1.0  / 7.0;

            System.out.println("1 ÷ 7 dengan float  : " + hasilFloat);
            System.out.println("1 ÷ 7 dengan double : " + hasilDouble + "\n");


        }
    }


