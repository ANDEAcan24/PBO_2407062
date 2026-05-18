package latihan_pbo.tgs_polymorphism;


public class Persegi extends BangunDatar {

    public Persegi(double sisi) {
        super(sisi);
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarA();
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + getVarA());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("----------------------");
    }
}

