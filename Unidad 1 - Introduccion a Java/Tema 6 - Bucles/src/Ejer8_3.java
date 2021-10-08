import java.util.Random;
import java.util.Scanner;

public class Ejer8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio, numIntroducido = 1;

        numAleatorio = new Random().nextInt(100) + 1; // [x,y) (cero inclusivo, cien excl.)

        while (numIntroducido > 0) {
            System.out.println("Introduce un número del 1 al 100: ");
            numIntroducido = sc.nextInt();

            if (numIntroducido > numAleatorio) {
                System.out.println("Menor");
            } else if (numIntroducido < numAleatorio) {
                System.out.println("Mayor");
            } else {
                System.out.println("Acertaste");
                break;
            }
        }
    }
}
