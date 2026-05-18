package latihan_pbo.tugas_kelompok;

public class minuman {
    // 2.b. Kelas turunan Minuman[cite: 1]
public class Minuman extends Menu {
    private String ukuran; 

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    @Override
    public void detailMenu() {
        System.out.println("[Minuman] " + getNama() + " [Size: " + ukuran + "] - Rp" + getHarga());
    }
}
}
