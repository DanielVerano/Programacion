import java.util.Scanner;

public class RomboNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numEsp, cont;

        do {
            System.out.println("Introduce la altura:");
            altura = sc.nextInt();

            if (altura < 3 || altura % 2 == 0) {
                System.out.println("La altura debe ser un número impar y mayor o igual que 3");
            }
        }
        while (altura < 3 || altura % 2 == 0);

        numEsp = altura - 1;

//        Altura 7: Imprimir 2 pirámides de altura 7 superior e inferior (se resta 1 porque comparten la base)
        for (int i = 0; i < 2 * altura - 1; i++) {

            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

//            Calcular primer número de la cadena a imprimir (primera y segunda mitad de las filas)
            if (i < altura - 1) {
                cont = i + 1;
            } else {
                cont = altura * 2 - i - 1;
            }

//            Imprimir cadena
            for (int j = 0; j < 2 * altura - 1 - 2 * numEsp; j++) {
                System.out.print(cont);
                if (j < (2 * altura - 1 - 2 * numEsp) / 2) {
                    cont--;
                } else {
                    cont++;
                }
            }
            System.out.println();

            if (i < altura - 1) {
                numEsp--;
            } else {
                numEsp++;
            }
        }
    }
}
