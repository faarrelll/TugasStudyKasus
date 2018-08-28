/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pembeli extends Toko {
    
    public int id_pembeli;
    public String nama_pembeli,alamat,no_telp;
    
    public Pembeli(int id_barang, int harga_barang, String nama_barang, String merk_barang,int id_pembeli,String nama_pembeli,String alamat, String no_telp) {
        super(id_barang, harga_barang, nama_barang, merk_barang);
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    
    public void outputt(){
        Scanner masukan = new Scanner(System.in);
        super.output();
        System.out.println();
        System.out.println("----------------------");
        System.out.println();
        System.out.print("Id_pembeli    : ");
        this.id_pembeli = masukan.nextInt();
        System.out.print("Nama_pembeli  : ");
        this.nama_pembeli = masukan.next();
        System.out.print("Alamat        : ");
        this.alamat = masukan.next();
        System.out.print("No Telpon     : ");
        this.no_telp = masukan.next();
        
        
    }
    
}
