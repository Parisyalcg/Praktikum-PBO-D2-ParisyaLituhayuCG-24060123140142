/*
 * File : MPegawai.java
 * Name : Parisya Lituhayu Chandrawati Gunawarman
 * Date : Minggu, 16 Maret 2025
 * Desc : Berisi program utama untuk memanggil penggunaan fungsi class Pegawai
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        // Pegawai P1 = new Pegawai("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000);
        // P1.tampilkanInfo();

        dosenTetap DTe1 = new dosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        DTe1.printInfo();


        System.out.println();

        dosenTamu DTa1 = new dosenTamu("9545647549", "Keyzha", LocalDate.of(1998, 10, 7), LocalDate.of(2019, 3, 3x), 5000000, "Fakultas Sains dan Matematika", "78647325", LocalDate.of(2030, 1, 1));
        DTa1.printInfo();

        System.out.println();

        Tendik T1 = new Tendik("9545647550", "Naufal", LocalDate.of(1999, 5, 2), LocalDate.of(2019, 7, 4), 3000000, "Akademik");
        T1.printInfo();
    }
}