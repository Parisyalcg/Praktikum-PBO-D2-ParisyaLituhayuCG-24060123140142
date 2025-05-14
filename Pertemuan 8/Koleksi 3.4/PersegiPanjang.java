/*Nama File : PersegiPanjang.java
 * Deskripsi : Implementasi persegi panjang sebagai BangunDatar
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal : Selasa, 13 Mei 2025
*/

public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling(){
        return 2 * (panjang + lebar);
    }

    public double hitungLuas(){
        return panjang * lebar;
    }
}
