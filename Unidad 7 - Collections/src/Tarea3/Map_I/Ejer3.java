package Tarea3.Map_I;

import java.util.HashMap;
import java.util.Map;

import static Tarea3.Map_I.Ejer1.calcularClave;

public class Ejer3 {
    public static void main(String[] args) {
        //        Iterar sobre un mapa: iter
        HashMap<Integer, String> nombres = new HashMap<>();
        nombres.put(calcularClave("12345678A"), "Pepe");
        nombres.put(calcularClave("11223344B"), "Juan");
        nombres.put(calcularClave("33334444C"), "Ana");
        nombres.put(calcularClave("55667788D"), "Clara");

//        3 formas de iterar sobre un mapa:
//        1. Iterar sobre las claves (keySet())
        for (Integer clave : nombres.keySet()) {
            System.out.println("Clave: " + clave);
        }

//        2. Iterar sobre los valores (values())
        for (String value : nombres.values()) {
            System.out.println("Valor: " + value);
        }

//        3. Iterar sobre las entradas del mapa (entrySet())
        for (Map.Entry<Integer, String> entry : nombres.entrySet()) {
            System.out.println("La clave " + entry.getKey() + " está asociada al nombre " + entry.getValue());
        }
    }
}
