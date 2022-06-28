/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese un número:");
        
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número");
        
        num2 = leer.nextInt();
        
        
        if (num1>25)
            
            System.out.println("El número " + num1 + " es mayor que 25.");
        
        else if (num2>25)
            
            System.out.println("El número " + num2 + " es mayor que 25.");
        
        else if (num2 < 25 && num1 <25)
            
        
        System.out.println("Ninguno de los números es mayor que 25.");
        
        
        
        
        
    }
    
}
