package bangun_datar_pbo;

public class BangunDatar {
    
    // Private (Encapsulation)
    private double sisi;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    private double panjang;
    private double lebar;
    private double alas;
    private double tinggi;

    // Protected
    protected double diagonal1;
    protected double diagonal2;

    // Constructor
    public BangunDatar() {
    }

    // Setter dan Getter
    // Sisi, Sisi1, Sisi2, & Sisi3
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double s1, double s2, double s3) {
        this.sisi1 = s1;
        this.sisi2 = s2;
        this.sisi3 = s3;
    }

    public double getSisi1() {
        return sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    // Panjang & Lebar
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

     public double getLebar() {
        return lebar;
    }

    // Alas & Tinggi
    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    // Diagonal 1 & Diagonal 2
    public void setDiagonal(double d1, double d2) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }
   
    public double getDiagonal2() {
        return diagonal2;
    }
}