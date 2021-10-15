import java.util.Scanner;

public class LetraX_Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;

        do {
            System.out.println("Introduce la altura:");
            altura = sc.nextInt();
            if (altura < 3 || altura % 2 == 0) {
                System.out.println("La altura debe ser un número impar y mayor o igual que 3");
            }
        }
        while (altura < 3 || altura % 2 == 0);

        anchura = altura;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
//                Imprimir X si i = j || i + j = altura - 1
                if (i == j || i + j == anchura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
