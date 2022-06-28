/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19java;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej19JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    Scanner leer = new Scanner(System.in);
    
    boolean bandera = false;
    int matriz1 [][] = new int [3][3];
    int matriz [][]  = new int [3][3];
        
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
        
        System.out.println("Matriz A anti-simétrica"); //matriz transpuesta
 
           for (int j = 0; j < 3; j++) {
                
                for (int i = 0; i < 3; i++) {
                    
                    System.out.print("|" + -matriz [i][j] + "|");
                    
                }
                
                System.out.println(" ");
            }
        
        
        int n = 0;
        
        
          System.out.println("Matriz B");  
          
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Ingrese el valor ");
                
                n=leer.nextInt();
                
                matriz1[i][j] = n;
                                                     
            }
        }
          
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print("|" + matriz1 [i][j] + "|");
                
            }
            
            System.out.println(" ");
        } 
        System.out.println(" ");
        
    
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    
                   if (-matriz[j][i]!=matriz1[i][j]) {
                      
                     bandera = true;
                     
                   }
                }
            }
            
              
            if (bandera == true){
                
                System.out.println("Matriz no es anti-simétrica");
                
              }else{
                
                System.out.println("Matriz anti-simétrica");
                
            }
        
    }
        
    }
    



/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/