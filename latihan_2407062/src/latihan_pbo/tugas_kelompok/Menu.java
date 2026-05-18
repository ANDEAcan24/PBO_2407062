package latihan_pbo.tugas_kelompok;

public class menu {
    public class Menu {
    private String nama;
    private double harga;

    public Menu() {} 

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public double getHarga() { return harga; }

    public void detailMenu() {
        System.out.println("Nama: " + nama + " | Harga: Rp" + harga);
    }
}
}
