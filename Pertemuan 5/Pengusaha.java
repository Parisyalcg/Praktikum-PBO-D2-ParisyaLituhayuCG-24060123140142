/*
 * File : Pengusaha.java
 * Name : Parisya Lituhayu Chandrawati Gunawarman
 * Date : Senin, 24 Maret 2025
 * Desc : Implementation of Pengusaha class
 */

class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 6; // nim 13 akhir = 6
    }
}
