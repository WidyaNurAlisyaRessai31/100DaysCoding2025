public class days21 {
    public static void main(String[] args) {
        int a = 15; 
        int b = 45;  
        

        a = a + b;  // a sekarang = 15 + 45 = 60
        b = a - b;  // b sekarang = 60 - 45 = 15
        a = a - b;  // a sekarang = 60 - 15 = 45
        

        System.out.println("sudah ditukar");
        System.out.println("nilai a : " + a);
        System.out.println("nilai b : " + b);
    }
}
