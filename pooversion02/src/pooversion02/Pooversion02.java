package pooversion02;

//import java.util.Scanner;
import Servicio.CircunferenciaServicio;

import pooversion02.entidades.Circunferencia;

public class Pooversion02 {

    public static void main(String[] args) {
        
        CircunferenciaServicio cs = new CircunferenciaServicio();
        
        Circunferencia c1 = cs.crearCircunferencia();
        
        cs.area(c1);
        
        cs.perimetro(c1);
        
        
    }

}
