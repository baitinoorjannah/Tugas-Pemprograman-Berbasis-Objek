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
public class Zodiak {
    public static void main(String[] args) {
        int kode;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukkan nama kode =");
        kode = input.nextInt();
        
        System.out.println("Masukkan Tanggal =");
        kode = input.nextInt();
        
        switch(kode) {
            case 1 :
                System.out.println("Aquarius"); break;
            case 2 :
                System.out.println("Sagitarius"); break;
            case 3 :
                System.out.println("Gemini"); break;
            case 4 :
                System.out.println("Canser"); break;
                
        }
    }
    
}
