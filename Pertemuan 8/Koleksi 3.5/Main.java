/*Nama File : Main.java
 * Deskripsi : Main class untuk menguji Koleksi
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 13 Mei 2025
*/

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> huruf = new Koleksi<>(10);

        System.out.println("Memasukkan karakter:");
        for (char c : new char[]{'A', 'R', 'I', 'S', 'Y', 'A', 'P', 'I', 'N', 'I'}) {
            huruf.add(c);
        }
        huruf.showAll();

        System.out.println("\nMengganti karakter di indeks 2 dengan 'I':");
        huruf.setIsi(2, 'I');
        huruf.showAll();

        System.out.println("\nMenghapus karakter di indeks 7 :");
        huruf.delete(7);
        huruf.showAll();

        int index = 8;
        System.out.println("\nKarakter di indeks ke-" + index + ": " + huruf.getIsi(index));

        System.out.println("\nMenambahkan karakter baru 'L':");
        boolean berhasil = huruf.add('L');
        System.out.println(berhasil ? "'L' berhasil ditambahkan!" : "Gagal menambahkan 'L', kapasitas penuh.");

        System.out.println("\nMengatur jumlah elemen menjadi 5:");
        huruf.setSize(5);
        huruf.showAll();

        System.out.println("\nMenambahkan karakter 'L' setelah pengaturan ulang:");
        huruf.add('L');
        huruf.showAll();
    }
}
