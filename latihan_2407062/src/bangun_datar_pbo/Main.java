package bangun_datar_pbo;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("- HASIL PERHITUNGAN BANGUN DATAR -");
        
        // Persegi
        Persegi p = new Persegi();
        p.setSisi(6);

        System.out.println("Luas Persegi = " + p.LuasPersegi());
        System.out.println("Keliling Persegi = " + p.KelilingPersegi());

        // Persegi Panjang
        PersegiPanjang q = new PersegiPanjang();
        q.setPanjang(6);
        q.setLebar(2);

        System.out.println("Luas PersegiPanjang = " + q.LuasPersegiPanjang());
        System.out.println("Keliling PersegiPanjang = " + q.KelilingPersegiPanjang());

        // Segitiga
        Segitiga r = new Segitiga();
        r.setAlas(4);
        r.setTinggi(6);
        r.setSisi(5, 6, 7);

        System.out.println("Luas Segitiga = " + r.LuasSegitiga());
        System.out.println("Keliling Segitiga = " + r.KelilingSegitiga());

        // Belah Ketupat
        BelahKetupat s = new BelahKetupat();
        s.setSisi(8);
        s.setDiagonal(9,5);

        System.out.println("Luas Belah Ketupat = " + s.LuasBelahKetupat());
        System.out.println("Keliling Belah Ketupat = " + s.KelilingBelahKetupat());
    }
}