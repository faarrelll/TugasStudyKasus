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
public class Uji {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String kasir;
        Transaksi uji = new Transaksi(0,0,"","",0,"","","",0);
        Tanggal tgl = new Tanggal();
        System.out.println("    'Toko Buku Berhadiah'");
        System.out.println();
        System.out.print("Kasir    = ");
        kasir = masukan.next();
        System.out.println("Tanggal Pembelian  = "+tgl.getTanggal());
        System.out.println("Waktu Pembelian    = "+tgl.getWaktu());
        System.out.println();
        System.out.println();
        System.out.println();
        uji.outputtt();
        int bil;
        System.out.println();
        System.out.println();
        
        do {   
            System.out.print("\n'1' Beli Lagi \n'2' Selesai\n\nSilahkan Pilih : ");
            bil = masukan.nextInt();
            System.out.println();
            System.out.println();
            switch (bil)
        {
            case 1 :  uji.outputtt();
                 break; 
            case 2 :  
                System.out.println();
                System.out.println("Terima Kasih...");
              break;
        }
            
        } while(bil !=2);
        
        
    }
}
