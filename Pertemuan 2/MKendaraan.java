/*Nama File : MKendaraan.java
 * Deskripsi : Berisi program utama untuk memanggil penggunaan fungsi class Kendaraan
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal : Rabu, 26 Februari 2025
*/

public class MKendaraan {
        public static void main(String[] args) {
            //Tanpa parameter 
            Kendaraan K1 = new Kendaraan();
            K1.setnoPlat("1996 QD"); 
            K1.setjenis("Mobil"); 
    
            System.out.println("Plat Nomor :" + K1.getnoPlat());
            System.out.println("Jenis Kendaraan :" + K1.getjenis());
    
            //Menggunakan parameter
            Kendaraan K2 = new Kendaraan("1435 WH", "Motor");
    
            System.out.println("\nPlat Nomor : " + K2.getnoPlat());
            System.out.println("Jenis Kendaraan : " + K2.getjenis());
    }
}
