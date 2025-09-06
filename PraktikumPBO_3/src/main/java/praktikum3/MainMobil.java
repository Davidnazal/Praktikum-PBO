/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class MainMobil {
    public static void main(String[] args) {
        // Membuat objek mobil 1
        Mobil mobil1 = new Mobil("Toyota", "Avanza G", 2021, "Putih");  
        mobil1.displayInfo();  // menampilkan method yang berisi info mobil 1
        mobil1.startEngine();  // menampilkan method yang berisi output
        // Membuat objek mobil 2
        Mobil mobil2 = new Mobil("Honda", "Civic Turbo", 2019, "Putih"); 
        mobil2.displayInfo();  // menampilkan method yang berisi info mobil 2
        mobil2.startEngine();  // menampilkan method yang berisi output
        // Mengubah warna mobil 1 memakai setter
        mobil1.setinputWarna("Merah");
        System.out.println("Mobil anda telah di cat ulang"); // menampilkan output 
        mobil1.displayInfo();  // menampilkan method yang berisi info mobil 1
    }
}  

