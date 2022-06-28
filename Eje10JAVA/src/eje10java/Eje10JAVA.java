/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje10java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Eje10JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner ob = new Scanner(System.in);
            int n;
            int suma = 0;
            int n1;
            
            System.out.println("Ingrese un número límite");
            n=ob.nextInt();
            
            do {
                
                System.out.println("Ingrese un número");
                n1=ob.nextInt();
                
                suma=suma+n1;
                
             }while (suma<=n); 
            

        }
        
    }
    


/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/