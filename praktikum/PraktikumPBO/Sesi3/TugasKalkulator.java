package praktikum.PraktikumPBO.Sesi3;
import java.util.Scanner;

public class TugasKalkulator {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("=== ini kalkulator ===");
        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan Anda (1-4): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;
        boolean valid = true;

    
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                valid = false;
        }

        if (valid) {
            System.out.println("Hasil: " + hasil);
        }
    
}
}
