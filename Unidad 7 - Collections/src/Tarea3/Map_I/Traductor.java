package Tarea3.Map_I;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Traductor {
    private HashMap<String, String> diccionario;

    public Traductor(String fichero) {
        this.diccionario = new HashMap<>();
        cargarFichero(fichero);
    }

    public HashMap<String, String> getDiccionario() {
        return diccionario;
    }

    public void cargarFichero(String fichero) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(fichero));
            String linea = in.readLine();
            String[] partes;

            while (linea != null) {
                partes = linea.split(",");
                diccionario.put(partes[0], partes[1].trim());
                linea = in.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String traducir(String clave) {
        return diccionario.get(clave);
    }

    @Override
    public String toString() {
        return "Traductor{" +
                "diccionario=" + diccionario +
                '}';
    }
}
