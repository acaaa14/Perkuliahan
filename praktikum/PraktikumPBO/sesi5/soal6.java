package praktikum.PraktikumPBO.sesi5;
import java.util.Scanner;
public class soal6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int terbesar = Integer.MIN_VALUE;  
        
        System.out.println("Masukkan 5 angka:");
        for (int i = 0; i < 5; i++) {
            int angka = scanner.nextInt();  
            if (angka > terbesar) {
                terbesar = angka;  
            }
        }
        
        System.out.println("Angka terbesar adalah: " + terbesar);
    }
}


