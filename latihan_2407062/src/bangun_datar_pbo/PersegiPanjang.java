package bangun_datar_pbo;

public class PersegiPanjang extends BangunDatar {
    
    public double LuasPersegiPanjang(){
        return getPanjang() * getLebar();
    }

    public double KelilingPersegiPanjang(){
        return 2 * (getPanjang() + getLebar());
    }

}
