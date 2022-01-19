package Tarea1.Actividad9;

public class Mecanico {
    private String nombreCompleto;
    private String telefono;
    private Especialidad especialidad;

    public Mecanico(String nombreCompleto, String telefono, Especialidad especialidad) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}
