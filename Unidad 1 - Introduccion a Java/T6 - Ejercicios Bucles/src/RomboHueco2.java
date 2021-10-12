import java.util.Scanner;

public class RomboHueco2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numEspacios;

        System.out.println("Introduce la altura (alto y ancho valen lo mismo):");
        altura = sc.nextInt();
        numEspacios = (altura - 1) / 2;

        for (int i = 0; i < altura; i++) {

//            Número de espacios hasta el primer asterisco
            for (int j = 0; j < numEspacios; j++) {
                System.out.print(" ");
            }

//            (Altura - 2 * numEspacios) = Caracteres a recorrer desde el 1er asterisco
            for (int j = 0; j < altura - 2 * numEspacios; j++) {
//                Comprobar si estoy en el 1er o último asterisco
                if (j == 0 || j == altura - 2 * numEspacios - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            if (i < altura/2) {
//                Primera mitad
                numEspacios--;
            } else {
//                Segunda mitad
                numEspacios++;
            }
        }
    }
}
