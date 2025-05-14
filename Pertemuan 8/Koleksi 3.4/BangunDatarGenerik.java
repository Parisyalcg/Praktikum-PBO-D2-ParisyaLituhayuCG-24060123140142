/*Nama File : BangunDatarGenerik.java
 * Deskripsi : Berisi kelas konstruksi generic untuk BangunDatar
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 13 Mei 2025
*/

public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
}