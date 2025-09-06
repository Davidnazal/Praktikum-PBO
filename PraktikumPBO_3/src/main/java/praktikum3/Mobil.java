/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Mobil {
    //Membuat atribut di set private agar tidak langsung dipanggil saat run (perlu menggunakan set dan get)
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    // constructor
    Mobil(String inputMerk, String inputModel, int inputTahun, String inputWarna) {
        merk = inputMerk;
        model = inputModel;
        tahun = inputTahun;
        warna = inputWarna;
    }
    public String getmerk() {  // untuk mengembalikan nilai merk
        return merk;
    }
    public void setmerk(String inputMerk) {  // untuk mengubah nilai merk dari parameter
        merk = inputMerk;
    }
    public String getmodel() {  // untuk mengembalikan nilai model
        return model;
    }
    public void setmodel(String inputModel) {  // untuk mengubah nilai model dari parameter
        model = inputModel;
    }
    public int gettahun() {  // untuk mengembalikan nilai tahun
        return tahun;
    }
    public void setinputTahun(int inputTahun) {  // untuk mengubah nilai tahun dari parameter
        tahun = inputTahun;
    }
    public String getwarna(){  // untuk mengembalikan nilai warna
        return warna;
    }
    public void setinputWarna(String inputWarna){  // untuk mengubah nilai warna dari parameter
        warna = inputWarna;
    }
    public void displayInfo() {  // Method untuk menampilkan informasi terkait mobil
        System.out.println("Merk:" + merk + " Model:" + model + " Tahun:" + tahun + " Warna:" + warna);
    }
    void startEngine() {  // Method untuk menampilkan informasi terkait mesin mobil
        System.out.println("Mesin mobil " + merk + "  menyala");
    }
}

