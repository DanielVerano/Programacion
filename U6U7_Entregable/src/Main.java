import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Alumno> mapaAlumnos = new HashMap<>();
        TreeSet<Alumno> setAlumnos = new TreeSet<>();
        int opcion;
        Scanner sc = new Scanner(System.in);

        cargarDatos(mapaAlumnos, setAlumnos);

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    insertarAlumno(mapaAlumnos, setAlumnos, sc);
                    break;
                case 2:
                    borrarAlumno(mapaAlumnos, setAlumnos, sc);
                    break;
                case 3:
                    mostrarAlumnos(setAlumnos);
                    break;
                case 4:
                    mostrarAlumnosDeUnCurso(mapaAlumnos, sc);
                    break;
                case 5:
                    modificarAlumno(mapaAlumnos, setAlumnos, sc);
                    break;
                case 6:
                    guardarDatos(mapaAlumnos);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 6);
    }

    private static void guardarDatos(HashMap<String,Alumno> mapaAlumnos) {
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));

            for (Alumno alumno : mapaAlumnos.values()) {
                out.writeObject(alumno);
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

    private static void modificarAlumno(HashMap<String,Alumno> mapaAlumnos, TreeSet<Alumno> setAlumnos, Scanner sc) {
        String nombre, apellidos, direccion, dni, email;
        int curso;
        boolean dual;
        System.out.println("Introduce el DNI del alumno a modificar:");
        dni = sc.nextLine();

        if (mapaAlumnos.containsKey(dni)) {
            System.out.println("Introduce el nombre:");
            nombre = sc.nextLine();
            System.out.println("Introduce los apellidos:");
            apellidos = sc.nextLine();
            System.out.println("Introduce la dirección:");
            direccion = sc.nextLine();
            System.out.println("Introduce el email:");
            email = sc.nextLine();
            System.out.println("Introduce el curso:");
            curso = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce si es dual (true or false):");
            dual = sc.nextBoolean();

            Alumno nuevo = new Alumno(nombre, apellidos, direccion, dni, email, curso, dual);

            mapaAlumnos.put(dni, nuevo);

            Iterator<Alumno> it = setAlumnos.iterator();
            boolean modificado = false;

            while (it.hasNext() && !modificado) {
                Alumno a = it.next();
                if (a.getDni().equals(dni)) {
                    it.remove();
                    setAlumnos.add(nuevo);
                    modificado = true;
                }
            }
        } else {
            System.out.println("NO EXISTE ALUMNO CON ESE DNI");
        }
    }

    private static void mostrarAlumnosDeUnCurso(HashMap<String,Alumno> mapaAlumnos, Scanner sc) {
        int curso;
        boolean noHayAlumnos = true;
        System.out.println("Introduce el curso del que desea mostrar los alumnos:");
        curso = sc.nextInt();
        sc.nextLine();

        for (Alumno alumno : mapaAlumnos.values()) {
            if (alumno.getCurso() == curso) {
                System.out.println(alumno);
                noHayAlumnos = false;
            }
        }

        if (noHayAlumnos) {
            System.out.println("NO HAY ALUMNOS DE ESE CURSO");
        }
    }

    private static void mostrarAlumnos(TreeSet<Alumno> setAlumnos) {
        for (Alumno alumno : setAlumnos) {
            System.out.println(alumno);
        }
    }

    private static void borrarAlumno(HashMap<String,Alumno> mapaAlumnos, TreeSet<Alumno> setAlumnos, Scanner sc) {
        String dni;
        System.out.println("Introduce el dni del alumno a borrar:");
        dni = sc.nextLine();

        if (mapaAlumnos.containsKey(dni)) {
            Alumno borrar = mapaAlumnos.remove(dni);
            setAlumnos.remove(borrar);
        } else {
            System.out.println("ALUMN@ NO EXISTE");
        }
    }

    private static void insertarAlumno(HashMap<String,Alumno> mapaAlumnos, TreeSet<Alumno> setAlumnos, Scanner sc) {
        String nombre, apellidos, direccion, dni, email;
        int curso;
        boolean dual;
        System.out.println("Introduce el nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduce los apellidos:");
        apellidos = sc.nextLine();
        System.out.println("Introduce la dirección:");
        direccion = sc.nextLine();
        System.out.println("Introduce el DNI:");
        dni = sc.nextLine();
        System.out.println("Introduce el email:");
        email = sc.nextLine();
        System.out.println("Introduce el curso:");
        curso = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce si es dual o no (true or false):");
        dual = sc.nextBoolean();

        Alumno a = new Alumno(nombre, apellidos, direccion, dni, email, curso, dual);

        if (!mapaAlumnos.containsKey(dni)) {
            mapaAlumnos.put(dni, a);
            setAlumnos.add(a);
        } else {
            System.out.println("El alumno ya existe");
        }
    }

    private static void mostrarMenu() {
        System.out.println("Introduzca una opción:");
        System.out.println("1 - Insertar Alumno");
        System.out.println("2 - Borrar Alumno");
        System.out.println("3 - Mostrar alumnos");
        System.out.println("4 - Mostrar alumnos de un curso");
        System.out.println("5 - Modificar alumno");
        System.out.println("6 - Salir");
    }

    public static void cargarDatos(Map<String, Alumno> mapa, Set<Alumno> set) {
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("alumnos.dat"));

            while (true) {
                Alumno a = (Alumno) in.readObject();
                mapa.put(a.getDni(), a);
                set.add(a);
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println("El fichero no existe");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
