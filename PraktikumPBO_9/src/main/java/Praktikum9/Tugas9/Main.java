/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum9.Tugas9;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        // Memanggil metode
        kucing.suara();
        anjing.suara();

        // Memanggil metode biasa dari kelas abstrak
        kucing.info();
    }
}

