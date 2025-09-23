/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class MainOverloading {
    public static void main(String[] args) {
        Hewan kucing = new Hewan();

        kucing.bersuara();             // Output: Hewan bersuara
        kucing.makan("ikan");          // Memanggil metode makan(String)
        kucing.makan("ikan", 2);       // Memanggil metode makan(String, int)
    }
}


