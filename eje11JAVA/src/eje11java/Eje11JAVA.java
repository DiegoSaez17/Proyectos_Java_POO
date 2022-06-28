/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje11java;

import java.util.Scanner;


/**
 *
 * @author Diego
 */
public class Eje11JAVA {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        String op2;
        boolean confirmar = false;
        int n1;
        int n2;
        int op;
        int suma;
        int resta;
        int mult;
        int div;
        int sal;
        
        
        System.out.println("Ingrese el primer número");
        n1=leer.nextInt();
        
        System.out.println("Ingrese el segundo número");
        n2=leer.nextInt();
        
           System.out.println("Menú");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
        
        
            
       
        
           
       do {
          System.out.println("Elija opción;");
          op=leer.nextInt(); 
       switch(op) {
       
            
            case 1:
            suma=n1+n2;
                System.out.println("La suma es: " + suma);
            break;
            
            case 2:
            resta=n1-n2;
                System.out.println("La resta es: " + resta);
            break;
            
            case 3:
            mult=n1*n2;
                System.out.println("La multiplicación es: " + mult);
            break; 
            
            case 4:
            div=n1/n2;
                System.out.println("La división es: " + div);
            break;   
            
            case 5:
                
               System.out.println("¿Está seguro que desea salir del programa (S/N)?"); 
              op2=leer.next();
              
              if (op2.equalsIgnoreCase("S")) {
                  
                  confirmar = true;  
                  
                       
            } else {
                  
                           
                  confirmar = false;                  
              
            }
                                            
                           
                } 
                 
            } while  (!confirmar);
       
            System.out.println("Gracias por utilizar el programa.");
    }        
            
}         
            
     
            
                
            
    
            
        
    /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:


MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.

*/

