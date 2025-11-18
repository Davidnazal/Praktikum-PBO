/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11.Tugas11;

/**
 *
 * @author ASUS
 */
public class Perpustakaan {
    private Buku[] daftarBuku;   // komposisi: Perpustakaan punya daftar Buku
    private int kapasitas;
    private int jumlah;          // jumlah buku saat ini

    public Perpustakaan(int kapasitas) {
        this.kapasitas = kapasitas;
        this.daftarBuku = new Buku[kapasitas];
        this.jumlah = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlah < kapasitas) {
            daftarBuku[jumlah] = buku;
            jumlah++;
        } else {
            System.out.println("Perpustakaan penuh, tidak bisa menambah buku lagi.");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("=== Daftar Buku di Perpustakaan ===");
        if (jumlah == 0) {
            System.out.println("Belum ada buku di perpustakaan.");
        } else {
            for (int i = 0; i < jumlah; i++) {
                daftarBuku[i].infoBuku();
            }
        }
    }

    // opsional: simulasi jika perpustakaan dihapus → buku juga ikut hilang
    public void hapusPerpustakaan() {
        for (int i = 0; i < jumlah; i++) {
            daftarBuku[i] = null;
        }
        jumlah = 0;
        daftarBuku = null;
        System.out.println("Perpustakaan dan semua bukunya dihapus (referensi dihapus).");
    }
}
