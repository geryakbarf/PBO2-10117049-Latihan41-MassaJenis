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
public class PBO210117049Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kbs = new Kubus();
        System.out.println("====== Massa Jenis Kubus ======");
        kbs.setSisi(5);
        kbs.setMassa(250);
        System.out.println("Sisi : " + kbs.getSisi());
        System.out.println("Massa : " + kbs.getMassa());
        System.out.println("");
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(), kbs.hitungVolume(kbs.getSisi())));
    }
    
}
