package latihan_abstract_class;

public class Persegi extends BangunDatar {
    private double sisi;

    pubic Persegi (double sisi){
        super(nama: "Persegi");
        this.sisi = sisi;
    }

    @Override
    double hitungLuas(){
        return sisi*sisi;
    }
}