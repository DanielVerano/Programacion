package Examen1920_Tarde;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medico medico1 = new Medico("Pepe","Perez",1, "Juan de Dios");
        Medico medico2 = new Medico("Julio","Alvarez",2,"Otro");
        Medico medico3 = new Medico("Clara","Fernandez",3,"Otro");
        Paciente paciente1 = new Paciente("Ana",34, 67, true, medico1, 'A');
        Paciente paciente2 = new Paciente("Juan",24,110,false,medico1, 'A');
        Paciente paciente3 = new Paciente("Pepe",19,95,false,medico2, 'B');
        Paciente paciente4 = new Paciente("Marta",49,83,false,medico2, 'B');
        Paciente paciente5 = new Paciente("Mamerto",56,74,false,medico2, 'B');
        Paciente paciente6 = new Paciente("Pedro",51,88,false,medico3, 'B');
        Paciente paciente7 = new Paciente("Gloria",27,61,false,medico3, 'C');
        Paciente paciente8 = new Paciente("Lola",14,50,true,medico3, 'C');

        Coronavirus cv = new Coronavirus();

        System.out.println("¿Cargar los datos desde un fichero (1) o insertarlos manualmente? (2)");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                cv.cargarPacientes();
                break;
            case 2:
                cv.addPaciente('A',paciente1);
                cv.addPaciente('A',paciente2);
                cv.addPaciente('B',paciente3);
                cv.addPaciente('B',paciente4);
                cv.addPaciente('B',paciente5);
                cv.addPaciente('B',paciente6);
                cv.addPaciente('C',paciente7);
                cv.addPaciente('C',paciente8);
                break;
            default:
                break;
        }

        System.out.println("***Pacientes del doctor nº2***");
        cv.pacientesDeUnDoctor(2);

        System.out.println("\n***Pacientes por peso***");
        cv.pacientesPorPeso('B');

        System.out.println("\n***Pacientes por edad***");
        cv.pacientesPorEdad('B');

        cv.guardarPacientes();
    }
}
