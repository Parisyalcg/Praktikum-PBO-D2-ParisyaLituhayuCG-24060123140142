/*Nama File : Main.java
 * Deskripsi : Berisi program utama untuk memanggil penggunaan fungsi class Anabul
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal : Selasa, 29 April 2025
*/

public class Main {
    public static void main(String[] args) {
        Anabul[] peliharaan = {
            new Kucing("Milo"),
            new Anjing("Melly"),
            new Burung("Munel")
        };

        for (Anabul hewan : peliharaan) {
            hewan.gerak();
            hewan.bersuara();
            System.out.println();
        }
    }
}

