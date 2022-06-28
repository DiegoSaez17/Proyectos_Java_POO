/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio4JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner op = new Scanner(System.in);
        
        int c;
        
        System.out.println("Ingrese los grados C°");
        
        c=op.nextInt();
        
        System.out.println("Los " + c + "°" + "en Fahrenheit son:" + (32+(9*c/5)));
    }
    
}


/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/