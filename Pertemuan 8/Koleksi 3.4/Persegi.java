/*Nama File : Persegi.java
 * Deskripsi : Implementasi Persegi sebagai BangunDatar
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 13 Mei 2025
*/

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi (double sisi){
        this.sisi = sisi;
    }

    public double hitungKeliling (){
        return 4 * sisi;
    }
    
    public double hitungLuas(){
        return sisi * sisi;
    }
}