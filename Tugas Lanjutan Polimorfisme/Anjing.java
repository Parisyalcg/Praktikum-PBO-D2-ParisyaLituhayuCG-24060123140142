/*Nama File : Anjing.java
 * Deskripsi : Berisi atribut dan method dalam subclass Anjing
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 29 April 2025
*/

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berlari dengan cepat.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk guk!");
    }
}