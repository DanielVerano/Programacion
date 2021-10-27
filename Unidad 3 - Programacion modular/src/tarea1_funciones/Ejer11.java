package tarea1_funciones;

public class Ejer11 {
    public static void main(String[] args) {
        System.out.println(elevadoAIterativo(2,10));
        System.out.println(elevadoARecursivo(2, 10));
    }

    public static double elevadoAIterativo(double a, int n) {
        double resultado = 1;
        for (int i = 0; i < n; i++) {
            resultado *= a;
        }
        return resultado;
    }

    public static double elevadoARecursivo(double a, int n) {
        double resultado;

        /*
        * 1. 2⁵
        * 2. 2 * 2⁴
        * 3. 2 * 2 * 2³
        * 4. 2 * 2 * 2 * 2²
        * 5. 2 * 2 * 2 * 2 * 2¹
        * 6. 2 * 2 * 2 * 2 * 2 * 2⁰
        * */
        if (n > 0) {
            resultado = a * elevadoARecursivo(a,n - 1);
        } else {
            resultado = 1;
        }
        return resultado;
    }
}
