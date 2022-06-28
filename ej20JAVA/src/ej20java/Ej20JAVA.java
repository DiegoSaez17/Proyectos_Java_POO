/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej20JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int matriz [][]  = new int [3][3];
        int n=0;
        
        
        
        
        
        do 
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
              
                System.out.println("Ingrese un número del 1 al 9 ");
                n=leer.nextInt();
                System.out.println("Número ingresado en el lugar" + i + j);
                
                matriz[i][j] = n; 
                
                    
                }
            }
        
        while (n<=9&&n>=1);{
            
          System.out.println("El número ingresado es incorrecto. Intente nuevamente.");
          
        
        
                    
                  
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print("|" + matriz[i][j] + "|" ); //Se utiliza para mostrar la primera primera matriz
                
            }
            
            System.out.println(" ");

        }
        
        
       } 
        
        
    }
    
}


/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/