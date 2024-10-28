package praktikum.PraktikumPBO.sesi4;

import java.util.Scanner;
public class Faktorial {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("masukan sebuah angka: ");
    int angka = input.nextInt();

    int Faktorial = 1;
    int i = angka;

    while (i > 0){
        Faktorial *= i;
        i--;
    }
    System.out.println("faktorial dari "+ angka + " adalah " + Faktorial);
    input.close();
}
}
