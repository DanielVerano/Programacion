package Tarea4.Map_II;

import java.io.*;
import java.util.*;

public class GestionEmpleados {
    private HashMap<String, Empleado> empleados;

    public GestionEmpleados() {
        this.empleados = new HashMap<>();
    }

    public HashMap<String, Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashMap<String, Empleado> empleados) {
        this.empleados = empleados;
    }

    public void cargarEmpleados() {
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("empleados.dat"));

            while (true) {
                Empleado e = (Empleado) in.readObject();
                empleados.put(e.getDni(), e);
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void pedirEmpleados(Scanner teclado) {
        boolean seguir = true;
        do {
            System.out.println("Introduzca el dni del nuevo empleado:");
            String dni = teclado.nextLine();

            if (empleados.containsKey(dni)) {
                System.out.println("El DNI ya existe");
            } else {
                System.out.println("Introduzca el nombre del nuevo empleado:");
                String nombre = teclado.nextLine();
                System.out.println("Introduzca el sueldo del nuevo empleado:");
                double sueldo = teclado.nextDouble();
                teclado.nextLine();

                empleados.put(dni, new Empleado(nombre, dni, sueldo));
            }

            System.out.println("¿Quiere seguir introduciendo empleados? (si/no)");
            String answer = teclado.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                seguir = false;
            }
        } while (seguir);
    }

    public void volcarDatos() {
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("empleados.dat"));

            for (Empleado empleado : empleados.values()) {
                out.writeObject(empleado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void mostrarEmpleados(Map<String, Empleado> mapa) {
        Collection<Empleado> empleados = mapa.values();

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public void borrarEmpleado(Scanner teclado) {
        String clave;
        do {
            System.out.println("Introduzca el DNI del empleado a borrar:");
            clave = teclado.nextLine();

            if (empleados.containsKey(clave)) {
                empleados.remove(clave);
            } else {
                System.out.println("No existe un empleado con ese DNI");
            }

        } while (!clave.equalsIgnoreCase("fin"));
    }

    public void visualizarEmpleado(Scanner teclado) {
        System.out.println("Introduzca el DNI del empleado a visualizar:");
        String dni = teclado.nextLine();

        if (empleados.containsKey(dni)) {
            System.out.println(empleados.get(dni));
        } else {
            System.out.println("No existe ese empleado");
        }
    }

    public void modificarEmpleado(Scanner teclado) {
        System.out.println("Introduzca el DNI del empleado que quiere cambiar:");
        String dni = teclado.nextLine();

        if (empleados.containsKey(dni)) {
            System.out.println("Introduce el nuevo nombre:");
            String nombre = teclado.nextLine();
            System.out.println("Introduce el nuevo sueldo:");
            double sueldo = teclado.nextDouble();
            System.out.println("Introduce la nueva edad:");
            int edad = teclado.nextInt();
            System.out.println("Introduce la nueva altura:");
            double altura = teclado.nextDouble();

            empleados.get(dni).setNombre(nombre);
            empleados.get(dni).setSueldo(sueldo);
            empleados.get(dni).setEdad(edad);
            empleados.get(dni).setEstatura(altura);
        } else {
            System.out.println("No existe ese empleado");
        }
    }

    public void mostrarMenu() {
        System.out.println("\nIndique la opción que desee hacer:");
        System.out.println("1 - Visualizar listado");
        System.out.println("2 - Borrar empleado(s)");
        System.out.println("3 - Visualizar empleado");
        System.out.println("4 - Modificar empleado");
        System.out.println("5 - Insertar empleado(s)");
        System.out.println("-1 - Salir");
    }

    @Override
    public String toString() {
        return "GestionEmpleados{" +
                "empleados=" + empleados +
                '}';
    }
}
