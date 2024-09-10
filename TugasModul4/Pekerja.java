/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul4;

/**
 *
 * @author Wiyandra
 */
public class Pekerja extends Manusia {
    private int gaji;
    
    //Constructor
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    //Getter dan Setter Attribute Nama
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    //Metode untuk Menampilkan Informasi Pekerja
    @Override
    public String toString() {
        return "Identitas Pekerja\n" + "Nama Pekerja : " + getNama() + 
               "\nUsia Pekerja : " + usia + "\nPekerjaan : " + pekerjaan +
               "\nGaji Pekerja : " + gaji;
    }
}
