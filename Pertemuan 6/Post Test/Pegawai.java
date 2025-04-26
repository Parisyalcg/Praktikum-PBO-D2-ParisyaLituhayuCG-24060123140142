/*Nama File : Pegawai.java
 * Deskripsi : Berisi atribut dan method dalam class Pegawai
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal : Jumat, 25 April 2025
*/

class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}