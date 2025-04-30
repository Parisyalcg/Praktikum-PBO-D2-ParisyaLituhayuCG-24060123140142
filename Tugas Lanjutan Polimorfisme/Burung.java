/*Nama File : Burung.java
 * Deskripsi : Berisi atribut dan method dalam subclass Burung
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 29 April 2025
*/

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " terbang di langit.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit cuit!");
    }
}