/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej18java;

/**
 *
 * @author Diego
 */
public class Ej18JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriz = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                matriz[i][j] = (int) (Math.random() * 10+1);
                
            }
            
            
        }
        
        
        System.out.println("Matriz A");
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print("|" + matriz[i][j] + "|" ); //Se utiliza para mostrar la primera primera matriz
                
            }
            
                    System.out.println(" ");

        }
        
        System.out.println(" ");
        System.out.println("Matriz B");
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                
                System.out.print("|" + matriz[i][j] + "|"); //Se utiliza para mostrar la segunda matriz
                
            }
            
             System.out.println(" ");
            
        }
        
    }
    
}

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/