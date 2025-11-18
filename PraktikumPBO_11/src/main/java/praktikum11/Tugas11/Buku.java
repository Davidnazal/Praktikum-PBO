/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11.Tugas11;

/**
 *
 * @author ASUS
 */
public class Buku {
    private String judul;
    private Pengarang pengarang;   // agregasi: Buku "memiliki" Pengarang

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public Pengarang getPengarang() {
        return pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul  : " + judul);
        if (pengarang != null) {
            pengarang.infoPengarang();
        } else {
            System.out.println("Pengarang : (tidak ada)");
        }
        System.out.println("----------------------");
    }
}
