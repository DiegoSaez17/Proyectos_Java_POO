
package poo01.entidades;

import java.util.Scanner;


public class LibroServicio {
    
    public Libro Datos(){
        
        Libro l1 = new Libro();
        
        
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el Título del libro");
        l1.setTítulo(leer.next());
        
        System.out.println("Ingrese el Nombre del autor");
        l1.setAutor(leer.next());
        
        System.out.println("Ingrese el Número de páginas");
        l1.setNumDePag(leer.nextInt());
        
        int num = (int)(Math.random()*100000);
        
        l1.setISBN(num);
        
        return l1;
        
    }
    
    
    
}
