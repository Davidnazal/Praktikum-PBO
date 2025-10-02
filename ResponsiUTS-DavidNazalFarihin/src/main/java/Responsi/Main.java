/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Objek Produk
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        Makanan snack = new Makanan("Snack", 15000, "2023-12-30");

        // Objek Pegawai
        PegawaiTetap budi = new PegawaiTetap("David", 5000000, 1000000);
        PegawaiKontrak andi = new PegawaiKontrak("Andi", 3000000, 12);

        System.out.println("=== Output Produk ===");
        laptop.tampilkanInfo();

        System.out.println("\n=== Output Pegawai ===");
        budi.tampilkanInfo();

        System.out.println("\n=== Output Polimorfisme ===");
        Produk p = snack;     
        Pegawai q = andi;
        p.tampilkanInfo();
        System.out.println();
        q.tampilkanInfo();
    }
}
