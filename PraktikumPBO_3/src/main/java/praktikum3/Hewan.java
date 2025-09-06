/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Hewan {
     private String nama;  //atribut nama di set private agar tidak langsung dipanggil saat run (perlu menggunakan set dan get) 
     private int umur;    //atribut umur di set private agar tidak langsung dipanggil saat run (perlu menggunakan set dan get)
    
     public Hewan(String nama, int umur) {
        this.nama = nama;  //untuk memanggil parameter nama langsung
        this.umur = umur;  //untuk memanggil parameter umurlangsung
    }
      public String getNama() {
        return nama;  // untuk mengembalikan nilai nama
    }
    public void setNama(String Inputnama) {
        nama = Inputnama;  // untuk mengubah nilai nama dari parameter
    }
    public int getUmur() {
        return umur;  // untuk mengembalikan nilai umur
    }
    public void setUmur(int Inputumur) {
        umur = Inputumur;  // untuk mengubah nilai umur dari parameter
    }
    void suara() {  // Method untuk menampilkan output "Hewan bersuara"
       System.out.println("Hewan Bersuara");
    }
    void info() {  // Method untuk menampilkan output terkait info hewan
        System.out.println("Nama : " + getNama() + ", Umur:" + getUmur());
    }
    void berlari() {  // Method untuk menampilkan output "Hewan sedang berlari"
        System.out.println("Hewan sedang berlari");
    }
}
