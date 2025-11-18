/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11.Tugas11;

/**
 *
 * @author ASUS
 */
public class Pengarang {
    private String namaPengarang;

    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void infoPengarang() {
        System.out.println("Pengarang : " + namaPengarang);
    }
}
