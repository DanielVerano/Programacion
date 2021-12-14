package Entregable1920;

public class Ejer2 {
    public static void main(String[] args) {
        int[][] a = new int[4][5];
        int suma, sumaTotal;

        sumaTotal = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 101);
            }
        }

//        Suma de las filas

        for (int i = 0; i < a.length; i++) {
            suma = 0;
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
                suma += a[i][j];
            }
            System.out.println(suma);
            sumaTotal += suma;
        }

//        Suma de las columnas

        for (int j = 0; j < a[0].length; j++) {
            suma = 0;
            for (int i = 0; i < a.length; i++) {
                suma += a[i][j];
            }
            System.out.print(suma + " ");
            sumaTotal += suma;
        }
        System.out.println(sumaTotal);
    }
}
