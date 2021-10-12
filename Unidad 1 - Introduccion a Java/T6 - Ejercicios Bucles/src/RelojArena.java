import java.util.Scanner;

public class RelojArena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numEspacios;

        do {
            System.out.println("Introduce la altura:");
            altura = sc.nextInt();

            if (altura < 3 || altura % 2 == 0) {
                System.out.println("La altura debe ser un número impar mayor o igual que 3");
            }
        }
        while (altura < 3 || altura % 2 == 0);

        numEspacios = 0;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEspacios; j++) {
                System.out.print(" ");
            }

//            numEspacios se multiplica por 2 para restarlo a la anchura (altura = anchura)
//            para quitar los espacios de la parte derecha del reloj
            for (int j = 0; j < altura - 2 * numEspacios; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < altura / 2) {
                numEspacios++;
            } else {
                numEspacios--;
            }
        }
    }
}
