package Examen1920_Manana;

import java.io.*;
import java.util.*;

public class Concurso {
    private String nombre, localidad;
    private Map<String, Set<Perro>> perros;

    public Concurso(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.perros = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Map<String, Set<Perro>> getPerros() {
        return perros;
    }

    public void setPerros(Map<String, Set<Perro>> perros) {
        this.perros = perros;
    }

    public void addDog(String raza, Perro perro) {
        if (perro.getRaza().equals(raza)) {
            if (!perros.containsKey(raza)) {
                perros.put(raza, new TreeSet<>());
            }
            perros.get(raza).add(perro);
        } else {
            System.out.println("La raza no se corresponde con la raza del perro");
        }
    }

    public void disqualifyDog(Perro perro) {
        if (perros.containsKey(perro.getRaza())) {
            Set<Perro> set = this.perros.get(perro.getRaza());
            if (set.contains(perro)) {
                set.remove(perro);
            } else {
                System.out.println("Perro no inscrito");
            }
        } else {
            System.out.println("La raza de ese perro no existe");
        }
    }

    public void ownerDogs(int numSocio) {
        boolean noPerros = true;

        Collection<Set<Perro>> sets = perros.values();

        for (Set<Perro> set : sets) {
            Iterator<Perro> it = set.iterator();
            while (it.hasNext()) {
                Perro p = it.next();
                if (p.getPropietario().getNumSocio() == numSocio) {
                    System.out.println(p);
                    noPerros = false;
                }
            }
        }

        if (noPerros) {
            System.out.println("Este socio no tiene perros inscritos");
        }
    }

    public void perrosPorPeso(String raza) {
        if (perros.containsKey(raza)) {
            for (Perro perro : perros.get(raza)) {
                System.out.println(perro);
            }
        } else {
            System.out.println("No existe esa raza");
        }
    }

    public void perrosPorEdad(String raza) {
        List<Perro> lista = new ArrayList<>(this.perros.get(raza));
        Collections.sort(lista, new Comparator<Perro>() {
            @Override
            public int compare(Perro p1, Perro p2) {
                return p2.getEdad() - p1.getEdad();
            }
        });
        for (Perro perro : lista) {
            System.out.println(perro);
        }
    }

    public void guardarPerros() {
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("perros.dat"));

            Collection<Set<Perro>> collection = perros.values();
            Iterator<Set<Perro>> it = collection.iterator();

            while (it.hasNext()) {
                Set<Perro> set = it.next();
                for (Perro perro : set) {
                    out.writeObject(perro);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void cargarPerros() {
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("perros.dat"));

            while (true) {
                Perro p = (Perro) in.readObject();
                addDog(p.getRaza(), p);
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", perros=" + perros +
                '}';
    }
}
