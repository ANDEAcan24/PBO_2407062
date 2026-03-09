// package latihan_pbo.latihan1;

// class cafe{
//    public String nama;
//     //String alamat;
//     private String alamat;

//     public void setNama(String nama){
//         this.nama = nama;
//     }

//     //SETTER
//     public void setAlamat(String nama){
//         this.nama = nama;
//     }

//     // GETTER
//     public void setAlamat(String alamat){
//         // this.alamat = alamat;
//         return this.alamat = alamat;
//     }

//     Cafe(String nama, String alamat){
//         this.nama = nama;
//         this.alamat = alamat;
//     }

//     void show(){
//         System.out.println(nama);
//     }
// }
    

// public class Main {
//     public static void main(String[] args) {
//         Cafe cafe2 = new Cafe();
//         cafe2.nama = "Halaman";
//         cafe2.setAlamat("Indramayu");
//         System.out.println(cafe2.getAlamat);
//         // cafe2.alamat = "Indramayu";
//         // System.out.println(cafe2.nama);
//         System.out.println(cafe2.alamat);
//         cafe2.setNama("Teringat");
//         System.out.println(cafe2.show);
// }

package latihan_pbo.latihan2;

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