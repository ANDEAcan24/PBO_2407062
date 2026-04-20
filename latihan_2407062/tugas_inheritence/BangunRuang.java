package latihan_2407062.tugas_inheritence;

public class BangunRuang {
    int panjang, lebar, tinggi;

    public BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void tampilkanInfoRuang() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi: " + tinggi);
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // kalau mau beda (child), boleh override nanti
    public int hitungVolume2() {
        return panjang * lebar * tinggi;
    }
}