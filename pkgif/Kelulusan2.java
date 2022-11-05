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

public class Kelulusan2 {
    public static void main(String[] args) {
        String nama,jeniskelamin;
        int tinggibadan;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Masukkan Nama = ");
        nama = inputan.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin = ");
        jeniskelamin = inputan.next();
        
        System.out.print("Masukkan Tinggi Badan = ");
        tinggibadan = inputan.nextInt();
        
        if(("laki-laki".equals(jeniskelamin))){
            if(tinggibadan >= 0 && tinggibadan <= 170){
                System.out.println("Anda Gagal");
            }else if ((tinggibadan >= 171 && tinggibadan <= 230)){
                System.out.println("Selamat Anda Lulus");
            }else{
                System.out.println("Error");
            }
        }else if (("perempuan".equals(jeniskelamin))){
            if(tinggibadan >= 0 && tinggibadan <= 160)
                System.out.println("Anda Gagal");
        }else if ((tinggibadan >= 161) && (tinggibadan <= 210)){
            System.out.println("Selamat Anda Lulus");
        }else{
            System.out.println("Error");
        
            }
        }
        
        
    }
    
    


    
       
    
        

        
      
        
    
    

