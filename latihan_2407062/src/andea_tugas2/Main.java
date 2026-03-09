package andea_tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bd = new BangunDatar();

        System.out.println("===== MENU BANGUN DATAR =====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        System.out.print("Pilih bangun datar (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                bd.setSisi(sisi);

                System.out.println("Luas Persegi: " + bd.luasPersegi());
                System.out.println("Keliling Persegi: " + bd.kelilingPersegi());
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();

                bd.setPanjang(panjang);
                bd.setLebar(lebar);

                System.out.println("Luas Persegi Panjang: " + bd.luasPersegiPanjang());
                System.out.println("Keliling Persegi Panjang: " + bd.kelilingPersegiPanjang());
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                System.out.print("Masukkan sisi miring: ");
                double sisiMiring = input.nextDouble();

                bd.setAlas(alas);
                bd.setTinggi(tinggi);
                bd.setSisiMiring(sisiMiring);

                System.out.println("Luas Segitiga: " + bd.luasSegitiga());
                System.out.println("Keliling Segitiga: " + bd.kelilingSegitiga());
                break;

            case 4:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();

                bd.setDiagonal1(d1);
                bd.setDiagonal2(d2);
                bd.setSisi(s);

                System.out.println("Luas Belah Ketupat: " + bd.luasBelahKetupat());
                System.out.println("Keliling Belah Ketupat: " + bd.kelilingBelahKetupat());
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}