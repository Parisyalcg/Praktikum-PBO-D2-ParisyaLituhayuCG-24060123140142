/*Nama File : Koleksi.java
 * Deskripsi : Implementasi kelas Koleksi untuk menyimpan dan mengelola elemen-elemen dengan tipe data generik.
 * Pembuat : Parisya Lituhayu Chandrawati Gunawarman/24060123140142
 * Tanggal :  Selasa, 13 Mei 2025
*/

public class Koleksi<T> {
    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public Koleksi(int kapasitas) {
        data = (T[]) new Object[kapasitas];
        size = 0;
    }

    public boolean add(T item) {
        if (size >= data.length) return false;
        data[size++] = item;
        return true;
    }

    public T getIsi(int index) {
        return data[index];
    }

    public int getSize() {
        return size;
    }
}

