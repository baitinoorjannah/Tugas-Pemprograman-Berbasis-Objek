/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan.pkgif;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int harga;
        int jumlah;
        int diskon;
        int total;
        
        System.out.print("Masukkan Harga barang disini = ");
        harga = input.nextInt();
        System.out.print("Masukkan Jumlah barang disini = ");
        jumlah = input.nextInt();
        total = jumlah*harga;
        
         if(total>=1000000){
            int discount = total*30/100;
            total=total-discount;
            System.out.println("Selamat anda mendapatkan diskon 30%" );
            System.out.println ("jadi totalnya : "+total);
            
             }
        else if(total>= 500000-1000000){
            int discount = total*20/100;
            total=total-discount;
            System.out.println("Selamat anda mendapatkan diskon 20%" );
            System.out.println ("jadi totalnya : "+total);
            
            }
        else if(total>=100000-500000){
            int discount = total*10/100;
            total=total-discount;
            System.out.println("Selamat anda mendapatkan diskon 10%" );
            System.out.println ("jadi totalnya : "+total);
            
             }
        else if (total<100000){
            int discount = total*0/100;
            total=total-discount;
            System.out.println("Maaf anda tidak mendapatkan diskon" );
            System.out.println ("jadi totalnya : "+total);
        }
    }    
            
    }
    

