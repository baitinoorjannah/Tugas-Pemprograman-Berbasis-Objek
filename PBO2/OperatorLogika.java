/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

/**
 *
 * @author ASUS
 */
public class OperatorLogika {
    public static void main(String[] args) {
        boolean b1 = 5 < 10;
        boolean b2 = 9 > 11;
        boolean b3 = !b1;
        boolean b4 = !b2;
        
        boolean  TesAND1 = b1 & b2;
        boolean  TesAND2 = b1 && b2;
        boolean  TesAND3 = b1 && b3;
        boolean  TesAND4 = b1 && b4;
        
        boolean TesORI1 = b1 | b2;
        boolean TesORI2 = b1 || b2;
        boolean TesORI3 = b1 || b3;
        boolean TesORI4 = b1 || b4;
        
        boolean TesXOR1 = b1 ^ b2;
        boolean TesXOR2 = b1 ^ b3;
        boolean TesXOR3 = b1 ^ b4;
        
        System.out.println("Tes AND 1 = " + TesAND1);
        System.out.println("Tes AND 2 = " + TesAND2);
        System.out.println("Tes AND 3 = " + TesAND3);
        System.out.println("Tes AND 4 = " + TesAND4);
        System.out.println("Tes ORI 1 = " + TesORI1);
        System.out.println("Tes ORI 2 = " + TesORI2);
        System.out.println("Tes ORI 3 = " + TesORI3);
        System.out.println("Tes ORI 4 = " + TesORI4);
        System.out.println("Tes XOR 1 = " + TesORI1);
        System.out.println("Tes XOR 2 = " + TesORI2);
        System.out.println("Tes XOR 3 = " + TesORI3);
        
    }
    
}
