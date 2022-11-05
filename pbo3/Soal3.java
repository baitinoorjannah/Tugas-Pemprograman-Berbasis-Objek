/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Pilih Metode");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Kelling Persegi");
        System.out.println("Pilihan : ");
        char pilih = scan.next().charAt(0);
        
        switch (pilih){
            case '1' :
                System.out.println("Masukkan Panjang sisi persegi : 6");
                System.out.println("Keliling Persegi adalah : 36");
                break;
            case '2' :
                System.out.println("Masukkan Panjang sisi persegi : 6");
                System.out.println("Keliling Persegi adalah : 24");
                break;
            default :
                System.out.println("Sistem Error");
                
                
        }
    }
    
}
