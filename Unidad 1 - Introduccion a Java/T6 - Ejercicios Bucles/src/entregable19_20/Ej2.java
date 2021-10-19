package entregable19_20;

import java.util.Scanner;

public class Ej2 {
//    Calcular si un número es capicúa (se leen igual hacia delante y hacia atrás)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero, aux;
        long numeroInverso = 0;
        int cont = 0;
        boolean esCapicua = true;

        System.out.println("Introduce un número:");
        numero = sc.nextLong();

//        Asignar el número a una variable auxiliar para no perder el número original
        aux = numero;
//        Averiguar el número invertido
        while (aux != 0) {
            int digito = (int) aux % 10;
            numeroInverso = numeroInverso * 10 + digito;
            aux = aux / 10;
            cont++;
        }

        aux = numero;
//        Iterar hasta el número de dígitos del número
        for (int i = 0; i < cont; i++) {
            long digito1 = aux % 10;
            long digito2 = numeroInverso % 10;

            if (digito1 != digito2) {
                esCapicua = false;
                break;
            }
            aux = aux / 10;
            numeroInverso = numeroInverso / 10;
        }

        if (esCapicua) {
            System.out.println("El número " + numero + " es capicúa");
        } else {
            System.out.println("El número " + numero + " no es capicúa");
        }
    }
}
