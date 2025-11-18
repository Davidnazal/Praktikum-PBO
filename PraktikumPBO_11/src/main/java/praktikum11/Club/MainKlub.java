/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11.Club;

/**
 *
 * @author ASUS
 */
public class MainKlub {
    public static void main(String[] args) {
        // Membuat beberapa anggota (anggota bisa eksis tanpa klub tertentu)
        Anggota a1 = new Anggota("Budi");
        Anggota a2 = new Anggota("Siti");
        Anggota a3 = new Anggota("Andi");

        // Membuat klub (agregasi: klub memiliki daftar anggota)
        Klub klubFutsal = new Klub("Klub Futsal Informatika");

        // Menambahkan anggota ke klub
        klubFutsal.tambahAnggota(a1);
        klubFutsal.tambahAnggota(a2);
        klubFutsal.tambahAnggota(a3);

        // Menampilkan info klub beserta anggotanya
        System.out.println("=== Informasi Klub dan Anggota ===");
        klubFutsal.infoKlub();

        // Menunjukkan sifat agregasi:
        // Anggota tetap ada meskipun referensi klub dihapus
        System.out.println("\n--- Setelah klub 'dihapus' ---");
        klubFutsal = null; // hapus referensi ke klub

        // Anggota masih bisa diakses
        System.out.println("Anggota masih eksis:");
        a1.infoAnggota();
        a2.infoAnggota();
        a3.infoAnggota();
    }
}

