/*Nama File : Anabul.java
 * Deskripsi : Berisi atribut dan method dalam class Anabul
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 29 April 2025
*/

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }
    public abstract void gerak();
    public abstract void bersuara(); 
}