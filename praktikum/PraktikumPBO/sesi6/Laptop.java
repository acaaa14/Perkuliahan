package praktikum.PraktikumPBO.sesi6;

public class Laptop {
    //buatlah 3 proprtiy untuk class leptop
    String pemilik;
    String merek;
    double ukuranLayar;
    //buat 2 method untuk class laptop
    String HidupkanLeptop(){
        return"\nhidupkan leptop";
    }

    String MatikanLeptop(){
        return"matikan leptop";
    }
};
class BelajarJava{
    public static void main (String args [] ){
        //buat objek dari class laptop (instansiasi)
        Laptop laptopAca = new Laptop();
        Laptop laptopLomon = new Laptop();
        //set nilai property
        laptopAca.pemilik = "Aca";
        laptopAca.merek = "ASUS";
        laptopAca.ukuranLayar = 15.6;
        laptopLomon.pemilik = "\nlomon";
        laptopLomon.merek = "lenovo";
        laptopLomon.ukuranLayar = 14.9;

        //tampilan property object laptop
        System.out.println( laptopAca.pemilik);
        System.out.println( laptopAca.merek);
        System.out.println(laptopAca.ukuranLayar);
        System.out.println( laptopLomon.pemilik);
        System.out.println( laptopLomon.merek);
        System.out.println(laptopLomon.ukuranLayar);

        //tampilan hasil method object laptop
        System.out.println(laptopAca.HidupkanLeptop());
        System.out.println(laptopAca.MatikanLeptop());         
}
}
