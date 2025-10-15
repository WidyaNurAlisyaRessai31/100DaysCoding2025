import java.util.Scanner;

public class days37 {
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka =ww.nextInt();
        if(angka % 2==0 ){
            System.out.println( angka + "genap");
        }else{
            System.out.println(angka + "ganjil");
        }
    }
}
