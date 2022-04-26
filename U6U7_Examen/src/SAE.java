import java.io.*;
import java.util.*;

public class SAE {
    private Map<Integer, Oferta> ofertas;

    public SAE() {
        ofertas = new TreeMap<>();
    }

    public Map<Integer, Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(Map<Integer, Oferta> ofertas) {
        this.ofertas = ofertas;
    }

    public boolean addOferta(Oferta o) {
        if (!ofertas.containsKey(o.getCodigo())) {
            ofertas.put(o.getCodigo(), o);
            return true;
        }
        return false;
    }

    public boolean addTrabajador(Integer codigo, Trabajador t) {
//        Compruebo si existe la oferta en el mapa
        if (ofertas.containsKey(codigo)) {
//            Compruebo si no existe el trabajador en el set de trabajadores de la oferta
            if (!ofertas.get(codigo).getTrabajadores().contains(t)) {
                ofertas.get(codigo).getTrabajadores().add(t);
                return true;
            }
        }
        return false;
    }

    public boolean removeTrabajador(Integer codigo, Trabajador t) {
        if (ofertas.containsKey(codigo)) {
            return ofertas.get(codigo).getTrabajadores().remove(t);
        }
        return false;
    }

    public void mostrarTrabajadores(Integer codigo) {
        int numTrabajadores = 0;
        if (ofertas.containsKey(codigo)) {
            Set<Trabajador> set = ofertas.get(codigo).getTrabajadores();

            for (Trabajador trabajador : set) {
                System.out.println(trabajador);
                numTrabajadores++;
            }

            if (numTrabajadores == 0) {
                System.out.println("No existen trabajadores inscritos en esa oferta");
            }
        } else {
            System.out.println("No existe esa oferta en el mapa");
        }
    }

    public void mostrarTrabajadoresXEdad(Integer codigo) {
        if (ofertas.containsKey(codigo)) {
            if (ofertas.get(codigo).getTrabajadores().size() > 0) {
                List<Trabajador> lista = new ArrayList<>(ofertas.get(codigo).getTrabajadores());
                Collections.sort(lista, new Comparator<Trabajador>() {
                    @Override
                    public int compare(Trabajador trabajador, Trabajador t1) {
                        int result = trabajador.getEdad() - t1.getEdad();

                        if (result == 0) {
                            result = trabajador.getNombre().compareTo(t1.getNombre());
                        }
                        return result;
                    }
                });
                for (Trabajador trabajador : lista) {
                    System.out.println(trabajador);
                }
            } else {
                System.out.println("No existen trabajadores inscritos en esa oferta");
            }
        } else {
            System.out.println("No existe esa oferta en el mapa");
        }
    }

    public int cantidadOfertas(String dni) {
        int cantidad = 0;

        Collection<Oferta> col = ofertas.values();
        Iterator<Oferta> it = col.iterator();

        while (it.hasNext()) {
            Oferta oferta = it.next();

            for (Trabajador trabajador : oferta.getTrabajadores()) {
                if (trabajador.getDni().equals(dni)) {
                    cantidad++;
                }
            }
        }
        return cantidad;
    }

    public void mostrarOfertas() {
        List<Oferta> lista = new ArrayList<>(ofertas.values());
        Collections.sort(lista, new Comparator<Oferta>() {
            @Override
            public int compare(Oferta oferta, Oferta t1) {
                return t1.getTrabajadores().size() - oferta.getTrabajadores().size();
            }
        });
        for (Oferta oferta : lista) {
            System.out.println("Código: " + oferta.getCodigo() + " " +
                    "Descripción: " + oferta.getDescripcion() + " " +
                    "Está cubierta: " + oferta.isCubierta());
        }
    }

    public void guardarDatos() {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("sae.dat"));
            Collection<Oferta> col = ofertas.values();
            Iterator<Oferta> it = col.iterator();

            while (it.hasNext()) {
                Oferta oferta = it.next();
                oos.writeObject(oferta);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo sae.dat");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void cargarDatos() {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("sae.dat"));

            while (true) {
                Oferta oferta = (Oferta) ois.readObject();
                addOferta(oferta);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo sae.dat");
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "SAE{" +
                "ofertas=" + ofertas +
                '}';
    }
}
