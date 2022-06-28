package Servicio;

//import java.util.Scanner;

import java.util.Scanner;
import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class Circunferencia {
    
    private double radio;
    double per, a;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(){
    
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el radio");
        
        radio = leer.nextDouble();
    }
    
    public void area(){
      
        a = Math.PI * Math.pow(radio, 2);
        
    }
    
    public void perimetro(){
        
        per = 2 * (Math.PI*radio);
        
    }
    
    public void mostrarResultados(){
        
        System.out.println("El area es: " + a);
        
        System.out.println("El perímetro es: " + per);
        
    }
    
}

