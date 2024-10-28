package praktikum.PraktikumPBO.sesi4;

public class BilanganPrima {
    public static void main(String[] args) {
        int batasBawah = 2, batasAtas = 30;
        System.err.println("bilangan prima antara " + batasBawah + " dan " + batasAtas +" adalah:");

        for (int i = batasBawah; i <= batasAtas; i++) {
            Boolean prima = true;

            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
           if  (prima) {
            System.out.print(i + " ");
           }
        }
    }
}
