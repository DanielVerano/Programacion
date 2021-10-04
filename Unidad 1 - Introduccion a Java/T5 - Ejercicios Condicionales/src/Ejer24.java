import java.util.Scanner;

public class Ejer24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario1, usuario2;

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        usuario1 = sc.nextLine();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        usuario2 = sc.nextLine();

        if ((usuario1.equals("piedra") || usuario1.equals("papel") || usuario1.equals("tijera")) &&
                (usuario2.equals("piedra") || usuario2.equals("papel") || usuario2.equals("tijera"))) {
            if (usuario1.equals(usuario2)) {
                System.out.println("Empate");
            } else if ((usuario1.equals("piedra") && usuario2.equals("tijera")) ||
                    (usuario1.equals("tijera") && usuario2.equals("papel")) ||
                    (usuario1.equals("papel") && (usuario2.equals("piedra")))) {
                System.out.println("Gana el jugador 1");
            } else {
                System.out.println("Gana el jugador 2");
            }
        } else {
            System.out.println("Datos incorrectos");
        }
    }
}
