/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikumpbo_4;

/**
 *
 * @author Wiyandra
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu; //Atribute tambahan khusus untuk mobil
    
    //Constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); //Memanggil Constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }
    
    //Method untuk Menampilkan Informasi Mobil
    public void tampilkanInfoMobil() {
        //Dapat mengakses kecepatanMaks karena protected
        System.out.println("Kecepatanan Maksimum Mobil : " + kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}
