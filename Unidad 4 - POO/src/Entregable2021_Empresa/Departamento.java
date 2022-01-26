package Entregable2021_Empresa;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
    private String nombre;
    private String sede;
    private String extension;
    private Empleado[] empleados;
    private static int numDepartamentos = 0;

    public Departamento(String nombre, String sede, String extension) {
        this.nombre = nombre;
        this.sede = sede;
        this.extension = extension;
        this.empleados = new Empleado[0];
        Departamento.numDepartamentos++;
    }

    public Departamento(String nombre, String extension) {
        this(nombre, "Castilleja", extension);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public boolean addEmpleado(Empleado empleado) {
        if (!estaEmpleado(empleado)) {
            Empleado[] res = Arrays.copyOf(empleados, empleados.length + 1);
            res[res.length - 1] = empleado;
            empleados = res;
            return true;
        }
        return false;
    }

    public boolean removeEmpleado(Empleado empleado) {
        if (empleados.length > 0 && estaEmpleado(empleado)) {
            Empleado[] res = new Empleado[0];

            for (int i = 0; i < empleados.length; i++) {
                if (!empleados[i].equals(empleado)) {
                    res = Arrays.copyOf(res, res.length + 1);
                    res[res.length - 1] = empleados[i];
                }
            }
            empleados = res;
            return true;
        }
        return false;
    }

    public void mostrarEmpleados() {
        System.out.println(Arrays.toString(empleados));
    }

    public int getNumEmpleados() {
        return empleados.length;
    }

    private boolean estaEmpleado(Empleado empleado) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].equals(empleado)) {
                return true;
            }
        }
        return false;
    }

    public static int getNumDepartamentos() {
        return numDepartamentos;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", sede='" + sede + '\'' +
                ", extension='" + extension + '\'' +
                ", empleados=" + Arrays.toString(empleados) +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(sede, that.sede);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, sede);
    }
}
