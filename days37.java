import java.util.Scanner;

public class days37 {
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.print("Masukkan suhu : ");
        int suhu =ww.nextInt();
        if(suhu >= 38){
            System.out.println("Suhu Tinggi");
        }else{
            System.out.println("Suhu Rendah");
        }
    }
}
