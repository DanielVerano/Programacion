import java.util.Objects;

public class Empleado extends Persona {
    private Double salario;

    public Empleado(String nombre, String apellidos, String dni) {
        this(nombre, apellidos, dni, 1000.0);
    }

    public Empleado(String nombre, String apellidos, String dni, Double salario) {
        super(nombre, apellidos, dni);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
