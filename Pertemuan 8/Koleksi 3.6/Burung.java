/*Nama File : Burung.java
 * Deskripsi : Implementasi kelas Burung sebagai turunan dari kelas Anabul
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 13 Mei 2025
*/

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    public void bersuara() {
        System.out.println(nama + " berbunyi cuit.");
    }
}
