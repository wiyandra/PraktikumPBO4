/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul4;

/**
 *
 * @author Wiyandra
 */
public class main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Febriani", 48, "Mencangkul", 5000000);

        //Menampilkan Data Pekerja
        System.out.println(pekerja1.toString());
        
        //Mengubah Gaji
        pekerja1.setNama("Dewi Alviah");
        
        //Menampilkan Data Pekerja setelah Perubahan
        System.out.println("\nData Pekerja Setelah Perubahan");
        System.out.println(pekerja1.toString());
    }
}
