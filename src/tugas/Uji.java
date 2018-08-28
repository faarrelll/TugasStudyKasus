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
        Transaksi uji = new Transaksi(0,0,"","",0,"","","",0);
        System.out.println("Kasir = Admin 1");
        System.out.println("Tagnggal = 28 Agustus 2018");
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
            case 2 :  System.out.println("Terima Kasih...");
              break;
        }
            
        } while(bil !=2);
        
        
    }
}
