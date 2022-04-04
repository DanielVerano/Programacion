package Tarea7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstacionMeteorologica {
    private List<Medicion> mediciones;
    private Coordenadas coordenadas;

    public EstacionMeteorologica(String fichero, Coordenadas coordenadas) {
        this.mediciones = new ArrayList<>();
        this.coordenadas = coordenadas;
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(fichero));

            while (true) {
                Medicion m = (Medicion) in.readObject();
                mediciones.add(m);
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public List<Medicion> getMediciones() {
        return mediciones;
    }

    public void setMediciones(List<Medicion> mediciones) {
        this.mediciones = mediciones;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public void addMedicion(Medicion medicion) {
        mediciones.add(medicion);
    }

    public void ordenaTemperaturasAsc() {
        Collections.sort(mediciones);
        for (Medicion medicion : mediciones) {
            System.out.println(medicion);
        }
    }

    public void ordenaTemperaturasDesc() {
        Collections.sort(mediciones, Collections.reverseOrder());
        for (Medicion medicion : mediciones) {
            System.out.println(medicion);
        }
    }

    public Medicion presionMaxima() {
        Medicion mayor = null;

        if (mediciones.size() > 0) {
            mayor = mediciones.get(0);
        }

        for (Medicion medicion : mediciones) {
            if (medicion.getPresion() > mayor.getPresion()) {
                mayor = medicion;
            }
        }

        return mayor;
    }

    public boolean buscaMedicion(Medicion medicion) {
        for (Medicion medi : mediciones) {
            if (medi.equals(medicion)) {
                return true;
            }
        }
        return false;
    }

    public void guardarFichero(String fichero) {
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream(fichero));

            for (Medicion medicion : mediciones) {
                out.writeObject(medicion);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "EstacionMeteorologica{" +
                "mediciones=" + mediciones +
                ", coordenadas=" + coordenadas +
                '}';
    }
}
