package tarea4_tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] colores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
        String[] palabras = {"casa","azul","verde","orden","morado","bombilla","bici","rosa"};

//        for (int i = 0; i < palabras.length; i++) {
//            System.out.println("Introduce una palabra:");
//            palabras[i] = sc.nextLine();
//        }

        System.out.println("Array sin ordenar: " + Arrays.toString(palabras));
        System.out.println("Array ordenado: " + Arrays.toString(ordenaColores(palabras, colores)));
    }

    public static String[] ordenaColores(String[] v1, String[] colores) {
        String[] resultado = new String[v1.length];
        String[] auxColores = new String[0];
        String[] auxNoColores = new String[0];
        boolean esta;

        for (int i = 0; i < v1.length; i++) {
            esta = esta(colores, v1[i]);

            if (esta) {
                auxColores = Arrays.copyOf(auxColores, auxColores.length + 1);
                auxColores[auxColores.length - 1] = v1[i];

            } else {
                auxNoColores = Arrays.copyOf(auxNoColores, auxNoColores.length + 1);
                auxNoColores[auxNoColores.length - 1] = v1[i];
            }

        }

        for (int i = 0; i < auxColores.length; i++) {
            resultado[i] = auxColores[i];
        }

        for (int i = 0; i < auxNoColores.length; i++) {
            resultado[auxColores.length + i] = auxNoColores[i];
        }

        return resultado;
    }

    public static boolean esta(String[] v1, String s) {
        for (int i = 0; i < v1.length; i++) {
            if (v1[i].equals(s)) {
                return true;
            }
        }
        return false;
    }
}
