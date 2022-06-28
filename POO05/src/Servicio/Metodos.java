package Servicio;

import Entidades.cuentaBancaria;
import static java.lang.System.in;
import java.util.Scanner;

public class Metodos {

    public cuentaBancaria crearCuenta() {

        cuentaBancaria Bn = new cuentaBancaria();

        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido, por favor ingrese los datos.");

        System.out.println("1_Ingrese número de cuenta: ");
        Bn.setNumeroCuenta(leer.nextInt());

        System.out.println("2_Ingrese número de DNI: ");
        Bn.setDNI(leer.nextInt());

        System.out.println("3_Ingrese su saldo actual: ");
        Bn.setSaldoActual(leer.nextInt());

        return Bn;

    }
    

    public void opcion() {


    }

    public void ingresar(cuentaBancaria in) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero que desea agregar a su saldo actual: ");

        double saldoNuevo = leer.nextInt();

        double suma = saldoNuevo + in.getSaldoActual();

        System.out.println("El saldo nuevo en su cuenta es: " + suma);
        
        in.setSaldoActual(suma);

    }
    
   
    public double retirar(cuentaBancaria re) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero que desea retirar.");

        int saldoMenos = leer.nextInt();

        double resta=0;

        if (saldoMenos < re.getSaldoActual()) {

            resta =  re.getSaldoActual() - saldoMenos;
            
            System.out.println("Usted esta retirando: " + saldoMenos);
            System.out.println("Su saldo actual quedaría en: " + resta);
            
            re.setSaldoActual(resta);
            

        } else {

            System.out.println("Saldo insuficiente.");
            
        }

        return resta;

    }

    public void extraccionRapida(cuentaBancaria ex) {

        Scanner leer = new Scanner(System.in);

        double er;
        
        er =  0.20 * ex.getSaldoActual();

        System.out.println("El 20% de su sueldo es: " + er);
        
        double extraccion = ex.getSaldoActual() - er;
        
        System.out.println("Su saldo actual es: " + extraccion);
        
        ex.setSaldoActual(extraccion);

    }

    public void consultarSaldo(cuentaBancaria con) {

        System.out.println("Su saldo actual es: " + con.getSaldoActual());

    }

    public void consultarDatos(cuentaBancaria consul) {

        System.out.println("Los datos de su cuenta son: ");
        System.out.println("Número de cuenta: " + consul.getNumeroCuenta());
        System.out.println("DNI: " + consul.DNI());
        System.out.println("Saldo actual: " + consul.getSaldoActual());

    }

   
}
