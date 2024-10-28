package praktikum.PraktikumPBO.sesi6;

class Mobil {
    String aktifitas;
    String warna;
    int kecepatan;

    public Mobil(String aktifitas, String warna, int kecepatan){
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }
    void cekKecepatan(){
        if (kecepatan==0){
            aktifitas="parkir";
        }else if (kecepatan>=1){
            aktifitas="berjalan";
    }else {
        aktifitas="eror";
    }
}

    void cekAtribute(){
        System.out.println("aktifitas= " +aktifitas);
        System.out.println("warna= " +warna);
        System.out.println("kecepatan= " +kecepatan);
    }
    
}

public class ClassMobil{
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("jalan", "biru", 10);
        mobilku.cekKecepatan();
        mobilku.cekAtribute();

    }
}
        