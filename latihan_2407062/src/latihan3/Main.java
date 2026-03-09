// package latihan3;
// package latihan3;

// class Cafe{
//     String nama;
//     String alamat;

//     Cafe(String nama, String alamat){
//     this.nama = nama;
//     this.alamat = alamat;
//     System.out.println(nama);
//     System.out.println(alamat);
//     }

//     // method
//     void buka(){
//     System.out.println("Cafe" + nama + "Sudah buka");
// }

// public String getNama() {
//     return nama;
// }

// public void setNama(String nama) {
//     this.nama = nama;

// }

// public String getAlamat() {
//     return alamat;
// }

// public void setAlamat(String alamat) {
//     this.alamat = alamat;
// }

// }

// // constructor

// public class Main {
//     public static void main(String[] args) {

//         // scanner input = new Scanner(System.in);
//         // Cafe cafe = new Cafe();

//         // System.out.println("Masukkan nama cafe: ");
//         // cafe.nama = input.nextLine();

//         // System.out.println("nama yang display adalah : +cafe.nama");
//         // cafe.buka();

//         // Cafe cafe1 = new Cafe();
//         // cafe1.nama = "Kopi Klotok";
//         // cafe1.alamat = "Jogja";

//         // Cafe cafe2 = new Cafe();
//         // cafe2.nama = "HALAMAN";
//         // cafe2.alamat = "Indramayu";

//         // Cafe cafe3 = new Cafe();
//         // cafe3.nama = "Janji Jiwa";
//         // cafe3.alamat = "Brebes";

//         // System.out.println("Nama Cafenya adalah : " + cafe1.nama);
//         // System.out.println("Alamatnya ada di : " + cafe1.alamat);

//         // System.out.println("Nama Cafenya adalah : " + cafe2.nama);
//         // System.out.println("Alamatnya ada di : " + cafe2.alamat);

//         // System.out.println("Nama Cafenya adalah : " + cafe3.nama);
//         // System.out.println("Alamatnya ada di : " + cafe3.alamat);


//         Cafe cafe4 = new Cafe("Djago kopi",  "Indramayu");
//         cafe4.setNama("Jago");
//         cafe4.buka();
        
//     }
// }

package latihan3;

//acsess modifer (public, private, protected)
class Persegi{
    private int sisi;

    public int getSisi() {
        return sisi*sisi;
    }
    public double kelilingPersegi(){
        return sisi+sisi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}
public class Main {
    public static void main(String[] args) {

        Persegi p = new Persegi();
        p.setSisi(5);
        System.out.println(p.getSisi());
        
    }
}