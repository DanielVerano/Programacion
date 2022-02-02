public class Main {

    public static void main(String[] args) {
        Opositor opo1 = new Opositor("Juan","Garcia",1975,true,"Hola");
        Opositor opo2 = new Opositor("Ana","Rodriguez",1980,false,"");
        Opositor opo3 = new Opositor("Fran","Vazquez",1989,true,"Descripcion");
        Opositor opo4 = new Opositor("Elena","Fernandez",1974,false,"Descripcion2");

        opo1.mostrarInformacion();
        opo2.mostrarInformacion();
        opo3.mostrarInformacion();
        opo4.mostrarInformacion();

        System.out.println("Número de opositores:" + Opositor.getNumOpositores());
        System.out.println("Número de adaptaciones:" + Opositor.getNumAdaptaciones());

        Sede sede1 = new Sede("1234",Ciudad.ALMERIA, 50);
        Sede sede2 = new Sede("5678",Ciudad.SEVILLA, 70);

        sede1.addOpositor(opo1);
        sede1.addOpositor(opo2);
        sede2.addOpositor(opo3);
        sede2.addOpositor(opo4);

        sede1.mostrarInformacion();
        sede2.mostrarInformacion();

        Opcion opcion1 = new Opcion("Opcion1", true);
        Opcion opcion2 = new Opcion("Opcion2", false);
        Opcion opcion3 = new Opcion("Opcion3", false);
        Opcion opcion4 = new Opcion("Opcion4", true);
        Opcion opcion5 = new Opcion("Opcion5", true);
        Opcion opcion6 = new Opcion("Opcion6", false);

        opcion1.mostrarInformacion();
        opcion2.mostrarInformacion();
        opcion3.mostrarInformacion();
        opcion4.mostrarInformacion();
        opcion5.mostrarInformacion();
        opcion6.mostrarInformacion();

        Pregunta preg1 = new Pregunta("Enunciado1");
        Pregunta preg2 = new Pregunta("Enunciado2");

        preg1.addOpcion(opcion1);
        preg1.addOpcion(opcion2);
        preg1.addOpcion(opcion3);

        preg2.addOpcion(opcion4);
        preg2.addOpcion(opcion5);
        preg2.addOpcion(opcion6);

        preg1.mostrarInformacion();
        preg2.mostrarInformacion();

        Examen examen1 = new Examen("Consejeria","Enlace");

        examen1.addPregunta(preg1);
        examen1.addPregunta(preg2);
        examen1.addSede(sede1);
        examen1.addSede(sede2);

        examen1.mostrarInformacion();

        preg1.removeOpcion(opcion1);
        preg1.removeOpcion(opcion2);
        preg1.removeOpcion(opcion3);
        preg1.mostrarInformacion();

        preg2.removeOpcion(opcion4);
        preg2.removeOpcion(opcion6);
        preg2.addOpcion(opcion1);
        preg2.mostrarInformacion();
    }
}
