package entregable19_20;

public class Ej5 {
    public static void main(String[] args) {
        String cadena = "SAMPLE";
        int altura, anchura, numEsp, posPalabra;

        /*if (cadena.length() > 10) {
            cadena = cadena.substring(0, 11);
        }*/
        altura = 11;
        anchura = altura;
        numEsp = 5;
        posPalabra = 0;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < anchura - 2 * numEsp; j++) {
                if (j <= (anchura - 2 * numEsp) / 2) {
                    System.out.print(cadena.charAt(j));
                    posPalabra = j;
                    /*for (int k = 0; k < anchura / 2 + 1; k++) {
                        System.out.print(cadena.charAt(k));
                        posPalabra = k;
                    }*/
                } else {
                    System.out.print(cadena.charAt(posPalabra-1));
                    posPalabra--;
                    /*for (int k = 0; k < anchura / 2; k++) {
                        System.out.print(cadena.charAt(posPalabra-1));
                        posPalabra++;
                    }*/
                }
            }
            System.out.println();

            if (i < altura / 2) {
                numEsp--;
            } else {
                numEsp++;
            }
        }
    }
}
