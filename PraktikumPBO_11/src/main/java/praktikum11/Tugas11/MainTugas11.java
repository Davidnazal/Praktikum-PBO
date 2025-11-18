/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11.Tugas11;

/**
 *
 * @author ASUS
 */
public class MainTugas11 {
    public static void main(String[] args) {
        // Membuat beberapa pengarang (agregasi: bisa eksis tanpa buku tertentu)
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Eka Kurniawan");
        Pengarang pengarang3 = new Pengarang("Andrea Hirata");

        // Membuat beberapa buku yang terhubung dengan pengarang
        Buku buku1 = new Buku("Rindu", pengarang1);
        Buku buku2 = new Buku("Lelaki Harimau", pengarang2);
        Buku buku3 = new Buku("Laskar Pelangi", pengarang3);

        // Membuat perpustakaan dengan kapasitas 5 buku
        Perpustakaan perpustakaan = new Perpustakaan(5);

        // Menambahkan buku ke perpustakaan (komposisi: perpustakaan "memiliki" buku)
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan semua buku di perpustakaan
        perpustakaan.infoPerpustakaan();

        // Menunjukkan sifat agregasi: pengarang tetap ada meskipun buku/perpustakaan dihapus
        System.out.println("\n--- Simulasi Perpustakaan Dihapus (Komposisi) ---");
        perpustakaan.hapusPerpustakaan();
        perpustakaan = null;

        System.out.println("\nPengarang masih eksis (Agregasi):");
        pengarang1.infoPengarang();
        pengarang2.infoPengarang();
        pengarang3.infoPengarang();
    }
}
