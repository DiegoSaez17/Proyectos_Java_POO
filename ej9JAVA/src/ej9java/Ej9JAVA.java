/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej9JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        String frase;
        String f;
        
               
        System.out.println("Ingrese una frase que empiece cno la letra A");
        
        frase=ob.nextLine();
        f=frase.substring(0,1);
        
        switch (frase.substring(0,1)) {
            case "a":
                System.out.println("CORRECTO");
                break;
            case "A":
                System.out.println("CORRECTO");
                break;
            default:
                System.out.println("INCORRECTO");
                break;
        }
        
   
        
                     
            
        
        
    }
    
}

/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.*/