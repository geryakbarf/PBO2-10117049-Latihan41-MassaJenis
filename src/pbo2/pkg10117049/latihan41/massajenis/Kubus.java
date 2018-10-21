/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan41.massajenis;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung massa jenis
 * kubus
 */
public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
    return sisi*sisi*sisi;
}
    public int hitungMassaJenis(int parMassa, int volume){
        return massa/volume;
    }
    
}
