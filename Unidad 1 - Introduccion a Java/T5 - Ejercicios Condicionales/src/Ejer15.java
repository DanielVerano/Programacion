import java.util.Scanner;

public class Ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PUNTOS_POR_VERDADERA = 3;
        int contadorVerdadero = 0, respuesta, puntuacion;

        System.out.println("Responde a las siguientes preguntas con 1 si es verdadero o 0 si es falso");
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            contadorVerdadero++;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            contadorVerdadero++;
        }
        System.out.println("3. Ha perdido el interés que anteriormente mostraba por ti");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            contadorVerdadero++;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            contadorVerdadero++;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            contadorVerdadero++;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            contadorVerdadero++;
        }
        System.out.println("7. Últimamente se preocupa más por cuidar la línea y/o estar bronceado/a");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            contadorVerdadero++;
        }
        System.out.println("8. Muchos días viene después de trabajar porque dice tener más trabajo");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            contadorVerdadero++;
        }
        System.out.println("9. Has notado que últimamente se perfuma más");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            contadorVerdadero++;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            contadorVerdadero++;
        }

        puntuacion = contadorVerdadero * PUNTOS_POR_VERDADERA;

        System.out.println("Puntuación final: " + puntuacion);

        if (puntuacion <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (puntuacion <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
