/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praktikumpbo_4;

/**
 *
 * @author Wiyandra
 */
public class PraktikumPBO_4 {

    public static void main(String[] args) {
        Kendaraan wiyandra = new Kendaraan("Hyundai Ioniq 5N", 500, "Electric Vehicle");
        Mobil punyawiyandra = new Mobil("Hyundai Ioniq 5N", 500, "Electric Vehicle", 4);
        wiyandra.tampilkanInfoKendaraan();
        punyawiyandra.tampilkanInfoMobil();
    }
}
