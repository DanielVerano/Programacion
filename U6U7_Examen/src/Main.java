public class Main {
    public static void main(String[] args) {
        Oferta of1 = new Oferta(1234, "Limpiador", false);
        Oferta of2 = new Oferta(5678, "Profesor", false);
        Oferta of3 = new Oferta(1029, "Informático", false);
        Oferta of4 = new Oferta(2233, "Guardia", true);
        Oferta of5 = new Oferta(4567, "Fontanero", false);

        Trabajador trab1 = new Trabajador("111A", "Pepe", "Perez", 43, "Funcionario");
        Trabajador trab2 = new Trabajador("222B", "Ana", "Lopez", 34, "FP Superior");
        Trabajador trab3 = new Trabajador("333C", "Juan", "Moreno", 25, "FP Medio");
        Trabajador trab4 = new Trabajador("444D", "Maria", "Castaño", 31, "Universidad");
        Trabajador trab5 = new Trabajador("555E", "Pedro", "Gutierrez", 23, "FP Superior");
        Trabajador trab6 = new Trabajador("666F", "Clara", "Garcia", 33, "Máster");
        Trabajador trab7 = new Trabajador("777G", "Rosa", "Lopez", 41, "Funcionaria");
        Trabajador trab8 = new Trabajador("888H", "Manu", "Rodriguez", 22, "ESO");
        Trabajador trab9 = new Trabajador("999I", "Javier", "Martinez", 30, "FP Medio");
        Trabajador trab10 = new Trabajador("000J", "Alfonso", "Perez", 19, "FP Superior");

        SAE sae = new SAE();
        System.out.println(sae);

//        Cargar datos
        sae.cargarDatos();

//        Añadir una oferta
        System.out.println("Añadiendo ofertas");
        System.out.println(sae.addOferta(of1));
        System.out.println(sae.addOferta(of2));
        System.out.println(sae.addOferta(of3));
        System.out.println(sae.addOferta(of4));
        System.out.println(sae.addOferta(of5));
        System.out.println(sae.addOferta(of1)); // Devuelve false
        System.out.println(sae);
        System.out.println("--------------------");

//        Añadir un trabajador
        System.out.println("Añadiendo trabajadores");
        System.out.println(sae.addTrabajador(5678, trab1));
        System.out.println(sae.addTrabajador(1029, trab1));
        System.out.println(sae.addTrabajador(2233, trab1));
        System.out.println(sae.addTrabajador(4567, trab1));
        System.out.println(sae.addTrabajador(5678, trab2));
        System.out.println(sae.addTrabajador(5678, trab3));
        System.out.println(sae.addTrabajador(5678, trab4));
        System.out.println(sae.addTrabajador(1029, trab5));
        System.out.println(sae.addTrabajador(1029, trab6));
        System.out.println(sae.addTrabajador(2233, trab7));
        System.out.println(sae.addTrabajador(2233, trab8));
        System.out.println(sae.addTrabajador(4567, trab9));
        System.out.println(sae.addTrabajador(4567, trab10));
        System.out.println(sae.addTrabajador(4567, trab10)); // Devuelve false
        System.out.println(sae);
        System.out.println("--------------------");

//        Quitar un trabajador
        System.out.println("Quitando trabajadores");
        System.out.println(sae.removeTrabajador(4567, trab4));
        System.out.println(sae.removeTrabajador(4567, trab10));
        System.out.println(sae);
        System.out.println("--------------------");

//        Mostrar trabajadores de una oferta
        System.out.println("Mostrando trabajadores de una oferta");
        sae.mostrarTrabajadores(5678);
        sae.mostrarTrabajadores(1234);
        System.out.println("--------------------");

//        Mostrar trabajadores por edad
        System.out.println("Mostrando trabajadores por edad");
        sae.mostrarTrabajadoresXEdad(5678);
        sae.mostrarTrabajadoresXEdad(1234);
        System.out.println("--------------------");

//        Cantidad de ofertas en la que está inscrito un trabajador
        System.out.println("Mostrando la cantidad de ofertas");
        System.out.println(sae.cantidadOfertas("111A"));
        System.out.println(sae.cantidadOfertas("222B"));
        System.out.println(sae.cantidadOfertas("ABCD"));
        System.out.println("--------------------");

//        Mostrar ofertas ordenadas por el número de solicitantes
        System.out.println("Mostrando ofertas ordenadas por el número de solicitantes");
        sae.mostrarOfertas();
        System.out.println("--------------------");

//        Guardar datos
        sae.guardarDatos();
    }
}
