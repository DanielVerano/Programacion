import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio_entrada = 8, descuento = 0, precio_total;
        int num_entradas;
        String dia, tarjeta;

        System.out.println("Venta de entradas CineCampa");
        System.out.print("Número de entradas: ");
        num_entradas = sc.nextInt();
        sc.nextLine();
        System.out.print("Día de la semana: ");
        dia = sc.nextLine();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        tarjeta = sc.nextLine();

        if (dia.equals("miercoles")) {
            precio_entrada = 5;
        } else if (dia.equals("jueves")) {
            precio_entrada = 11;
        }

        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        if (dia.equals("jueves")) {
            System.out.println("Entradas de pareja     " + num_entradas / 2);
            if (num_entradas/2 % 2 == 0) {
                System.out.println("Precio por entrada de pareja    " + precio_entrada);
                precio_total = (num_entradas/2)*precio_entrada+8;
                System.out.println("Total   " + (num_entradas/2)*precio_entrada+8);
            } else {
                System.out.println("Precio por entrada de pareja    " + precio_entrada);
                precio_total = (num_entradas/2)*precio_entrada;
                System.out.println("Total   " + (num_entradas/2)*precio_entrada);
            }
        } else {
            System.out.println("Entradas individuales     " + num_entradas);
            System.out.println("Precio por entrada individual       " + precio_entrada);
            precio_total = num_entradas*precio_entrada;
            System.out.println("Total   " + num_entradas*precio_entrada);
        }

        if (tarjeta.equals("s")) {
            descuento = 0.1;
            System.out.println("Descuento     " + precio_total*descuento);
        } else {
            System.out.println("Descuento     " + descuento);
        }

        System.out.println("A pagar     " + (precio_total*(1-descuento)));
    }
}
