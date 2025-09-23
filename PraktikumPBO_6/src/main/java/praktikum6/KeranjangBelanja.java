/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class KeranjangBelanja {
    private ArrayList<Produk> listProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        listProduk.add(p);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : listProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanProduk() {
        for (Produk p : listProduk) {
            System.out.println(p.getNama() + " - Harga asli: " + p.getHarga() +
                               ", Setelah diskon: " + p.getHargaSetelahDiskon());
        }
    }
}

