package bangun_datar_pbo;

public class BelahKetupat extends BangunDatar {

    public double LuasBelahKetupat(){
        return 0.5 * getDiagonal1() * getDiagonal2();
    }

    public double KelilingBelahKetupat(){
        return 4 * getSisi();
    }

}