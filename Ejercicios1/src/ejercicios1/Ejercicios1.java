/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicios1 {
    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
     
Scanner leer = new Scanner(System.in);
String nombre;
int edad;
System.out.println("Ingrese su nombre");
nombre = leer.nextLine();
System.out.println("Ingrese su edad");
edad = leer.nextInt();
      


System.out.println("Su nombre es: " + nombre + " y tienes: " + edad + " años.");


}
}
   
           
     