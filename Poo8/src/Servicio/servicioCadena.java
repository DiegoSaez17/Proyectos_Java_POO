package Servicio;

import Entidad.cadena;
import java.util.Scanner;

public class servicioCadena {

    public cadena crearCadena() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        cadena cx = new cadena();

        System.out.println("Ingrese la frase");

        cx.setCadena(leer.nextLine());

        cx.setLongitud(cx.getCadena().length());

        return cx;

    }

    /*a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
    ingresada.*/
    public void mostrarVocales(cadena cx) {

        int[] vocales = {'a', 'e', 'i', 'o', 'u'};

        int cont = 0;

        for (int i = 0; i < cx.getCadena().length(); i++) {

            for (int a = 0; a < vocales.length; a++) {

                if (cx.getCadena().charAt(i) == vocales[a]) {

                    cont++;
                }

            }

        }

        System.out.println("La frase contiene " + cont + " vocales.");

    }

    /*b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase(cadena cx) {

        StringBuilder sb = new StringBuilder(cx.getCadena());

        System.out.println("La frase invertida es: " + sb.reverse());

    }

    /*c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(cadena cx) {

        System.out.println("Se encontraron las siguientes vocales: ");

        int[] va = {'a'};
        int[] ve = {'e'};
        int[] vi = {'i'};
        int[] vo = {'o'};
        int[] vu = {'u'};

        int conta = 0;
        int conte = 0;
        int conti = 0;
        int conto = 0;
        int contu = 0;

        /*a*/
        for (int i = 0; i < cx.getCadena().length(); i++) {

            for (int a = 0; a < va.length; a++) {

                if (cx.getCadena().charAt(i) == va[a]) {

                    conta++;
                }

            }

        }

        /*e*/
        for (int i = 0; i < cx.getCadena().length(); i++) {

            for (int a = 0; a < ve.length; a++) {

                if (cx.getCadena().charAt(i) == ve[a]) {

                    conte++;
                }

            }

        }

        /*i*/
        for (int i = 0; i < cx.getCadena().length(); i++) {

            for (int a = 0; a < vi.length; a++) {

                if (cx.getCadena().charAt(i) == vi[a]) {

                    conti++;
                }

            }

        }

        /*o*/
        for (int i = 0; i < cx.getCadena().length(); i++) {

            for (int a = 0; a < vo.length; a++) {

                if (cx.getCadena().charAt(i) == vo[a]) {

                    conto++;
                }

            }

        }

        for (int i = 0; i < cx.getCadena().length(); i++) {

            for (int a = 0; a < vu.length; a++) {

                if (cx.getCadena().charAt(i) == vu[a]) {

                    contu++;
                }

            }

        }

        System.out.println(conta + " A.");
        System.out.println(conte + " E.");
        System.out.println(conti + " I.");
        System.out.println(conto + " O.");
        System.out.println(contu + " U.");

    }

    /*e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(cadena cx) {

        System.out.println("La frase ingresada tiene: " + cx.getCadena().length() + " caracteres.");

        System.out.println("-------------");

        System.out.println("Ingrese la frase nueva: ");

        Scanner leer = new Scanner(System.in);

        String frase = leer.next();

        System.out.println("-------------");

        System.out.println("La frase nueva tiene: " + frase.length());

    }

    /*f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrase(cadena cx) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase para compararla agregarla a la actual");

        String fi = leer.next();

        System.out.println(cx.getCadena() + " " + fi);

    }

    /*g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
    frase resultante.*/
    public void reemplazar(cadena cx) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un caracter para cambiarlo en la frase en todas las letras a:");

        String letra = leer.next();

        String nuevaCad = cx.getCadena().replace("a", letra);

        System.out.println(nuevaCad);

    }

    /*h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public void contiene(cadena cx) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra para comprobar si se encuentra en la frase");

        String l = leer.next();

        int cont = 0;
        
        
        for (int i = 0; i < cx.getCadena().length(); i++) {

            String fb = cx.getCadena().substring(i, i+1);

            if (fb.equals(l)) {

                cont++;

            }

        }
        
        System.out.println("Se encontraron en la frase " + cont + " letras.");

    }

}
