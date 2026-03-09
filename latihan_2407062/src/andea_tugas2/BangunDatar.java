package andea_tugas2;

public class BangunDatar {
 private double sisi;
    private double panjang;
    private double lebar;
    private double alas;
    private double tinggi;
    private double sisiMiring;
    private double diagonal1;
    private double diagonal2;

    // Setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    // Method Perhitungan
    public double luasPersegi() {
        return sisi * sisi;
    }

    public double kelilingPersegi() {
        return 4 * sisi;
    }

    public double luasPersegiPanjang() {
        return panjang * lebar;
    }

    public double kelilingPersegiPanjang() {
        return 2 * (panjang + lebar);
    }

    public double luasSegitiga() {
        return 0.5 * alas * tinggi;
    }

    public double kelilingSegitiga() {
        return alas + tinggi + sisiMiring;
    }

    public double luasBelahKetupat() {
        return 0.5 * diagonal1 * diagonal2;
    }

    public double kelilingBelahKetupat() {
        return 4 * sisi;
    }
}   

