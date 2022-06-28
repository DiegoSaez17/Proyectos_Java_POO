/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio2JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nomb;
        
        System.out.println("Ingrese su nombre");
        
        nomb = leer.nextLine();
        
        System.out.println("Su nombre es: " + nomb);
        
    }
    
}

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/