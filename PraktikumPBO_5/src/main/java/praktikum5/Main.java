/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Objek Mobil
        Mobil mobil = new Mobil();
        mobil.nama = "Mazda 3 Hachback";
        mobil.kecepatan = 134;
        mobil.jumlahPintu = 4;
        mobil.jumlahRoda = 4;
        mobil.tampilkanInfo();
        mobil.tampilkanInfo(); 

        System.out.println("------------------------------");

        // Objek SepedaMotor
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha V-IXION";
        motor.kecepatan = 120;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4-Tak";
        motor.tampilkanInfo();
        
    }
}
