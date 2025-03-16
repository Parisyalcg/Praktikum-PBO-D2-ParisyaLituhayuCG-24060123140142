/*
 * File : Tendik.java
 * Name : Parisya Lituhayu Chandrawati Gunawarman
 * Date : Minggu, 16 Maret 2025
 * Desc : Implementation of Tendik class
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai{
    private LocalDate BUP; // Batas Usia Pensiun (55 tahun) 1% x masa kerja
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, 
                  String bidang){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, "Tenaga Kependidikan", 1.0);
        this.bidang = bidang;
        this.BUP = tanggalLahir.plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    public Tendik(){
        this("", "", null, null, 0, "");
    }

    public LocalDate getBUP(){
        return BUP;
    }

    public void setBUP(LocalDate BUP){
        this.BUP = BUP;
    }

    public String getBidang(){
        return bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    @Override
    public void printInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("BUP: " + BUP.format(formatter));
    }
}