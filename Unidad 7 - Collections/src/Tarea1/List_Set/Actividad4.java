package Tarea1.List_Set;

import java.util.*;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        ArrayList<String> palabras = new ArrayList<>();
        ArrayList<String> repetidos = new ArrayList<>();
        ArrayList<String> noRepetidos = new ArrayList<>();

        String[] partes = frase.split(" ");
//        Pasar array a lista
        List<String> lista = Arrays.asList(partes);
        palabras.addAll(lista);

        Iterator it = palabras.iterator();

//        Mostrar repetidos (indexOf(e) != lastIndexOf(e))
        while (it.hasNext()) {
            String element = (String) it.next();

            if (palabras.indexOf(element) != palabras.lastIndexOf(element) &&
                !repetidos.contains(element)) {
                repetidos.add(element);
            }
        }

//        Mostrar no repetidos (indexOf(e) == lastIndexOf(e))
        for (String palabra : palabras) {
            if (palabras.indexOf(palabra) == palabras.lastIndexOf(palabra)) {
                noRepetidos.add(palabra);
            }
        }

        System.out.println("Repetidos: " + repetidos);
        System.out.println("No repetidos: " + noRepetidos);
    }
}
