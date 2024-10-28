package praktikum.PraktikumPBO.sesi4;


import java.util.Scanner;
public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahNilai = 0;
        double totalNilai = 0;
        char lanjut;

        do { 
            System.out.print("masukkan nilai: ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
            jumlahNilai++;

            System.out.print("apakah anda ingin memasukkan nilai lain? (Y/N): ");
            lanjut = input.next().charAt(0);
        } while (lanjut == 'Y');
        Double rataRata = totalNilai / jumlahNilai;
        System.out.println("rata rata nilai: "+ rataRata);
    }
}
