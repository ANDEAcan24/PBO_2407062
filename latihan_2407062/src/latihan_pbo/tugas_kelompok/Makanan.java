package latihan_pbo.tugas_kelompok;

    
    public class Makanan extends Menu {
        private String jenis;
    
        public Makanan(String nama, double harga, String jenis) {
            super(nama, harga);
            this.jenis = jenis;
        }
    
        @Override
        public void detailMenu() {
            System.out.println("[Makanan] " + getNama() + " (" + jenis + ") - Rp" + getHarga());
        }
    }

import latihan_2407062.tugas_inheritence.latihan_4.Menu;

