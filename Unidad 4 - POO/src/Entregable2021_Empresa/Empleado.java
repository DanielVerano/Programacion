package Entregable2021_Empresa;

import java.util.Calendar;
import java.util.Objects;

public class Empleado {
    private String nombreCompleto;
    private String numSegSocial;
    private String telefono;
    private Calendar fechaIngreso;
    private TipoEmpleado tipo;
    private static int numEmpleados;

    public Empleado(String nombreCompleto, String numSegSocial, String telefono, TipoEmpleado tipo) {
        this.nombreCompleto = nombreCompleto;
        this.numSegSocial = numSegSocial;
        this.telefono = telefono;
        this.fechaIngreso = Calendar.getInstance();
        this.tipo = tipo;
    }

    public Empleado(String nombreCompleto, String numSegSocial, String telefono) {
        this(nombreCompleto, numSegSocial, telefono, TipoEmpleado.TECNICO);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumSegSocial() {
        return numSegSocial;
    }

    public void setNumSegSocial(String numSegSocial) {
        this.numSegSocial = numSegSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    public static int getNumEmpleados() {
        return numEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", numSegSocial='" + numSegSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaIngreso=" + fechaIngreso.getTime() +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(numSegSocial, empleado.numSegSocial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numSegSocial);
    }
}
