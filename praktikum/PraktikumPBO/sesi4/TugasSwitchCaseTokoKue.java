package praktikum.PraktikumPBO.sesi4;
import java.util.Scanner;
public class TugasSwitchCaseTokoKue {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat datang di Toko Kue Kami!");
        System.out.println("Ada Yang Bisa Kami Bantu?");
        System.out.println("Anda Bisa Pilih jenis kue yang tersedia:");
        System.out.println("1. Kue Coklat - Rp 45.000");
        System.out.println("2. Kue Keju - Rp 35.000");
        System.out.println("3. Kue Stroberi - Rp 25.000");
        System.out.println("4. Kue Coklat Keju - Rp 50.000");

        System.out.print("Masukkan nomor pilihan kue (1-4): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Kue Coklat. Harganya adalah Rp 45.000.");
                break;
            case 2:
                System.out.println("Anda memilih Kue Keju. Harganya adalah Rp 35.000.");
                break;
            case 3:
                System.out.println("Anda memilih Kue Stroberi. Harganya adalah Rp 25.000.");
                break;
            case 4:
                System.out.println("Anda memilih Kue Coklat Keju. Harganya adalah Rp 50.000.");
                break;
            default:
                System.out.println("Maaf, pilihan tidak valid. Silakan coba lagi.");
                break;
        }

        System.out.println("Anda Bisa Membayarnya Dikasir!");
        System.out.println("Terima kasih telah berbelanja di Toko Kue Kami!");

        scanner.close();
    }
}

    

