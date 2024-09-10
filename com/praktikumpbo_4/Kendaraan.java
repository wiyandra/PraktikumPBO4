/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikumpbo_4;

/**
 *
 * @author Wiyandra
 */
public class Kendaraan {
    //Menggunakan Akses Modifier yang berbeda - beda
    private String nama;   //Hanya dapat diakses dalam kelas Kendaraan
    protected int kecepatanMaks;   //Dapat digunakan di package yang sama dan subclass yang sama/berbeda
    public String jenisMesin;      //Dapat digunakan dari mana saja
    
    //Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    //Getter dan Setter untuk merek
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    //Method Public untuk Menampilkan Informasi Kendaraan
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan Maksimum : " + kecepatanMaks);
        System.out.println("Jenis Mesin : " + jenisMesin);
    }
}
