package latihan_2407062.tugas_inheritence.tgs_polymorphism;

import latihan_2407062.src.bangun_datar_pbo.persegi;

public class main {
    
    public static void main(String[] args) {

        BangunDatar bd;

        bd = new persegi(4);
        bd.tampilkan();

        bd = new PersegiPanjang(5, 3);
        bd.tampilkan();

        bd = new Segitiga(6, 4);
        bd.tampilkan();
    
}
}
