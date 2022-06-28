package poo11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Poo11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Date fecha1 = new Date(); //se está instanciando la fecha actual

        int dia;
        int mes;
        int anio;
        
        System.out.println(fecha1);

        System.out.println("Ingrese el día");
        dia = leer.nextInt();

        System.out.println("Ingrese el mes");
        mes = leer.nextInt();

        System.out.println("Ingrese el año con 2 dígitos");
        anio = leer.nextInt();
        
        
        
        //Con este método, el año se utiliza con 2 dígitos
        
        
        
        Date fecha2 = new Date(anio-1900, mes, dia);
        
        
        int diferencia = fecha1.getYear()-fecha2.getYear(); //método 1
        
        System.out.println("La diferencia entre una fecha y la otra es: " + diferencia);
        
        
        
        /*------------------------------*/
       
        
        LocalDate fecha3 = LocalDate.of(anio, Month.of(mes), dia); //método 2
        LocalDate fechaActual = LocalDate.now();
        
        Period dif = Period.between(fecha3, fechaActual);
            
        System.out.println("Días: " + dif.getDays());
        System.out.println("Meses: " + dif.getMonths());
        System.out.println("Años: " + dif.getYears());
           
        
    }
    
    
}

/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/
