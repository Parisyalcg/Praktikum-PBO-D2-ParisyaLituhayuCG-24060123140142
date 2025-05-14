/*Nama File : Anabul.java
 * Deskripsi : Berisi kelas abstrak Anabul
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 13 Mei 2025
*/

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara.");
    }
}
