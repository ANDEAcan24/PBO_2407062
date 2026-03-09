package bangun_datar_pbo;

public class Persegi extends BangunDatar {

    public double LuasPersegi(){
        return getSisi()*getSisi();
    }

    public double KelilingPersegi(){
        return 4*getSisi();
    }
    
}