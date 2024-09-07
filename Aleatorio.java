package valor_a_arrays;

import java.util.Arrays;

public class Aleatorio {

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        int random = (int) (Math.random() * (5000 - 1 + 1) + 1);
        int residuo, division;

        System.out.println("Valor generado: " + random);