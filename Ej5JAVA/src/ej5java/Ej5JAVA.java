/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej5JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int n;
        
        System.out.println("Ingrese un número:");
        
        n = leer.nextInt();
        
        double raiz = Math.sqrt(n); 
        
        System.out.println("El doble del número ingresado es: " + n*2);
        System.out.println("El tríple del número ingresado es: " + n*3);
        System.out.println("La raíz cuadrada del número ingresado es: " + raiz);
        
    }
    
}

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/