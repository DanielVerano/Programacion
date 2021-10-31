package tarea2_cadenas;

public class Ejer9 {
    public static void main(String[] args) {
//        a)
        StringBuilder sb = new StringBuilder("Alabí Alixar");
        System.out.println("El StringBuilder es " + sb);

//        b)
        System.out.println("Capacidad inicial: " + sb.capacity());
        System.out.println("Longitud inicial: " + sb.length());

//        c)
        sb.delete(0, sb.length());
        sb.replace(0, sb.length(), "Chicharrones de Chiclana");
        System.out.println(sb);

//        d)
        int n = 5000;
        sb.delete(12, sb.length());
        sb.insert(0, "Hay " + n + " ");
        System.out.println(sb);

//        e)
        sb.append(" en Chiclana");
        System.out.println(sb);

//        f)
        String s = sb.substring(sb.length() - 4, sb.length());
        System.out.println(s);

//        g)
        System.out.println("Capacidad final: " + sb.capacity());
        System.out.println("Longitud final: " + sb.length());
    }
}
