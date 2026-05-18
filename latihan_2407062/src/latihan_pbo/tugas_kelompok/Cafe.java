package latihan_pbo.tugas_kelompok;

import java.util.ArrayList;

public class Cafe {
    private String namaCafe;
    private ArrayList<Menu> daftarMenu;

    public Cafe(String nama) {
        this.namaCafe = nama;
        this.daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void hapusMenu(int index) {
        if (index >= 0 && index < daftarMenu.size()) {
            daftarMenu.remove(index);
        } else {
            System.out.println("Gagal menghapus: Nomor menu tidak ditemukan.");
        }
    }

    public void tampilkanMenu() {
        System.out.println("--- DAFTAR MENU " + namaCafe.toUpperCase() + " ---");
        if (daftarMenu.isEmpty()) {
            System.out.println("(Daftar menu masih kosong)");
        } else {
            for (int i = 0; i < daftarMenu.size(); i++) {
                System.out.print((i + 1) + ". ");
                daftarMenu.get(i).detailMenu(); 
            }
        }
    }

    public Menu getMenu(int index) {
        return daftarMenu.get(index);
    }

    public int totalMenu() {
        return daftarMenu.size();
    }
}