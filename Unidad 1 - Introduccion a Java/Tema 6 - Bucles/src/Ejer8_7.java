public class Ejer8_7 {
    public static void main(String[] args) {
        int numNumerosImpares = 10;
        int producto = 1;

        for (int i = 1; i <= (numNumerosImpares * 2); i++) {
            if (i % 2 != 0) {
                producto *= i;
            }
        }
        System.out.println("Producto de los primeros " + numNumerosImpares + " números impares: " + producto);
    }
}
