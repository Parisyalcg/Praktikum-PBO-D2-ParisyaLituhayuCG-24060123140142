/*Nama File : MDosen.java
 * Deskripsi : Berisi program utama untuk memanggil penggunaan fungsi class Dosen
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal : Kamis, 26 Februari 2025
*/

public class MDosen {
        public static void main(String[] args) {
            //Tanpa parameter 
            Dosen D1 = new Dosen();
            D1.setnip("122335");
            D1.setnama("Mariyono");
            D1.setprodi("Ilmu Komunikasi");
    
            System.out.println("NIP: " + D1.getnip());
            System.out.println("Nama: " + D1.getnama());
            System.out.println("Prodi: " + D1.getnip());
    
            //Menggunakan parameter 
            Dosen D2 = new Dosen("234567", "Saraswati", "Teknik Sipil");
            System.out.println("\nNIP: " + D2.getnip());
            System.out.println("Nama: " + D2.getnama());
            System.out.println("Prodi: " + D2.getprodi());
    }
}