import java.util.Scanner;

public class Ejer14 {
    public static void main(String[] args) {
//        Char se pueden sumar (tienen un número ASCII interno)
        Scanner sc = new Scanner(System.in);
        String caracter;
        int direccion;

        System.out.println("Introduzca un caracter:");
        caracter = sc.nextLine().substring(0, 1);

        System.out.println("Introduzca un número del 1 al 4 para la dirección del vértice de la pirámide:");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
        direccion = sc.nextInt();

        switch (direccion) {
            case 1:
                System.out.println("  " + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                break;
            case 2:
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println("  " + caracter);
                break;
            case 3:
                System.out.println("  " + caracter);
                System.out.println(" " + caracter + caracter);
                System.out.println(caracter + caracter + caracter);
                System.out.println(" " + caracter + caracter);
                System.out.println("  " + caracter);
                break;
            case 4:
                System.out.println(caracter);
                System.out.println(caracter + caracter);
                System.out.println(caracter + caracter + caracter);
                System.out.println(caracter + caracter);
                System.out.println(caracter);
                break;
            default:
                System.out.println("Número incorrecto");
        }
    }
}
