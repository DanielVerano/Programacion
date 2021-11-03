public class Ej3 {
    public static void main(String[] args) {
        String palo, carta;
        int numPalo = (int) (Math.random() * 4);
        int numCarta = (int) (Math.random() * 13) + 1;

        switch (numPalo) {
            case 0:
                palo = "Palo - Picas";
                break;
            case 1:
                palo = "Palo - Corazones";
                break;
            case 2:
                palo = "Palo - Diamantes";
                break;
            case 3:
                palo = "Palo - Tréboles";
                break;
            default:
                palo = "";
                break;
        }

        if (numCarta == 1) {
            carta = "Carta: A";
        } else if (numCarta == 11) {
            carta = "Carta: J";
        } else if (numCarta == 12) {
            carta = "Carta: Q";
        } else if (numCarta == 13) {
            carta = "Carta: K";
        } else {
            carta = "Carta: " + numCarta;
        }

        System.out.println(palo);
        System.out.println(carta);
    }
}
