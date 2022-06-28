package poo05;

import Entidades.cuentaBancaria;
import Servicio.Metodos;
import java.util.Scanner;

public class POO05 {
    
    public static void main(String[] args) {
        
        Metodos m1 = new Metodos();

        //cuentaBancaria B = new cuentaBancaria();
        cuentaBancaria c1 = m1.crearCuenta();
        
        m1.opcion();
        
        int opcion = 0;
        
        int op;
        
        do {
            
            System.out.println("Introduzca una opción:");
            System.out.println("Opción 1. Introducir dinero al saldo actual.");
            System.out.println("Opción 2. Retirar dinero.");
            System.out.println("Opción 3. Extracción rápida.");
            System.out.println("Opción 4. Consultar Saldo.");
            System.out.println("Opción 5. Consultar Datos.");
            System.out.println("Opción 6. Salir.");
            
            Scanner leer = new Scanner(System.in);
            
            op = leer.nextInt();
            
        switch (op) {
            
            case 1:
                
                m1.ingresar(c1);
                
                break;
            
            case 2:
                
                m1.retirar(c1);
                
                break;
            
            case 3:
                
                m1.extraccionRapida(c1);
                
                break;
            
            case 4:
                m1.consultarSaldo(c1);
                break;
            
            case 5:
                m1.consultarDatos(c1);
                break;
            
            case 6:
                
                System.out.println("Gracias por utilizar el programa.");
                break;
            
        }
        
        } while (op < 6 && op >= 1);
        
    }
    
}

/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
