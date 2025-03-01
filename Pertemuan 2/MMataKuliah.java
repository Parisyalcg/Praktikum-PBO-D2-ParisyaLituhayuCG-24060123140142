/*Nama File : MMataKuliah.java
 * Deskripsi : Berisi program utama untuk memanggil penggunaan fungsi class MataKuliah
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal : Kamis, 27 Februari 2025
*/

public class MMataKuliah {
        public static void main(String[] args) {
            //Tanpa parameter 
            MataKuliah MK1 = new MataKuliah();
            MK1.setidMatkul("MEP2025");
            MK1.setnama("MEPE");
            MK1.setsks(3);
    
            System.out.println("Id Matkul : " + MK1.getidMatkul());
            System.out.println("Nama : " + MK1.getnama());
            System.out.println("SKS : " + MK1.getsks());
    
            //Menggunakan parameter 
            MataKuliah MK2 = new MataKuliah("PBO2025", "PEBEO", 3);
    
            System.out.println("\nId Matkul :" + MK2.getidMatkul());
            System.out.println("nama :" + MK2.getnama());
            System.out.println("SKS :" + MK2.getsks());
    }
}
