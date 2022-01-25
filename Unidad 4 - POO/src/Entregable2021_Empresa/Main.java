package Entregable2021_Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa emp1 = new Empresa("Pepe");

        Departamento dep1 = new Departamento("Uno", "Sevilla", "12345");
        Departamento dep2 = new Departamento("Dos","Huelva","67890");
        Departamento dep3 = new Departamento("Tres","11223344");

        Departamento[] deptos = new Departamento[]{dep1, dep2, dep3};

        Empleado empl1 = new Empleado("Pepe", "1234", "666555444", TipoEmpleado.DIRECTIVO);
        Empleado empl2 = new Empleado("Juan", "5678", "111222333", TipoEmpleado.ADMINISTRATIVO);
        Empleado empl3 = new Empleado("Maria", "2345","000111222");
        Empleado empl4 = new Empleado("Antonio", "6789", "567567567");
        Empleado empl5 = new Empleado("Javier", "0123", "123123123", TipoEmpleado.ADMINISTRATIVO);
        Empleado empl6 = new Empleado("Manuel", "3210", "987987987", TipoEmpleado.ADMINISTRATIVO);

        dep1.addEmpleado(empl1);
        dep1.addEmpleado(empl2);

        dep2.addEmpleado(empl3);
        dep2.addEmpleado(empl4);

        dep3.addEmpleado(empl5);
        dep3.addEmpleado(empl6);

        emp1.setDepartamentos(deptos);

        System.out.println(emp1);

        System.out.println(dep1);
        System.out.println(dep2);
    }
}
