package latihan_2407062.tugas_inheritence.latihan_4;

public class Main {
    public static void main(String[] args) {

        // Data menu
        Menu ketoprak = new Menu("Ketoprak", 12000);
        Menu nasgor = new Menu("Nasi Goreng", 15000);
        Menu sogem = new Menu("Sogem", 8000);

        // Transaksi
        MenuItem item1 = new MenuItem(ketoprak, 3);
        MenuItem item2 = new MenuItem(nasgor, 4);
        MenuItem item3 = new MenuItem(sogem, 5);

        // Tampilkan
        item1.tampilkan();
        item2.tampilkan();
        item3.tampilkan();
    }
}

