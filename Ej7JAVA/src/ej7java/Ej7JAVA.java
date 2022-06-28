/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej7JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String cad;
        
        System.out.println("Ingrese una frase");
        
        cad = leer.nextLine();
        
        if (cad.equals("eureka"))
        
        System.out.println("Correcto");
        
        else
        
            System.out.println("Usted no adivino la frase");
        
    }
    
}

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.*/