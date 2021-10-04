import java.util.Scanner;

public class Ejer25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PRECIO_PALMERA = 1.4;
        final double PRECIO_DONUT = 1;
        final double PRECIO_PITUFO_ACEITE = 1.2;
        final double PRECIO_PITUFO_TORTILLA = 1.6;
        final double PRECIO_ZUMO = 1.5;
        final double PRECIO_CAFE = 1.20;
        String comida, bebida;
        double precioComida = 0, precioBebida = 0;

        System.out.print("Qué ha tomado de comer? (palmera, donut o pitufo): ");
        comida = sc.nextLine();
        if (comida.equals("pitufo")) {
            System.out.print("Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            comida = sc.nextLine();

            if (comida.equals("aceite")) {
                precioComida += PRECIO_PITUFO_ACEITE;
                comida = "Pitufo con aceite";
            } else if (comida.equals("tortilla")) {
                precioComida += PRECIO_PITUFO_TORTILLA;
                comida = "Pitufo con tortilla";
            }
        } else if (comida.equals("palmera")) {
            precioComida += PRECIO_PALMERA;
            comida = "Palmera";
        } else if (comida.equals("donut")) {
            precioComida += PRECIO_DONUT;
            comida = "Donut";
        }

        System.out.print("Qué ha tomado de beber? (zumo o café): ");
        bebida = sc.nextLine();
        if (bebida.equals("zumo")) {
            precioBebida += PRECIO_ZUMO;
            bebida = "Zumo";
        } else if (bebida.equals("cafe")) {
            precioBebida += PRECIO_CAFE;
            bebida = "Café";
        }

        System.out.println(comida + ": " + precioComida + " €");
        System.out.println(bebida + ": " + precioBebida + " €");
        System.out.println("Total desayuno: " + (precioComida + precioBebida) + " €");
    }
}
