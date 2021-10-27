package tarea1_funciones;

public class Ejer12 {
    public static void main(String[] args) {
        System.out.println(factorialRecursiva(5));
        System.out.println(factorialIterativo(5));
    }

    public static int factorialIterativo(int n) {
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int factorialRecursiva(int n) {
        int resultado;

        /*
        * 1. 5⁵
        * 2. 5 * 5⁴
        * 3. 5 * 4 * 5³
        * 4. 5 * 4 * 3 * 5²
        * 5. 5 * 4 * 3 * 2 * 5¹
        * 6. 5 * 4 * 3 * 2 * 1 * 5⁰
        * */
        if (n > 0) {
            resultado = n * (factorialRecursiva(n - 1));
        } else {
            resultado = 1;
        }
        return resultado;
    }
}
