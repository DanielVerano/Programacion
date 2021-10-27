package tarea1_funciones;

public class Ejer3 {
    public static void main(String[] args) {
        calcula(1, 7, 5);
        calcula(2, 7,5);
    }

    public static void calcula(int numero, int altura, int radio) {
        double resultado;
        if (numero == 1) {
            resultado = 2 * Math.PI * radio * (altura + radio);
            System.out.println("El area total es " + resultado);
        } else if (numero == 2) {
            resultado = Math.PI * Math.pow(radio, 2) * altura;
            System.out.println("El volumen es " + resultado);
        }
    }
}
