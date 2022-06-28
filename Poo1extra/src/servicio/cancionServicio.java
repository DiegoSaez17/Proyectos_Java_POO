package servicio;

import entidad.cancionEntidad;
import java.util.Scanner;

public class cancionServicio {

    public cancionEntidad crearCancion() {

        Scanner leer = new Scanner(System.in);

        cancionEntidad nn = new cancionEntidad();

        System.out.println("Introducir el título de la canción:");

        nn.setTitulo(leer.nextLine());

        System.out.println("Introducir el autor de la canción");

        nn.setAutor(leer.nextLine());

        return nn;

    }

    public void mostrarCancion(cancionEntidad nn) {

        System.out.println("Datos de la canción:");
        System.out.println("Título: " + nn.getTitulo());

        System.out.println("Autor: " + nn.getAutor());

    }

}

/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.*/
