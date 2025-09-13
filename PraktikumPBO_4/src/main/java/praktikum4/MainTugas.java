/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class MainTugas {
    public static void main (String[] Args) {
        Pekerja Data = new Pekerja ("Ahmad", 23, "Office Boy", 3000000);
        System.out.println("=== Data Awal Pekerja ===");
        System.out.println(Data.toString());
        System.out.println("\n=== Data Setelah Nama Diubah ===");
        Data.setNama("Riyadi");
        System.out.println(Data.toString());
        System.out.println("Nama: " + Pekerja.nama);
        
    }
}

