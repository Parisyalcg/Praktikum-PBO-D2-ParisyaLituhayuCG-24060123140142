/*Nama File : KoleksiAnabul.java
 * Deskripsi  Implementasi kelas Kucing sebagai turunan dari kelas Anabul
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 13 Mei 2025
*/

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    public void bersuara() {
        System.out.println(nama + " berbunyi meong.");
    }
}
