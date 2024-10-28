package praktikum.PraktikumPBO.Sesi3;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nama kamu: ");
        String nama = input.nextLine();
        System.out.print("hallo, "+ nama );
        input.close();
    }
    
}
