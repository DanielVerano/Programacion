import java.util.Scanner;

public class Ejer22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PRECIO_CM2 = 0.01;
        final double PRECIO_BORDADO = 2.5;
        final double GASTOS_ENVIO = 3.25;
        int cm, anchura;
        double precio;
        String bordado;

        System.out.print("Introduzca la altura de la bandera en cm: ");
        cm = sc.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        anchura = sc.nextInt();
        System.out.print("Quiere escudo bordado? (s/n): ");
        sc.nextLine();
        bordado = sc.nextLine().substring(0, 1);

        precio = PRECIO_CM2 * (cm * anchura);

        System.out.println("Gracias. Aquí tiene el desglose de la compra.");
        System.out.println("Bandera de " + (cm * anchura) + " cm2: " + precio + "€");

        if (bordado.equals("s")) {
            System.out.println("Con escudo: 2,50 €");
            precio = precio + PRECIO_BORDADO;
        } else if (bordado.equals("n")) {
            System.out.println("Sin escudo: 0,00 €");
        }
        System.out.println("Gastos de envío: 3,25 €");
        precio = precio + GASTOS_ENVIO;
        System.out.println("Total: " + precio);
    }
}
