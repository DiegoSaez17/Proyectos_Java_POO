package Servicio;

import java.util.Scanner;
import Entidad.Persona;

public class serviciopersona {

    /*• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
        usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
        Si no es correcto se deberá mostrar un mensaje*/
    
    Persona per = new Persona();

    public Persona crearPersona() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Nombre:");

        per.setNombre(leer.next());

        System.out.println("Ingrese Edad:");

        per.setEdad(leer.nextInt());

        System.out.println("Ingrese Sexo: ");
        System.out.println("M - mujer");
        System.out.println("H - hombre");
        System.out.println("O - otros");

        per.setSexo(leer.next());

        switch (per.getSexo()) {
            case "h":
            case "H":
                per.setNombre("Hombre");
                break;

            case "m":
            case "M":
                per.setNombre("Mujer");
                break;

            case "o":
            case "O":
                per.setNombre("Binario");
                break;

            default:
                System.out.println("Opción incorrecta.");
                break;
        }

        System.out.println("Ingrese su Peso");

        per.setPeso(leer.nextInt());

        System.out.println("Ingrese su Altura");

        per.setAltura(leer.nextDouble());

        return per;
    }

    /*• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.*/
    public int calcularIMC(Persona per) {

          int IMC1; 
          
        IMC1 = (int) (per.getPeso() / (Math.pow(per.getAltura(),2)));
        
        if (IMC1 < 20) {
            
            System.out.println("estas debajo del peso ideal");
            
           per.setIMC(-1);
        }else if (IMC1 >= 20 && IMC1 <= 25) {
            
            System.out.println("estas en tu peso ideal");
            
            per.setIMC(0);
            
        }else if (IMC1 > 25) {
            
            System.out.println("estas en sobrepeso");
            
            per.setIMC(1);
        }
        
        return per.IMC;

    }

    /*• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
        un booleano.*/
    public void esMayorDeEdad(Persona per) {

        boolean bandera = false;

        if (per.getEdad() >= 18) {

            bandera = true;

            System.out.println("Usted es mayor de edad.");
        }
    }
}

/*



A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.*/
