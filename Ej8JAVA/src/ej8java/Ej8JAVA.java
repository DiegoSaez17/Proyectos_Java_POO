/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej8JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String cad;
        int n;
        
        
        System.out.println("Ingrese una frase de 8 dígitos");
        
        cad=leer.nextLine();
        
       n=cad.length();
        
        if (n==8)
            
            System.out.println("CORRECTO");
        
        else
            
            System.out.println("INCORRECTO"); 
                 
        
        
        
        
        
    }
    
}

/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/