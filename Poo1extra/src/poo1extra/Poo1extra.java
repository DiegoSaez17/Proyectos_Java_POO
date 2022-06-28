package poo1extra;

import entidad.cancionEntidad;
import servicio.cancionServicio;

public class Poo1extra {

    public static void main(String[] args) {

        cancionServicio n1 = new cancionServicio();

        cancionEntidad nx = n1.crearCancion();

        n1.mostrarCancion(nx);

    }

}

/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.*/
