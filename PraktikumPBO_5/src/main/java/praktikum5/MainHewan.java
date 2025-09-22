/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class MainHewan {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Cemong";
        k.jenis = "Domestik";
        k.tampilkanInfo();

        System.out.println("---------------------");

        Anjing a = new Anjing();
        a.nama = "Blacky";
        a.jenis = "Herder";
        a.tampilkanInfo();
    }
}
