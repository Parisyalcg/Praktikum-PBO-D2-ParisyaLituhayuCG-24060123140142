/*
 * File : dosenTamu.java
 * Name : Parisya Lituhayu Chandrawati Gunawarman
 * Date : Sabtu, 15 Maret 2025
 * Desc : Implementation of dosenTamu class
 */

import java.time.LocalDate;
import java.time.Period;

public class dosenTamu extends Pegawai {
    private String fakultas;
    private String NIDK; // Nomor Induk Dosen Khusus
    private LocalDate akhirKontrak; // 2.5% x gaji pokok

    public dosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, 
                     String fakultas, String NIDK, LocalDate akhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, "Dosen Tamu", 2.5);
        this.fakultas = fakultas;
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    public dosenTamu() {
        this("", "", null, null, 0, "", "", null);
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getNIDK() {
        return NIDK;
    }

    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public LocalDate getAkhirKontrak() {
        return akhirKontrak;
    }

    public void setAkhirKontrak(LocalDate akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }

    @Override
    public void printInfo() {
        System.out.println("NIDK            : " + NIDK);
        super.printInfo();
        System.out.println("Fakultas        : " + fakultas);
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(now, akhirKontrak);
        int berakhir = selisih.getYears() * 12 + selisih.getMonths();
        System.out.println("Akhir Kontrak   : " + berakhir + " bulan");
    }
}