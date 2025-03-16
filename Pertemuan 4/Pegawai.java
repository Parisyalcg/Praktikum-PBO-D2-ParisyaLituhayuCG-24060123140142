/*
 * File : Pegawai.java
 * Name : Parisya Lituhayu Chandrawati Gunawarman
 * Date : Minggu, 16 Maret 2025
 * Desc : Implementation of Pegawai class
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class Pegawai {
    private String NIP;
    private String nama;
    private String jabatan;
    private LocalDate tanggalLahir;
    private LocalDate TMT;
    private int gajiPokok;
    private double tunjangan;

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String jabatan, double tunjangan) {
        this.NIP = NIP; 
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
        this.jabatan = jabatan;
        this.tunjangan = tunjangan;
    }

    public Pegawai() {
        this("", "", LocalDate.now(), LocalDate.now(), 0, "", 0);
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String masaKerja() {
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(TMT, now);
        int tahun = selisih.getYears();
        int bulan = selisih.getMonths();
        return("Masa Kerja      : " + tahun + " tahun " + bulan + " bulan");
    }

    public double hitungTunjangan() {
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(TMT, now);
        int tahun = selisih.getYears();
        return gajiPokok * (tahun * (tunjangan / 100));
    }

    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatter));
        System.out.println("TMT: " + TMT.format(formatter));
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + formatRupiah.format(gajiPokok));

        LocalDate now = LocalDate.now();
        Period selisih = Period.between(getTMT(), now);
        int tahun = selisih.getYears();
        System.out.println("Tunjangan       : " + tunjangan + "% x " + tahun + " x " + formatRupiah.format(getGajiPokok()) + " = " + formatRupiah.format(hitungTunjangan()));
        System.out.println(masaKerja());
    }
}