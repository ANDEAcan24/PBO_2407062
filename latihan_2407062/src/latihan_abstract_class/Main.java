package latihan_abstract_class;


public static void main(String[] args) {
    BangunDatar[] bd = {
        new Persegi(sisi:4),
        new Segitiga(alas: 2, tinggi: 3)
    };

    for (BangunDatar b : bd) {
        b.Display();
        System.out.println("Luas: " + b.hitungLuas());
        System.out.println(x: *------------------*);
    }
}