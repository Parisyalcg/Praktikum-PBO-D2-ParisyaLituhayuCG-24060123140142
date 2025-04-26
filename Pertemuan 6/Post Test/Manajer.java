/*Nama File : Manajer.java
 * Deskripsi : Berisi atribut dan method dalam class Manajer
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal : Jumat, 25 April 2025
*/

class Manager extends Pegawai {
    private int tunjangan = 7000000;

    public Manager(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}