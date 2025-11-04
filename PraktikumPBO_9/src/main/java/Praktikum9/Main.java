/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum9;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        kendaraan Mobil = new Mobil();
        kendaraan Sepeda = new Sepeda();
        
        Mobil.berjalan();
        Mobil.info();
        
        Sepeda.berjalan();
        Sepeda.info();
    }
}
