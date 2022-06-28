/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13java;

/**
 *
 * @author Diego
 */
public class Ej13JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*//Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();*/
        
        int n = 4;
        //linea superior
        for(int i = 0; i < 4; i++) {
            
            System.out.print("*");
            
        }
        /*System.out.println();*/
        System.out.println();
        
        
        /* for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }*/
        
        //centro de la forma
        for (int i = 0; i < 2; i++) {
          System.out.println("*");
          
            System.out.println(" ");
          
          for (int j = 0; j < 2; j++) {
          System.out.print(" "); 
        }
            System.out.println("-");
        }
        
        
        /*for(int i = 0; i < n; i++) {
                System.out.print("*");*/
        
        for (int i = 0; i < 4; i++) {
            
            System.out.print("*");          
            
           
        }
        System.out.println("");
    }
    
}

/*if(n >= 0 && n<=50) {
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");*/


/*

Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

* * * *
*     *
*     *
* * * *

*/