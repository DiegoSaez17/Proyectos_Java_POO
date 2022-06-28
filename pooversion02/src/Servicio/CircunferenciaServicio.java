
package Servicio;

import java.util.Scanner;
import javax.swing.JOptionPane;
import pooversion02.entidades.Circunferencia;


public class CircunferenciaServicio {
    
    
    public Circunferencia crearCircunferencia() {

        Circunferencia c1 = new Circunferencia();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");

        c1.setRadio(leer.nextDouble());
        
        return c1;

    }
    
    public void area(Circunferencia c1){
        
       double area = Math.PI*Math.pow(c1.getRadio(), 2);
        
        System.out.println("El area es: " + area);
    }
    
    public void perimetro(Circunferencia c1){
        
        double per = 2 * Math.PI * c1.getRadio();
        
        System.out.println("El perimetro es: " + per);
        
    }
    
}
