/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej16JAVA {

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
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = (int) (Math.random() * 10);
            
        System.out.println(vector[i]);
          
        }
        
        System.out.println("Introducir el número que desea buscar");
        buscar=leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            
           if (buscar==vector[i]){ 
               
               System.out.println("Se encontró en la parte " + i);
               
        }
        
        }
        
    }
    
}

/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/