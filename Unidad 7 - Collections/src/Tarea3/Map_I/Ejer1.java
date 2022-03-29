package Tarea3.Map_I;

import java.util.HashMap;

public class Ejer1 {
    public static void main(String[] args) {
        HashMap<Integer, String> nombres = new HashMap<>();
        nombres.put(calcularClave("12345678A"), "Pepe");
        nombres.put(calcularClave("11223344B"), "Juan");
        nombres.put(calcularClave("33334444C"), "Ana");
        nombres.put(calcularClave("55667788D"), "Clara");
        System.out.println(nombres);
    }

    public static Integer calcularClave(String dni) {
        Integer result = 0;

        for (int i = 0; i < dni.length() - 1; i++) {
            int n = Integer.parseInt("" + dni.charAt(i));
            result += n;
        }
        return result;
    }
}
