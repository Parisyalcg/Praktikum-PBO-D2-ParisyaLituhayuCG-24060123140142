/*Nama File : Asersi1.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal : Rabu, 5 Maret 2025
*/

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
