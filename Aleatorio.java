package valor_a_arrays;

import java.util.Arrays;

public class Aleatorio {

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        int random = (int) (Math.random() * (5000 - 1 + 1) + 1);
        int residuo, division;

        System.out.println("Valor generado: " + random);

        for (int i = arreglo.length - 1; i >= 0 && random != 0; i--) {

            if (random % 2 == 0) {

                arreglo[i] = 0;

            } else {

                arreglo[i] = 1;

            }

            random /= 2;

        }//Fin del metodo for

        if (random == 0) {

            System.out.println("En el arreglo quedaron los valores: " + Arrays.toString(arreglo));

        } else {

            System.out.println("Celdas del arreglo se agotaron");

        }

    }//Fin del método main

}
