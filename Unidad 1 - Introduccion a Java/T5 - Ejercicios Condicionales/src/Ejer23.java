import java.util.Scanner;

public class Ejer23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sabor, nata, nombre, tipoTarta = "";
        final double PRECIO_MANZANA = 18;
        final double PRECIO_FRESA = 16;
        final double PRECIO_CHOC_NEGRO = 14;
        final double PRECIO_CHOC_BLANCO = 15;
        final double PRECIO_NOMBRE = 2.75;
        final double PRECIO_NATA = 2.5;
        double precioBase = 0, precioTotal = 0;

        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        sabor = sc.nextLine();
        if (sabor.equals("chocolate")) {
            System.out.print("Qué tipo de chocolate quiere? (negro o blanco): ");
            String tipoChocolate = sc.nextLine();
            if (tipoChocolate.equals("negro")) {
                precioBase += PRECIO_CHOC_NEGRO;
                tipoTarta = "Tarta de chocolate negro";
            } else if (tipoChocolate.equals("blanco")) {
                precioBase += PRECIO_CHOC_BLANCO;
                tipoTarta = "Tarta de chocolate blanco";
            }
        } else if (sabor.equals("manzana")) {
            precioBase += PRECIO_MANZANA;
            tipoTarta = "Tarta de manzana";
        } else if (sabor.equals("fresa")) {
            precioBase += PRECIO_FRESA;
            tipoTarta = "Tarta de fresa";
        }

        System.out.print("Quiere nata? (si o no): ");
        nata = sc.nextLine();
        if (nata.equals("si")) {
            precioTotal += PRECIO_NATA;
        }
        System.out.print("Quiere ponerle un nombre? (si o no): ");
        nombre = sc.nextLine();
        if (nombre.equals("si")) {
            precioTotal += PRECIO_NOMBRE;
        }

        System.out.println(tipoTarta + ": " + precioBase + " €");
        if (nata.equals("si")) {
            System.out.println("Con nata: " + PRECIO_NATA + " €");
        }
        if (nombre.equals("si")) {
            System.out.println("Con nombre: " + PRECIO_NOMBRE + " €");
        }
        precioTotal += precioBase;
        System.out.println("Total: " + precioTotal + " €");
    }
}
