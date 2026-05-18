package latihan_pbo.tgs_polymorphism;

public class BangunDatar {
    private double varA;
    private double varB;

    // Constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
    }

    // Getter & Setter (Encapsulation)
    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    public void setVarA(double varA) {
        this.varA = varA;
    }

    public void setVarB(double varB) {
        this.varB = varB;
    }

    // Method default
    public double hitungLuas() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Luas Bangun Datar: " + hitungLuas());
    }
}
    

