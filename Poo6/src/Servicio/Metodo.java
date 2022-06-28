package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class Metodo {
    
    

    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public Cafetera llenarCafetera() {

        Cafetera llenar = new Cafetera();
        return llenar;
    }
    
    public void llenarCafeteranuevo(Cafetera l){
        
        if (l.getCapacidadActual() == 1000) {

            System.out.println("Su cafetera esta completa.");

        }else{
            
            System.out.println("Su cafetera se llenó correctamente.");
            l.setCapacidadActual(1000);
        }
        
    }

    //• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    // cuanto quedó la taza.
    public void servirTaza(Cafetera ser) {

        int taza;

        Scanner leer = new Scanner(System.in);

        System.out.println("Elija opción de taza.");
        System.out.println("Opción 1. Taza 100ml.");
        System.out.println("Opción 2. Taza 200ml.");
        System.out.println("Opción 3. Taza 250ml.");

        taza = leer.nextInt();

        switch (taza) {

            case 1:

                if (100 <= ser.getCapacidadActual()) {

                    int tazaCom = ser.getCapacidadActual() - 100;

                    ser.setCapacidadActual(tazaCom);

                    System.out.println("Su taza esta llena.");
                }else{
                    System.out.println("Café insuficiente.");
                }

                break;

            case 2:

                if (200 <= ser.getCapacidadActual()) {

                    int tazaCom = ser.getCapacidadActual() - 200;

                    ser.setCapacidadActual(tazaCom);

                    System.out.println("Su taza esta llena.");
                }else{
                    System.out.println("Café insuficiente.");
                }

                break;

            case 3:
                if (250 <= ser.getCapacidadActual()) {

                    int tazaCom = ser.getCapacidadActual() - 250;

                    ser.setCapacidadActual(tazaCom);

                    System.out.println("Su taza esta llena.");
                }else{
                    System.out.println("Café insuficiente.");
                }

                break;

        }

    }

    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public int vaciarCafetera(Cafetera vaciar) {

        vaciar.setCapacidadActual(0);

        System.out.println("Cafetera vacia.");

        return 0;
    }

    //• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera agregar) {

        System.out.println("Cantidad actual de café: " + agregar.getCapacidadActual());
        System.out.println("¿Cuanta cantidad desea agregar?");

        Scanner leer = new Scanner(System.in);

        int cantidad = leer.nextInt();

        int suma = agregar.getCapacidadActual() + cantidad;

        if (suma > agregar.getCapacidadMaxima()) {

            System.out.println("Cafetera llena.");

            agregar.setCapacidadActual(1000);

            int resta = suma - 1000;

            System.out.println("Sobran: " + resta);

        } else {

            System.out.println("Se agregó :" + cantidad);

            agregar.setCapacidadActual(agregar.getCapacidadActual() + cantidad);

        }
    }
}
