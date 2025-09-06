/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan ("Mimi", 3); // Membuat objek
        kucing.suara();  // Method untuk menampilkan output "Hewan Bersuara"
        kucing.info();   // Method untuk menampilkan output terkait info hewan
       
        Hewan anjing = new Hewan ("Heli", 2); //constructor 
        anjing.info();  // Method untuk menampilkan output terkait info hewan
        anjing.berlari();  // Method untuk menampilkan output "Hewan sedang berlari"
    }
}
