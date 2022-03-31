package Tarea5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class IntroducirAspirantes {

    private static int numAspirantes = 1;
    private HashMap<Integer, Aspirante> aspirantes;

    public IntroducirAspirantes() {
        this.aspirantes = new HashMap<>();
    }

    public static int getNumAspirantes() {
        return numAspirantes;
    }

    public HashMap<Integer, Aspirante> getAspirantes() {
        return aspirantes;
    }

    public void insertaAspirante() {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        String nombre, dni, telefono, resp;

        do {
            System.out.println("Introduzca el nombre:");
            nombre = sc.nextLine();
            System.out.println("Introduzca el DNI:");
            dni = sc.nextLine();
            System.out.println("Introduzca el telefono:");
            telefono = sc.nextLine();
            aspirantes.put(numAspirantes, new Aspirante(nombre, dni, telefono));
            numAspirantes++;

            System.out.println("¿Desea seguir introduciendo aspirantes?");
            resp = sc.nextLine();

            if (resp.equalsIgnoreCase("no")) {
                seguir = false;
            }
        } while (seguir);
    }

    public void guardarFicheros() {
//        Out1: Guarda la relación entre el ID del aspirante con la información del aspirante
//        (Las entradas del mapa)
//        Out2: Guarda una lista con los IDs de los aspirantes
        ObjectOutputStream out1 = null;
        ObjectOutputStream out2 = null;
        List<Integer> ids = new LinkedList<>(aspirantes.keySet());

        try {
            out1 = new ObjectOutputStream(new FileOutputStream("aspirantes.dat"));
            out2 = new ObjectOutputStream(new FileOutputStream("ids_aspirantes.dat"));

            out1.writeObject(aspirantes);
            out2.writeObject(ids);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out1.close();
                out2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "IntroducirAspirantes{" +
                "aspirantes=" + aspirantes +
                '}';
    }
}
