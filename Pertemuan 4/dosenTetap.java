/*
 * File : dosenTetap.java
 * Name : Parisya Lituhayu Chandrawati Gunawarman
 * Date : Sabtu, 15 Maret 2025
 * Desc : Implementation of dosenTetap class
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class dosenTetap extends Pegawai {
    private String fakultas;
    private String NIDN; // Nomor Induk Dosen Nasional
    private LocalDate BUP; // Batas Usia Pensiun (max 65 tahun) tunjangan 2% x masa kerja

    public dosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, 
                      String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, "Dosen Tetap", 2);
        this.fakultas = fakultas;
        this.NIDN = NIDN;
        this.BUP = tanggalLahir.plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    public dosenTetap() {
        this("", "", LocalDate.now(), LocalDate.now(), 0, "", "");
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public LocalDate getBUP() {
        return BUP;
    }

    public void setBUP(LocalDate BUP) {
        this.BUP = BUP;
    }

    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        System.out.println("NIDN: " + NIDN);
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
        System.out.println("BUP: " + BUP.format(formatter));
    }
}