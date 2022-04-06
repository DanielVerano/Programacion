package Examen1920_Manana;

public class Main {
    public static void main(String[] args) {
        Propietario prop1 = new Propietario("pepe","perez",2, "España");
        Propietario prop2 = new Propietario("ana", "lopez", 13, "Francia");
        Propietario prop3 = new Propietario("juan", "fernandez", 4, "Italia");
        Perro perro1 = new Perro("bobby", 3, 24, true, prop1, "caniche");
        Perro perro2 = new Perro("algo", 4, 17, true, prop1, "labrador");
        Perro perro3 = new Perro("kirby", 6, 21, true, prop2, "labrador");
        Perro perro4 = new Perro("Lulu",15,9000,true,prop1,"doberman");
        Perro perro5 = new Perro("Luna",8,9300,true,prop1,"boxer");
        Perro perro6 = new Perro("Speedy",9,11200,true,prop2,"boxer");
        Perro perro7 = new Perro("Snoopy",7,12000,true,prop1,"caniche");
        Perro perro8 = new Perro("Lassie",10,14000,true,prop1,"san bernardo");
        Perro perro9 = new Perro("Goku",11,6100,true,prop2,"caniche");
        Perro perro10 = new Perro("Naruto",6,12175,true,prop1,"caniche");
        Concurso concurso = new Concurso("Concurso", "Sevilla");

        concurso.cargarPerros();

        /*concurso.addDog("caniche", perro1);
        concurso.addDog("labrador", perro2);
        concurso.addDog("labrador", perro3);
        concurso.addDog("doberman", perro4);
        concurso.addDog("boxer", perro5);
        concurso.addDog("boxer", perro6);
        concurso.addDog("caniche", perro7);
        concurso.addDog("san bernardo", perro8);
        concurso.addDog("caniche", perro9);
        concurso.addDog("caniche", perro10);*/

        concurso.disqualifyDog(perro2);

        System.out.println("***Perros por peso***");
        concurso.perrosPorPeso("caniche");
        System.out.println("***Perros por edad***");
        concurso.perrosPorEdad("caniche");

        System.out.println("***Perros que pertenecen al socio número 2***");
        concurso.ownerDogs(2);
        concurso.ownerDogs(4);

        concurso.guardarPerros();
    }
}
