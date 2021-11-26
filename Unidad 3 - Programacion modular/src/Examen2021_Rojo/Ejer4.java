package Examen2021_Rojo;

import java.util.Arrays;

public class Ejer4 {
    public static void main(String[] args) {
        String[][] a = {{"HOLA","PERRO","C++"},{"ADIOS","GATO","PYTHON"},{"HASTA LUEGO","VACA","JAVA"}};
        String[][] b = {{"BD","SOBRESALIENTE","PEPE"},{"LM","NOTABLE","MANUEL"},{"PROG","APROBADO","ROSA"}};

        for (String[] fila : a) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();

        for (String[] fila : b) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();

        String[][] r = unirMatrices(a, b);

        for (String[] fila : r) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static String[][] unirMatrices(String[][] v1, String[][] v2) {

        if (v1.length == v2.length && v1[0].length == v2[0].length) {
            String[][] res = new String[v1.length][v1[0].length + v2[0].length];

            for (int i = 0; i < v1.length; i++) {
                for (int j = 0; j < v1[i].length; j++) {
                    res[i][j] = v1[i][j];
                }
            }

            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[i].length - v1.length; j++) {
                    res[i][v1.length + j] = v2[i][j];
                }
            }

            return res;
        } else {
            return new String[][]{};
        }
    }
}
