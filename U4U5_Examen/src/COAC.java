import java.util.Arrays;
import java.util.Comparator;

public class COAC {
    private AgrupacionOficial[] agrupaciones;

    public COAC() {
        this.agrupaciones = new AgrupacionOficial[0];
    }

    public AgrupacionOficial[] getAgrupaciones() {
        return agrupaciones;
    }

    public void setAgrupaciones(AgrupacionOficial[] agrupaciones) {
        this.agrupaciones = agrupaciones;
    }

    public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
        this.agrupaciones = Arrays.copyOf(agrupaciones, agrupaciones.length + 1);
        this.agrupaciones[agrupaciones.length - 1] = agrupacion;
    }

    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
        if (estaAgrupacion(agrupacion)) {
            AgrupacionOficial[] result = new AgrupacionOficial[0];

            for (int i = 0; i < agrupaciones.length; i++) {
                if (!agrupaciones[i].equals(agrupacion)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = agrupaciones[i];
                }
            }
            agrupaciones = result;
            return true;
        }
        return false;
    }

    private boolean estaAgrupacion(AgrupacionOficial agrupacion) {
        for (int i = 0; i < agrupaciones.length; i++) {
            if (agrupaciones[i].equals(agrupacion)) {
                return true;
            }
        }
        return false;
    }

    public void ordenar_por_puntos() {
        Arrays.sort(agrupaciones, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial agrupacion1, AgrupacionOficial agrupacion2) {
                return agrupacion1.getPuntos() - agrupacion2.getPuntos();
            }
        });
        for (AgrupacionOficial agrupacion : agrupaciones) {
            System.out.println(agrupacion);
        }
    }

    public void ordenar_por_nombre() {
        Arrays.sort(agrupaciones);
        for (AgrupacionOficial agrupacion : agrupaciones) {
            System.out.println(agrupacion);
        }
    }

    public void ordenar_por_autor() {
        Arrays.sort(agrupaciones, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial agrupacion1, AgrupacionOficial agrupacion2) {
                return agrupacion1.getAutor().compareTo(agrupacion2.getAutor());
            }
        });
        for (AgrupacionOficial agrupacion : agrupaciones) {
            System.out.println(agrupacion);
        }
    }

    @Override
    public String toString() {
        return "COAC{" +
                "agrupaciones=" + Arrays.toString(agrupaciones) +
                '}';
    }
}
