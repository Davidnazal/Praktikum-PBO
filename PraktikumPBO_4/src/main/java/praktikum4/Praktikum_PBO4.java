/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Praktikum_PBO4 {
    
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan ("Toyota", "Avanza", 2020);
    
        // Menampilkan data awal
        System.out.println(mobil.getMerek() + "Merek:");
        System.out.println("Model:" + mobil.getModel());
        System.out.println("Tahun:" + mobil.getTahun());
    
        // Mengubah data
        mobil.setModel("Innova");
        mobil.setTahun(2021);
    
        // Menampilkan darta setelah perubahan
        System.out.println("Model baru:" + mobil.getModel());
        System.out.println("Tahun baru:" + mobil.getTahun());
    }
}
