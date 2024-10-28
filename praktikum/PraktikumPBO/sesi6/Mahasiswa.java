package praktikum.PraktikumPBO.sesi6;

public class Mahasiswa {
    public static void main(String[] args) {
       //instansiasi objek mahasiswa dengan menggunakan constructor
    //    MahasiswaMAIN mhs1 = new MahasiswaMAIN( "aca",17, "sistem informasi");
    MahasiswaMAIN mahasiswa = new MahasiswaMAIN( "aca",17, "sistem informasi");
//menampilkan informasi mahasiswa
    mahasiswa.tampilkanInfo();

    //mengubah nama dan umur menggunakan setter
    mahasiswa.setNama("rosita");
    mahasiswa.tampilkanInfo();

    mahasiswa.setUmur(18);
    mahasiswa.tampilkanInfo();

       //menampilkan kembali informasi setelah diubah
       System.out.println("\nSetelah diubah");
       mahasiswa.tampilkanInfo();
    }
}

class MahasiswaMAIN{
    //atribut (variabel instance)
    private String nama;
    private int umur;
    private String jurusan;

    //constructor (untuk menginstalasi atribut)
    public MahasiswaMAIN(String nama, int umur, String jurusan){
    this.nama = nama;
    this.umur =umur;
    this.jurusan = jurusan;
    }
    //metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo(){
        System.out.println("nama: " + this.nama);
        System.out.println("umur: " + this.umur);
        System.out.println("jurusan: " + this.jurusan);
    }

    //method getter untuk mengambil nama mahasiswa
    public String getNama(){
        return nama;
    }
    //method setter untuk mengubah nama mahasiswa
    public void setNama(String nama){
        this.nama = nama;
    }

    //method getter untuk mengambil umur mahasiswa
    public int getUmur(){
        return umur;
    }

    //method setter untuk mengubah umur mahasiswa
    public void setUmur(int umur){
        this.umur = umur;
    }

    //method getter untuk mengambil jurusan mahasiswa
    public String getJurusan(String jurusan){
        // this.jurusan = jurusan;
        return jurusan;
    }
}

