import java.util.Scanner;

public class Ejer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baseImponible;
        double iva, promo, precioIVA, precioTotal;
        String ivaString, promocion;

        System.out.print("Introduzca la base imponible: ");
        baseImponible = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca el tipo de iva: ");
        ivaString = sc.nextLine();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        promocion = sc.nextLine();

        switch (ivaString) {
            case "general":
                iva = 0.21;
                break;
            case "reducido":
                iva = 0.1;
                break;
            case "superreducido":
                iva = 0.04;
                break;
            default:
                iva = 0;
                break;
        }

        switch (promocion) {
            case "nopro":
                promo = 0;
                break;
            case "mitad":
                promo = 0.5;
                break;
            case "meno5":
                promo = -5;
                break;
            case "5porc":
                promo = 0.05;
                break;
            default:
                promo = 0;
                break;
        }

        System.out.println("Base imponible: " + baseImponible);
        System.out.println("IVA: " + (iva * 100) + "%");
        precioIVA = baseImponible + (baseImponible * iva);
        System.out.println("Precio con IVA: " + precioIVA);
        System.out.println("Cód. promo. (" + promocion + "): " + promo);
        
        if (promocion.equals("meno5")) {
            precioTotal = precioIVA + promo;
        } else if (promocion.equals("mitad") || promocion.equals("5porc")) {
            precioTotal = precioIVA * promo;
        } else {
            precioTotal = precioIVA;
        }
        System.out.println("TOTAL: " + precioTotal);
    }
}
