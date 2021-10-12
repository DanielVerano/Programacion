import java.util.Scanner;

public class RomboHueco1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura, mitad, pos1, pos2;

        do {
            System.out.println("Introduce la altura del rombo (número impar):");
            altura = sc.nextInt();
        }
        while (altura % 2 == 0);

        mitad = (altura / 2) + 1;
        anchura = mitad;
        pos1 = mitad - 2;   // (mitad - 1) - 1  Pos 1, 3 al inicio contando desde 0 (altura 5 y mitad 3)
        pos2 = mitad;       // (mitad - 1) + 1

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if ((i == 0 || i == altura - 1) && j == mitad - 1) {
                    System.out.print("*");
                } else if ((j == pos1 || j == pos2) && i != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i == 0) {
                anchura++;
                continue;
            }
            if (i < mitad - 1) {
                pos1--;
                pos2++;
                anchura++;
            } else {
                pos1++;
                pos2--;
                anchura--;
            }
        }
    }
}
