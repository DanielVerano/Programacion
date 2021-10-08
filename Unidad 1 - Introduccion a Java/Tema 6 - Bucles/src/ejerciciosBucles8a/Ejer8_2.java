package ejerciciosBucles8a;

import java.util.Scanner;

public class Ejer8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, suma = 0, numAlumnos = 0, mayores18 = 0;
        double media;

        while (true) {
            System.out.print("Introduzca la edad del alumno/a: ");
            edad = sc.nextInt();
            if (edad < 0) {
                break;
            }
            suma += edad;
            numAlumnos++;
            if (edad >= 18) {
                mayores18++;
            }
        }
        media = (double) suma / numAlumnos;
        System.out.println("Suma de las edades: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Número de alumnos: " + numAlumnos);
        System.out.println("Número de alumnos mayores de edad: " + mayores18);
    }
}
