
package poo02;

//import javax.swing.JOptionPane;

import Servicio.Circunferencia;
import javax.swing.JOptionPane;



public class Poo02 {

  
    public static void main(String[] args) {
        
        
        Circunferencia resultado = new Circunferencia();
        
        resultado.crearCircunferencia();
        
        resultado.area();
        
        resultado.perimetro();
        
        resultado.mostrarResultados();
        
    }
   
}

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).*/