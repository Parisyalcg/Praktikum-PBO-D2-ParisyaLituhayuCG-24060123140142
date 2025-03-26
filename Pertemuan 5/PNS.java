/*
 * File : PNS.java
 * Name : Parisya Lituhayu Chandrawati Gunawarman
 * Date : Senin, 24 Maret 2025
 * Desc : Implementation of PNS class
 */

class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public static int getCounterPNS() {
        return counterPNS;
    }
    
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 2; // 14 akhir = 2
    }   
}
