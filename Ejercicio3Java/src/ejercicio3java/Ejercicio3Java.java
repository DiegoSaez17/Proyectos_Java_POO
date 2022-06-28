/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        String frase1;
        String frase2;
        
        System.out.println("Ingrese la frase en minúscula:");
        frase1 = leer.nextLine();
        
        System.out.println("Ingrese la frase en mayúsculas:");
        frase2 = leer.nextLine();
        
        System.out.println("La frase en minúsculas, queda así en mayúscula:");
        
        System.out.println(frase1.toUpperCase());
    
        System.out.println("La frase en mayúsculas, queda así en minúscula:");
        
        System.out.println(frase2.toLowerCase());
        
    }
    
}

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/