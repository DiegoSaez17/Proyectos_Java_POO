package servicio;

import entidad.arreglo;

public class ser {

    public arreglo crearArreglo() {

        arreglo ar = new arreglo();

        int m1[];

        m1 = new int[50];
        
        for (int i = 0; i < 50; i++) {

            m1[i] = (int) (Math.random() * 100);
        }

        ar.setArregloA(m1);

        for (int i = 0; i < 50; i++) {

            System.out.print(m1[i] + " ");
        }

        int mm;

        for (int i = 0; i < (49); i++) {

            for (int j = 0; j < (49); j++) {

                if (m1[j] > m1[j + 1]) {

                    mm = m1[j];

                    m1[j] = m1[j + 1];

                    m1[j + 1] = mm;

                }
            }

        }

        ar.setArregloA(m1);

        System.out.println(" ");
        
        System.out.println("Arreglo de menor a mayor");

        for (int i = 0; i < 50; i++) {

            System.out.print(ar.getArregloA()[i] + " ");

        }

        System.out.println(" ");

        int m2[];

        m2 = new int[20];

        /*int m3[];

        m3 = new int[10];

        for (int i = 0; i < 20; i++) {

            m3[i] = 5;
        
        }*/
        
        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 10; j++) {

                System.arraycopy(m1, 0, m2, 0, 10);

            }

            m2[i] = 5;

        }

        /*System.arraycopy(m3, 10, m2, 10, 20);*/
        
        ar.setArregloB(m2);

        for (int i = 0; i < 20; i++) {

            System.out.print(ar.getArregloB()[i] + " ");

        }

        return ar;
    }

}
