package praktikum.PraktikumPBO.sesi4;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);
        System.out.print("apakah ada kartu member: ");
        kartu = scan.nextLine();
        System.out.print("total belanjaan: ");
        belanjaan = scan.nextInt();

        if(kartu.equalsIgnoreCase("ya")){
            if (belanjaan > 500000) {
                diskon = 500000;
            } else if (belanjaan > 100000){
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else {
            if (belanjaan > 100000){
                diskon =5000;
            }else {
                diskon = 0;
            }
        }
        bayar = belanjaan - diskon;

        System.err.println("total bayar: rp " + bayar);

    }
}