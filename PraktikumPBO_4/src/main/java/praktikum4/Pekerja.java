/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
// membuat class pekerja yang merupakan inheritance dari class manusia
public class Pekerja extends Manusia {
    
    // membuat atribut dengan set private
    int gaji;
    // constructor 
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    public int getGaji(){    //untuk mengembalikan nilai nama
        return gaji;
    }
    public void setGaji(int gaji){    //untuk mengubah nilai gaji dari parameter
        this.gaji = gaji;
    }
    // instruksi untuk compiler java untuk menimpa method dari superclass
    @Override
        public String toString() {
            return "Nama: " + getNama() + 
                    ", Usia: " + usia + 
                    ", Berposisi: " + pekerjaan +
                    ", Gaji: " + gaji;
        }
}

