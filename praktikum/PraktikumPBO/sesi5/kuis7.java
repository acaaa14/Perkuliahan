package praktikum.PraktikumPBO.sesi5;
import java.util.Scanner;
public class kuis7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas bawah: ");
        int batasBawah = scanner.nextInt();  
        System.out.print("Masukkan batas atas: ");
        int batasAtas = scanner.nextInt();  
        
        int jumlahPrima = 0;
        int angka = batasBawah;
        
        while (angka <= batasAtas) {
            if (apakahPrima(angka)) {
                jumlahPrima++;  
            }
            angka++;
        }
        
        System.out.println("Jumlah bilangan prima: " + jumlahPrima);
    }

    public static boolean apakahPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}


