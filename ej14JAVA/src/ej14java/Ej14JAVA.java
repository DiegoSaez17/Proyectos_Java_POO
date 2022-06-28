/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14java;

import static ej14java.Ej14JAVA.l;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej14JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            int euros;
            int libras;
            int l, d, y;
         Scanner leer = new Scanner(System.in);
         String moneda = null;
         
         menu(moneda);
         
         System.out.println("");
         
         System.out.println("Ingrese la cantidad de euros que quiere convertir");
         euros = leer.nextInt();
        
               float resl = l (euros);
               float resd = d (euros);
               float resy = y (euros);
                
         System.out.println("la cantidad de " + euros + " euros son " + resl + " libras.");
         System.out.println("La cantidad de " + euros + " euros son " + resd + " libras.");
         System.out.println("La cantidad de " + euros + " euros son " + resy + " libras.");
       
        
    }
    
    public static float l (int euros){
                
        float c;
        float a = (float) 0.86;
        
        c = a * euros;
                
        return c;
  
    }

    public static float d (int euros){
        
        float c;
        float a = (float) 1.28611;
        
        c = a * euros;
        
        return c;
              
    }
    
    public static float y (int euros){
        
        float c;
        float a = (float) 129.852;
        
        c = a * euros;
        
        return c;
        
    }
            
    
    
    public static void menu (String moneda) {
        
        System.out.println("El cambio de divisas es:");
        System.out.println("");
        System.out.println("*0.86 libras es un 1 €");
        System.out.println("*1.28611 $ es un 1 €");
        System.out.println("*129.852 yenes es un 1 €");
        
        
    }

     //To change body of generated methods, choose Tools | Templates.
    
    
}



/*

Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

*/