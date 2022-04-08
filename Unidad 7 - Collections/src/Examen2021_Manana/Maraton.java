package Examen2021_Manana;

import java.util.*;

public class Maraton {
    private Map<Integer, Atleta> atletas;

    public Maraton() {
        atletas = new LinkedHashMap<>();
    }

    public Map<Integer, Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(Map<Integer, Atleta> atletas) {
        this.atletas = atletas;
    }

    public Atleta crearAtleta(Scanner sc) {
        String nombre, pais;
        Categoria categoria;

        System.out.println("Introduzca el nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduzca el país:");
        pais = sc.nextLine();
        System.out.println("Introduzca la categoria (JUNIOR/SENIOR/VETERANO):");
        categoria = Categoria.valueOf(sc.nextLine());

        return new Atleta(nombre, pais, categoria);
    }

    public void inscribirAtleta(Atleta atleta) {
        atletas.put(atleta.getNumDorsal(), atleta);
    }

    public boolean borrarAtleta(Scanner sc) {
        int num;
        System.out.println("Introduce el número del atleta que quiere borrar:");
        num = sc.nextInt();
        sc.nextLine();

        if (atletas.containsKey(num)) {
            atletas.remove(num);
            return true;
        } else {
            System.out.println("El número de dorsal introducido no existe");
        }
        return false;
    }

    public void guardarTiempo(int numDorsal, int marca) {
        if (atletas.containsKey(numDorsal)) {
            atletas.get(numDorsal).setMarca(marca);
            atletas.get(numDorsal).setFinisher(true);
        } else {
            System.out.println("El número de dorsal introducido no existe");
        }
    }

    public void mostrarListaFinishers() {
        Collection<Atleta> collection = this.atletas.values();
        List<Atleta> atletas2 = new ArrayList<>(collection);
        Collections.sort(atletas2, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta at1, Atleta at2) {
                return at1.getMarca() - at2.getMarca();
            }
        });
        for (Atleta atleta : atletas2) {
            if (atleta.isFinisher()) {
                System.out.println(atleta);
            }
        }
    }

    public void mostrarListaCategoria(Categoria categoria) {
        Collection<Atleta> collection = atletas.values();
        List<Atleta> atletas = new ArrayList<>(collection);
        Collections.sort(atletas, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta at1, Atleta at2) {
                return at1.getMarca() - at2.getMarca();
            }
        });
        for (Atleta atleta : atletas) {
            if (atleta.getCategoria() == categoria) {
                System.out.println(atleta);
            }
        }
    }

    public void participantesPorPais(String pais) {
        int inscritos = 0;
        Collection<Atleta> collection = atletas.values();
        for (Atleta atleta : collection) {
            if (atleta.getPais().equals(pais)) {
//                System.out.println(atleta);
                inscritos++;
            }
        }
        System.out.println("En " + pais + " hay " + inscritos + " atletas inscritos");
    }

    @Override
    public String toString() {
        return "Maraton{" +
                "atletas=" + atletas +
                '}';
    }
}
