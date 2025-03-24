/*
 * File : Petani.java
 * Name : Parisya Lituhayu Chandrawati Gunawarman
 * Date : Senin, 24 Maret 2025
 * Desc : Implementation of Petani class
 */

class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani ++;
    }
    
    public String getAsalKota() {
        return asalKota;
    }
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }
    public static int getCounterPetani() {
        return counterPetani;
    }
    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 1; // 12 akhir = 1
    }
}
