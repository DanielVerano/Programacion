package Tarea3.Map_I;

import java.util.HashMap;
import java.util.Scanner;

import static Tarea3.Map_I.Ejer1.calcularClave;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> nombres = new HashMap<>();
        nombres.put(calcularClave("12345678A"), "Pepe");
        nombres.put(calcularClave("11223344B"), "Juan");
        nombres.put(calcularClave("33334444C"), "Ana");
        nombres.put(calcularClave("55667788D"), "Clara");

        System.out.println("Introduzca un DNI:");
        String dni = sc.nextLine();
        Integer clave = calcularClave(dni);

        if (nombres.containsKey(clave)) {
            System.out.println("Valor de la clave: " + nombres.get(clave));
        } else {
            System.out.println("No existe un DNI asociado en el mapa");
        }
    }
}
