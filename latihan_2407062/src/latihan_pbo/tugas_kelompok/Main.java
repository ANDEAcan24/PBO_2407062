package latihan_pbo.tugas_kelompok;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cafe myCafe = new Cafe("Java Coffee");

        // Data awal simulasi
        myCafe.tambahMenu(new Makanan("Nasi Goreng", 20000, "Makanan Berat"));
        myCafe.tambahMenu(new Makanan("Kentang Goreng", 12000, "Cemilan"));
        myCafe.tambahMenu(new Minuman("Latte", 15000, "Large"));
        myCafe.tambahMenu(new Minuman("Americano", 10000, "Medium"));

        boolean programBerjalan = true;

        while (programBerjalan) {
            System.out.println("====================================");
            System.out.println("    SISTEM MANAJEMEN JAVA COFFEE    ");
            System.out.println("====================================");
            System.out.println("1. Kelola Daftar Menu");
            System.out.println("2. Transaksi Kasir");
            System.out.println("3. Keluar");
            System.out.print("Pilih Fitur : ");
            
            int menuUtama = 0;
            try {
                menuUtama = input.nextInt();
            } catch (Exception e) {
                System.out.println("Peringatan : Input harus angka!");
                input.nextLine(); 
                continue;
            }
            input.nextLine(); 

            switch (menuUtama) {
                case 1:
                    // --- KELOLA MENU (ADMIN) ---
                    System.out.println("--- KELOLA DAFTAR MENU ---");
                    System.out.println("1. Tambah Menu Baru");
                    System.out.println("2. Hapus Menu dari Daftar");
                    System.out.print("Pilih Aksi : ");
                    int aksiAdmin = input.nextInt();
                    input.nextLine();

                    if (aksiAdmin == 1) {
                        System.out.print("Jenis (1. Makanan / 2. Minuman) : ");
                        int pil = input.nextInt(); input.nextLine();
                        System.out.print("Nama Menu : "); String nama = input.nextLine();
                        System.out.print("Harga : "); double harga = input.nextDouble(); input.nextLine();

                        if (pil == 1) {
                            System.out.print("Kategori (Makanan Berat/Cemilan) : "); String jenis = input.nextLine();
                            myCafe.tambahMenu(new Makanan(nama, harga, jenis));
                        } else {
                            System.out.print("Ukuran (S/M/L) : "); String ukuran = input.nextLine();
                            myCafe.tambahMenu(new Minuman(nama, harga, ukuran));
                        }
                        System.out.println("Menu '" + nama + "' berhasil ditambahkan!");
                    } 
                    else if (aksiAdmin == 2) {
                        myCafe.tampilkanMenu();
                        System.out.print("Masukkan Nomor Menu yang akan dihapus : ");
                        int noHapus = input.nextInt();
                        
                        if (noHapus > 0 && noHapus <= myCafe.totalMenu()) {
                            myCafe.hapusMenu(noHapus - 1);
                            System.out.println("Menu berhasil dihapus dari sistem!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 2:
                    ArrayList<Menu> keranjangMenu = new ArrayList<>();
                    ArrayList<Integer> keranjangJumlah = new ArrayList<>();
                    boolean transaksiAktif = true;

                    while (transaksiAktif) {
                        myCafe.tampilkanMenu();
                        System.out.println("[ MENU TRANSAKSI ]");
                        System.out.println("1. Tambah ke Pesanan");
                        System.out.println("2. Hapus Item Terakhir");
                        System.out.println("3. Selesai & Bayar");
                        System.out.print("Pilih Aksi: ");
                        int aksi = input.nextInt();

                        if (aksi == 1) {
                            System.out.print("Masukkan Nomor Menu : ");
                            int no = input.nextInt();
                            if (no > 0 && no <= myCafe.totalMenu()) {
                                System.out.print("Jumlah Beli: ");
                                int qty = input.nextInt();
                                keranjangMenu.add(myCafe.getMenu(no - 1));
                                keranjangJumlah.add(qty);
                                System.out.println("Ditambahkan ke keranjang!");
                            } else {
                                System.out.println("Error : Nomor tidak terdaftar!");
                            }
                        } 
                        else if (aksi == 2) {
                            if (!keranjangMenu.isEmpty()) {
                                int lastIdx = keranjangMenu.size() - 1;
                                System.out.println("Membatalkan item: " + keranjangMenu.get(lastIdx).getNama());
                                keranjangMenu.remove(lastIdx);
                                keranjangJumlah.remove(lastIdx);
                            } else {
                                System.out.println("Keranjang kosong!");
                            }
                        } 
                        else if (aksi == 3) {
                            transaksiAktif = false;
                        }

                        if (transaksiAktif) {
                            System.out.print("Lanjut input item lain? (y/n): ");
                            if (input.next().toLowerCase().charAt(0) == 'n') transaksiAktif = false;
                        }
                    }

                    // Cetak Struk Akhir
                    if (!keranjangMenu.isEmpty()) {
                        double total = 0;
                        System.out.println("================================");
                        System.out.println("       STRUK PEMBAYARAN        ");
                        System.out.println("================================");
                        for (int i = 0; i < keranjangMenu.size(); i++) {
                            Menu m = keranjangMenu.get(i);
                            int j = keranjangJumlah.get(i);
                            double sub = m.getHarga() * j;
                            total += sub;
                            System.out.print("- "); m.detailMenu();
                            System.out.println(" x" + j + " = Rp" + sub);
                        }
                        System.out.println("--------------------------------");
                        System.out.println("TOTAL AKHIR: Rp" + total);
                        System.out.println("================================");
                    } else {
                        System.out.println("Info : Tidak ada transaksi.");
                    }
                    break;

                case 3:
                    programBerjalan = false;
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Fitur tidak tersedia.");
            }
        }
        input.close();
    }
}