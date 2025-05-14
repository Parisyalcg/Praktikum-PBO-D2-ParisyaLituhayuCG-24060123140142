/*Nama File : Lingkaran.java
 * Deskripsi : Implementasi Lingkaran sebagai BangunDatar
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 13 Mei 2025
*/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }

    public double hitungLuas(){
        return 3.14 * jejari * jejari;
    }
}