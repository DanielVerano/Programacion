package Empresa_ATRIOS;

import java.util.Arrays;

public class Juego {
    private int year;
    private String sede;
    private Pais[] paises;
    private Deporte[] deportes;

    public Juego(int year, String sede) {
        if (year % 4 != 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.sede = sede;
        this.paises = new Pais[0];
        this.deportes = new Deporte[0];
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPaises() {
        return paises;
    }

    public void setPaises(Pais[] paises) {
        this.paises = paises;
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }

    public boolean addPais(Pais pais) {
        if (!existePais(pais)) {
            Pais[] result = Arrays.copyOf(paises, paises.length + 1);
            result[result.length - 1] = pais;
            paises = result;
            return true;
        }
        return false;
    }

    public boolean removePais(Pais pais) {
        if (existePais(pais)) {
            Pais[] result = new Pais[0];

            for (Pais p : paises) {
                if (!p.equals(pais)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = p;
                }
            }
            paises = result;
            return true;
        }
        return false;
    }

    private boolean existePais(Pais pais) {
        for (Pais p : paises) {
            if (p.equals(pais)) {
                return true;
            }
        }
        return false;
    }

    private boolean existeDeporte(Deporte deporte) {
        for (Deporte d : deportes) {
            if (d.equals(deporte)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "year=" + year +
                ", sede='" + sede + '\'' +
                ", paises=" + Arrays.toString(paises) +
                ", deportes=" + Arrays.toString(deportes) +
                '}';
    }
}
