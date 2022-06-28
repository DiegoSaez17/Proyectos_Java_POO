package poo7;

import Entidad.Persona;
import Servicio.serviciopersona;

public class POO7 {

    public static void main(String[] args) {

        serviciopersona per = new serviciopersona();

        Persona p1 = per.crearPersona();
        per.calcularIMC(p1);
        int IMC1 = p1.IMC;
        per.esMayorDeEdad(p1);

        Persona p2 = per.crearPersona();
        per.calcularIMC(p2);
        int IMC2 = p2.IMC;
        per.esMayorDeEdad(p2);

        Persona p3 = per.crearPersona();
        per.calcularIMC(p3);
        int IMC3 = p3.IMC;
        per.esMayorDeEdad(p3);

        Persona p4 = per.crearPersona();
        per.calcularIMC(p4);
        int IMC4 = p4.IMC;
        per.esMayorDeEdad(p4);

        /*Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
        distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
        cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
        también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.*/
        
        int IMCmalo = 0;
        int IMCbien = 0;
        int IMCpasado = 0;

        int[] vector;
        vector = new int[4];
        vector[0] = IMC1;
        System.out.println(vector[0]);
        vector[1] = IMC2;
        System.out.println(vector[1]);
        vector[2] = IMC3;
        System.out.println(vector[2]);
        vector[3] = IMC4;
        System.out.println(vector[3]);

        for (int i = 0; i < 4; i++) {
            switch (vector[i]) {

                case -1:
                    IMCmalo = IMCmalo + 1;
                    break;
                case 0:
                    IMCbien = IMCbien + 1;
                    break;

                case 1:
                    IMCpasado = IMCpasado + 1;
                    break;
            }
        }

        System.out.println(IMCmalo);
        System.out.println(IMCbien);
        System.out.println(IMCpasado);
        double IMCmalo1 = (IMCmalo * 100) / 4;
        double IMCbien1 = (IMCbien * 100) / 4;
        double IMCpasado1 = (IMCpasado * 100) / 4;

        System.out.print("un " + IMCmalo1 + " % esta por debajo, un " + IMCbien1 + "% esta en el peso ideal, un " + IMCpasado1 + "% esta en sobrepeso");

    }

}

/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:

• Un constructor por defecto. ---

• Un constructor con todos los atributos como parámetro. ---

• Métodos getters y setters de cada atributo. ---

• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje

• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.

• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.*/
