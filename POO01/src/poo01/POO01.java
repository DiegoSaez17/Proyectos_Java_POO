
package poo01;

import poo01.entidades.Libro;
import poo01.entidades.LibroServicio;


public class POO01 {

    
    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        
        Libro l1 = ls.Datos();
        
        System.out.println(l1);
        
    }
    
}
