package latihan_pbo.latihan_expection;

public class tes {
    public static void main (String[] args) {
        int[] angka = {1, 2, 3, 4, 5};
       //
        //

        try {
            System.out.println(angka[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi error: " + 0);
        } finally {
            System.out.println("Program selesai");
        }
    }

}