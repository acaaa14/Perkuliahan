package praktikum.PraktikumPBO.sesi5;
import java.util.Scanner;

public class kuis9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int jumlahGanjil = 0;
            int jumlahGenap = 0;
    
            while (true) {
                System.out.print("Masukkan angka (masukkan angka negatif untuk berhenti): ");
                int angka = scanner.nextInt();
    
                if (angka < 0) {
                    break;  
                }
    
                if (angka % 2 == 0) {
                    jumlahGenap++;  
                } else {
                    jumlahGanjil++;  
                }
            }
    
            System.out.println("Jumlah angka genap: " + jumlahGenap);
            System.out.println("Jumlah angka ganjil: " + jumlahGanjil);
        }
    }
     

