import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura, cm2;
        double total;
        final double PRECIO_CM2 = 0.01;
        final double PRECIO_BORDADO = 2.5;
        final double GASTOS_ENVIO = 3.25;
        String bordado;

        System.out.print("Introduzca la altura de la bandera en cm: ");
        altura = sc.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        anchura = sc.nextInt();
        sc.nextLine();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        bordado = sc.nextLine();

        cm2 = altura * anchura;
        total = cm2 * PRECIO_CM2;

        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.println("Bandera de " + cm2 + " cm2: " + total + " €");

        if (bordado.equals("s")) {
            System.out.println("Con escudo: " + PRECIO_BORDADO + " €");
            total += PRECIO_BORDADO;
        } else {
            System.out.println("Sin escudo: 0,00 €");
        }

        System.out.println("Gastos de envío: " + GASTOS_ENVIO + " €");
        total += GASTOS_ENVIO;
        System.out.println("Total: " + total + " €");

    }
}
