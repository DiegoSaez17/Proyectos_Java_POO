package Servicio;

import Entidad.persona;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class personaServicio {

    public persona crearPersona() {

        Scanner leer = new Scanner(System.in);

        persona n1 = new persona();

        Date fecha1 = new Date();

        System.out.println("Ingrese su nombre");

        n1.setNombre(leer.nextLine());

        System.out.println("Ingrese la fecha actual");

        System.out.println("Día");

        n1.setDia(leer.nextInt());

        System.out.println("Mes");

        n1.setMes(leer.nextInt());

        System.out.println("Año");

        n1.setAnio(leer.nextInt());

        LocalDate fecha2 = LocalDate.of(n1.getAnio(), Month.of(n1.getMes()), n1.getDia());

        LocalDate fechaActual = LocalDate.now();

        /*
        System.out.println("Su nobre es " + n1.getNombre());

        System.out.println("La fecha que ingresó es " + fecha2);
        System.out.println("La fecha actual es " + fechaActual);*/

        return n1;

    }

    public void calcularEdad(persona n1) {

        LocalDate fechaActual = LocalDate.now();

        LocalDate fecha2 = LocalDate.of(n1.getAnio(), Month.of(n1.getMes()), n1.getDia());

        Period dif = Period.between(fecha2, fechaActual);

        /*
        System.out.println("Usted tiene " + dif.getYears() + " años.");
        */

    }

    public void menorQue(int edad, persona n1) {

        edad = 18;

        boolean bandera = false;

        if (edad < n1.getAnio()) {

            bandera = false;

            System.out.println("Usted es mayor de edad.");

        } else {

            bandera = true;

            System.out.println("Usted es menor de edad.");

        }

    }

    public void mostrarPersona(persona n1) {

        System.out.println("Nombre completo: " + n1.getNombre());

        System.out.println("Fecha de nacimiento: " + n1.getDia() + "/" + n1.getMes() + "/" + n1.getAnio());
        
        

    }

}

/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
