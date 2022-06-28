/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej6JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int resultado;
        
        System.out.println("Ingrese un número");
        num=leer.nextInt();
        
        if (num%2==0)
        
        System.out.println("El número ingresado es par");
        
        else
        
            System.out.println("El número ingresado no es par");
        
        
                
    }
    
}

/*Crear un programa que dado un numero determine si es par o impar.*/