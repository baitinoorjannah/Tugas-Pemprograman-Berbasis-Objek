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
public class Switchcase {
    public static void main(String[] args) {
        int kode;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        kode = inputan.nextInt();
        switch(kode){
            case 1:
                System.out.println("IPA");
            case 2:
                System.out.println("IPS");
            case 3:
                System.out.println("BHS");
        }
       
    }
}
  
    
    
    
                
    
