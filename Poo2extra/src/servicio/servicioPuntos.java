package servicio;

import entidad.entidadPuntos;
import java.util.Scanner;

public class servicioPuntos {

    public entidadPuntos crearPuntos() {

        Scanner leer = new Scanner(System.in);

        entidadPuntos nn = new entidadPuntos();

        System.out.println("Ingrese x1");

        nn.setX1(leer.nextDouble());

        System.out.println("Ingrese y1");

        nn.setY1(leer.nextDouble());

        System.out.println("Ingrese x2");

        nn.setX2(leer.nextDouble());

        System.out.println("Ingrese y2");

        nn.setY2(leer.nextDouble());

        return nn;

    }

    public void calcularDistancia(entidadPuntos nn) {
        
      double p01 = nn.getX2()-nn.getX1();
      
      double resul1 = Math.pow(p01, 2);
      
      double q01 = nn.getY2()-nn.getY1();
      
      double resul2 = Math.pow(q01, 2);
      
        System.out.println("La distancia es: " + Math.sqrt(resul1+resul2));

    }

}

/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html/*/
