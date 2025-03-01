/*Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal : Kamis, 26 Februari 2025
*/

public class Kendaraan {
    //Atribut
    private String noPlat;
    private String jenis;

    //Konstruktor
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan (String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Selektor (getter)
    public String getnoPlat() {
        return noPlat;
    }

    public String getjenis() {
        return jenis;
    }

    //Mutator (setter)
    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setjenis(String jenis) {
        this.jenis = jenis;
    }
}