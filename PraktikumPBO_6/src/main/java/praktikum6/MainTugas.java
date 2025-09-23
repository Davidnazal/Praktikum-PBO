/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class MainTugas {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Pemrograman Java", 100000);
        Produk elektronik = new Elektronik("Headphone", 200000);
        Produk pakaian = new Pakaian("Kaos Polos", 50000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanProduk();
        System.out.println("Total belanja setelah diskon: " + keranjang.hitungTotal());
    }
}

