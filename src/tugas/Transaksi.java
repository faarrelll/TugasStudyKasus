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
public class Transaksi extends Pembeli{
    public int total;
    public Transaksi(int id_barang, int harga_barang, String nama_barang, String merk_barang, int id_pembeli, String nama_pembeli, String alamat, String no_telp,int total) {
        super(id_barang, harga_barang, nama_barang, merk_barang, id_pembeli, nama_pembeli, alamat, no_telp);
        this.total = total;
    }
    
    public void outputtt(){
        super.outputt();
        System.out.println();
        System.out.println("----------------------");
        System.out.println();
        System.out.println("Id_Buku     : "+this.id_barang);
        System.out.println("Merk Buku   : "+this.merk_barang);
        System.out.println("Nama Buku   : "+this.nama_barang);
        System.out.println("Harga Buku  : "+this.harga_barang);
        System.out.println("Id_pembeli  : "+this.id_pembeli);
        System.out.println("Nama_pembeli: "+this.nama_pembeli);
        System.out.println("Alamat      : "+this.alamat);
        System.out.println("No Telpon   : "+this.no_telp);
        System.out.println("Total       : "+this.harga_barang);
        
        
        
    }
    
    
}
