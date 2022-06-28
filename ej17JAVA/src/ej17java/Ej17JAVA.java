/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej17JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] vector;
          int n;
          int buscar;
          
          System.out.println("Tamaño de vector");
          Scanner leer = new Scanner(System.in);
          n=leer.nextInt();
                       
        vector = new int [n];
          
        int suma = 0;
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        int suma5 = 0;
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = (int) (Math.random() * 10000+1);
            
            
        System.out.println(vector[i]);
        
        
        int length = (int) Math.log10(vector[i]) + 1; //esta fórmula sirve para obtener la cantidad de dígitos del número
            //System.out.println(length);
        
             switch(length){
                 
                 case 1: suma1 = suma1 + 1;
                 break;
                 
                 case 2: suma2 = suma2 + 1;
                 break;
                 
                 case 3: suma3 = suma3 + 1;
                 break;
                 
                 case 4: suma4 = suma4 + 1;
                 break;
                 
                 case 5: suma5 = suma5 + 1;
                 break;
                     
                 }                             
             }
              
              System.out.println("Se encontraron " + suma1 + " números de 1 cifra.");
              System.out.println("Se encontraron " + suma2 + " números de 2 cifras.");
              System.out.println("Se encontraron " + suma3 + " números de 3 cifras.");
              System.out.println("Se encontraron " + suma4 + " números de 4 cifras.");
              System.out.println("Se encontraron " + suma5 + " números de 5 cifras.");
          
                   
        
                
            }
                
                
                
            }
                
                
                
            
        
        
        
            
            
            
        
    
    
    
    


/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/


