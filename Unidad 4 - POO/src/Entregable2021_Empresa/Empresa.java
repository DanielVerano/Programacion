package Entregable2021_Empresa;

import java.util.Arrays;
import java.util.Objects;

public class Empresa {
    private String nombre;
    private Departamento[] departamentos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new Departamento[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public int getNumDepartamentos() {
        return departamentos.length;
    }

    public boolean addDepartamento(Departamento dept) {
        if (!estaDepartamento(dept)) {
            Departamento[] res = Arrays.copyOf(departamentos, departamentos.length + 1);
            res[res.length - 1] = dept;
            departamentos = res;
            return true;
        }
        return false;
    }

    private boolean estaDepartamento(Departamento departamento) {
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i].equals(departamento)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", departamentos=" + Arrays.toString(departamentos) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nombre, empresa.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
