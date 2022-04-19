package Examen2021_Manana;

import java.util.*;

public class Maraton2 {
    private Map<Categoria, Set<Atleta>> atletas;

    public Maraton2() {
        this.atletas = new HashMap<>();
    }

    public Map<Categoria, Set<Atleta>> getAtletas() {
        return atletas;
    }

    public void setAtletas(Map<Categoria, Set<Atleta>> atletas) {
        this.atletas = atletas;
    }

    public Atleta pedirAtleta() {
        Scanner sc = new Scanner(System.in);
        String nombre, pais;
        Categoria cat;

        System.out.println("Introduce el nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduce el país:");
        pais = sc.nextLine();
        System.out.println("Introduce la categoría:");
        cat = Categoria.valueOf(sc.nextLine());

        return new Atleta(nombre, pais, cat);
    }

    public void inscribirAtleta(Atleta atleta) {
        if (!atletas.containsKey(atleta.getCategoria())) {
            atletas.put(atleta.getCategoria(), new HashSet<>());
            atletas.get(atleta.getCategoria()).add(atleta);
        }  else {
            atletas.get(atleta.getCategoria()).add(atleta);
        }
    }

    public boolean borrarAtleta(Atleta atleta) {
        boolean result;

        if (atletas.containsKey(atleta.getCategoria())) {
            result = atletas.get(atleta.getCategoria()).remove(atleta);
        } else {
            System.out.println("No existe la categoría");
            result = false;
        }
        return result;
    }

    public void guardarTiempo(int numDorsal, int marca) {
        boolean found = false;

        Collection<Set<Atleta>> collection = atletas.values();
        Iterator<Set<Atleta>> it = collection.iterator();

        while (it.hasNext() && !found) {
            Set<Atleta> set = it.next();

            for (Atleta atleta : set) {
                if (atleta.getNumDorsal() == numDorsal) {
                    atleta.setMarca(marca);
                    atleta.setFinisher(true);
                    found = true;
                }
            }
        }
    }

    public void mostrarListaFinishers() {
        Set<Atleta> ats = new TreeSet<>(new Comparator<Atleta>() {
            @Override
            public int compare(Atleta at1, Atleta at2) {
                return at2.getMarca() - at1.getMarca();
            }
        });
        Collection<Set<Atleta>> col = atletas.values();
        Iterator<Set<Atleta>> it = col.iterator();

        while (it.hasNext()) {
            Set<Atleta> s = it.next();
            for (Atleta atleta : s) {
                if (atleta.isFinisher()) {
                    ats.add(atleta);
                }
            }
        }

        for (Atleta at : ats) {
            System.out.println(at);
        }
    }

    public void mostrarListaCategoria(Categoria categoria) {
        List<Atleta> ats = new ArrayList<>(atletas.get(categoria));
        Collections.sort(ats, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta at1, Atleta at2) {
                return at2.getMarca() - at1.getMarca();
            }
        });
        for (Atleta at : ats) {
            System.out.println(at);
        }
    }

    @Override
    public String toString() {
        return "Maraton2{" +
                "atletas=" + atletas +
                '}';
    }
}
