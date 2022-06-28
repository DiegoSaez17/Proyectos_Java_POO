package servicio;

import Entidad.matematica;

public class servicioMat {

    public matematica crearMat() {

        matematica cc = new matematica();

        float n1 = (float) Math.random() * 20 + 1;
        float n2 = (float) Math.random() * 20 + 1;

        System.out.println("Los dos números son los siguientes");
        System.out.println("----------");

        cc.setNum1(n1);

        System.out.println("Número 1: " + cc.getNum1());
        cc.setNum2(n2);

        System.out.println("Número 2: " + cc.getNum2());
        System.out.println("----------");

        return cc;

    }

    public void devolverMayor(matematica cc) {

        if (cc.getNum1() < cc.getNum2()) {

            System.out.println("El número mayor es: " + cc.getNum2());

        } else if (cc.getNum1() > cc.getNum2()) {
            System.out.println("El número mayor es: " + cc.getNum1());
        }

    }

    public void calcularPotencia(matematica cc) {

        System.out.println("----------");

        System.out.println("El primer número redondeado es: " + Math.round(cc.getNum1()));
        cc.setNum1(Math.round(cc.getNum1()));

        System.out.println("El segundo número redondeado es: " + Math.round(cc.getNum2()));
        cc.setNum2(Math.round(cc.getNum2()));

        if (Math.round(cc.getNum1()) > Math.round(cc.getNum2())) {

            double pot = Math.pow(cc.getNum1(), cc.getNum2());

            System.out.println("----------");

            System.out.println("La potencia del número " + Math.round(cc.getNum1()) + ", elevado a " + Math.round(cc.getNum2()) + " es " + pot);

        } else if ((Math.round(cc.getNum1()) < Math.round(cc.getNum2()))) {

            double pot2 = Math.pow(cc.getNum2(), cc.getNum1());

            System.out.println("----------");

            System.out.println("La potencia del número " + Math.round(cc.getNum2()) + ", elevado a " + Math.round(cc.getNum1()) + " es " + pot2);

        }

    }

    public void calcularRaiz(matematica cc) {

        if (Math.round(cc.getNum1()) > Math.round(cc.getNum2())) {

            float n2 = Math.round(cc.getNum2());

            double valorAbs = Math.abs(n2);

            double raiz = Math.sqrt(valorAbs);

            System.out.println("----------");

            System.out.println("La raíz cuadrada del número más pequeño " + Math.round(cc.getNum2()) + " es: " + raiz);

        } else if ((Math.round(cc.getNum1()) < Math.round(cc.getNum2()))) {

            float n1 = Math.round(cc.getNum1());

            double valorAbs = Math.abs(n1);

            double raiz2 = Math.sqrt(valorAbs);

            System.out.println("----------");

            System.out.println("La raíz cuadrada del número más pequeño " + Math.round(cc.getNum1()) + " es: " + raiz2);

        }

    }
}

/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
