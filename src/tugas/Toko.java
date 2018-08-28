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
public class Toko {

    public int id_barang,harga_barang;
    public String nama_barang,merk_barang;
    
    public Toko(int id_barang, int harga_barang, String nama_barang,String merk_barang){
        
        this.id_barang = id_barang;
        this.harga_barang = harga_barang;
        this.nama_barang = nama_barang;
        this.merk_barang = merk_barang;
    }
    
    public void output(){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Id_barang   : ");
        this.id_barang = masukan.nextInt();
        System.out.print("Merk barang : ");
        this.merk_barang = masukan.next();
        System.out.print("Nama Barang : ");
        this.nama_barang = masukan.next();
        System.out.print("Harga       : ");
        this.harga_barang = masukan.nextInt();
        
        
        
        
    }


}
