/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    //constructor
    public Manusia (String nama, int usia, String pekerjaan){
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    public String getNama(){  // untuk mengembalikan nilai nama
        return nama;
    }
    public void setNama(String nama) {  // untuk mengubah nilai nama 
        this.nama = nama;
    }     
}

