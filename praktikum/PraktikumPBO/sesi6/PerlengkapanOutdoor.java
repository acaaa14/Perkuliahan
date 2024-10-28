package praktikum.PraktikumPBO.sesi6;
import java.util.Scanner;

// Kelas utama
public class PerlengkapanOutdoor{
    public static void main(String[] args) {
    
        PerlengkapanOutdoor p = new PerlengkapanOutdoor();
        p.tampilkanMenu();
        
        // Memilih barang untuk melihat detail
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPilih nomor barang untuk melihat detail: ");
        int pilihan = scanner.nextInt();
        p.tampilkanDetailKue(pilihan);

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk menampilkan daftar barang
    public void tampilkanMenu() {
        System.out.println("=== daftar perlengkapan ===");
        System.out.println("1. tenda ");
        System.out.println("2. sepatu tracking ");
        System.out.println("3. carier ");
        System.out.println("4. nesting ");

    }

    // Metode untuk menampilkan detail barang
    public void tampilkanDetailKue(int pilihan) {
        switch (pilihan) {
            case 1:
                System.out.println("Nama barang: tenda");
                System.out.println("Harga: Rp500.000");
                break;
            case 2:
                System.out.println("Nama barang: sepatu tracking");
                System.out.println("Harga: Rp300.000");
                break;
            case 3:
                System.out.println("Nama barang: carier");
                System.out.println("Harga: Rp900.000");
                break;
             case 4:
                System.out.println("Nama barang: nesting");
                System.out.println("Harga: Rp150.000");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}

        