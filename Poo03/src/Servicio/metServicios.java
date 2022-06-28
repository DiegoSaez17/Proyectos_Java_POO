package Servicio;

import Entidades.Operaciones;
import java.util.Scanner;

public class metServicios {

    public Operaciones crearOperacion() {

        Operaciones op = new Operaciones();

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número");

        op.setNumero1(leer.nextDouble());
        
        System.out.println("Ingrese el segundo número");
        
        op.setNumero2(leer.nextDouble());
            
        return op;

    }
    
    public void sumar(Operaciones op){
        
       double suma = op.getNumero1() + op.getNumero2();
        
        System.out.println("La suma es: " + suma);
        
    }

    public void restar(Operaciones op){
        
        double resta = op.getNumero1() - op.getNumero2();
        
        System.out.println("La resta es: " + resta);
        
    }
    
    public void multiplicar(Operaciones op){
        
        if (op.getNumero1()==0 || op.getNumero2()==0){
            
            System.out.println("Error. No se puede multiplicar por 0.");
            
      
            
        }else{
            
           double mul = op.getNumero1() * op.getNumero2();
           
            System.out.println("La multiplicación es: " + mul);
            
             }        
            
        }
            
            
    
    public void dividir(Operaciones op){
        
        if (op.getNumero1()==0 || op.getNumero2()==0){
            
            System.out.println("Error. No se puede dividir por 0.");
            
                        
        }else{
            
            double div = op.getNumero1() / op.getNumero2();
            
            System.out.println("La división es: " + div);
            
        }
        
        
    }
               
           
}
        
        
        
       
        
    
        
    
    
    
    



/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
