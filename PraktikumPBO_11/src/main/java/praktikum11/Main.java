/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Membuat beberapa buku (komposisi: buku dikelola oleh perpustakaan)
        Buku buku1 = new Buku("Pemrograman Berbasis Objek");
        Buku buku2 = new Buku("Struktur Data");
        Buku buku3 = new Buku("Basis Data Lanjut");

        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan semua buku di perpustakaan
        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.infoPerpustakaan();
    }
}
