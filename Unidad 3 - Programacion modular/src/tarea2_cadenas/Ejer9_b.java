package tarea2_cadenas;

public class Ejer9_b {
    public static void main(String[] args) {
//        a)
        StringBuffer sb = new StringBuffer("Alabí Alixar");
        System.out.println(sb);

//        b)
        System.out.println("Capacidad inicial: " + sb.capacity());
        System.out.println("Longitud inicial: " + sb.length());

//        c)
        sb.replace(0,sb.length(),"Chicharrones de Chiclana");
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
        String cadena = sb.substring(sb.length()-4);
        System.out.println(cadena);

//        g)
        System.out.println("Capacidad final: " + sb.capacity());
        System.out.println("Longitud final: " + sb.length());
    }
}
