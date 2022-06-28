package poo6;

import Entidad.Cafetera;
import Servicio.Metodo;
import java.util.Scanner;

public class Poo6 {

    public static void main(String[] args) {

        Metodo co = new Metodo();

        Cafetera c1 = co.llenarCafetera();

        int op;

        do {
            System.out.println("");
            System.out.println("Por favor elija una opción:");
            System.out.println("");
            System.out.println("Opción 1. Llenar cafetera.");
            System.out.println("Opción 2. Servir taza.");
            System.out.println("Opción 3. Vaciar cafetera.");
            System.out.println("Opción 4. Agregar café.");
            System.out.println("Opción 5. Salir.");
            System.out.println("");

            Scanner leer = new Scanner(System.in);
            op = leer.nextInt();

            if (op == 6) {

                System.out.println("Gracias por utilizar el programa.");

            }

            switch (op) {

                case 1:
                    co.llenarCafeteranuevo(c1);
                    break;
                case 2:
                    co.servirTaza(c1);
                    break;
                case 3:
                    co.vaciarCafetera(c1);
                    break;
                case 4:
                    co.agregarCafe(c1);
                    break;

            }

        } while (op < 6 && op >= 1);
    }

}

/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.

• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.

• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.

• Método vaciarCafetera(): pone la cantidad de café actual en cero.

• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
