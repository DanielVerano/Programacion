public class Main {

    public static void main(String[] args) {
        Coro coro1 = new Coro("Coro1", "Pepe", "Pepe", "Pepe", "León", 60, 3, 4);
        Comparsa comparsa1 = new Comparsa("Comparsa1", "Ana", "Ana", "Ana", "Oveja", 100, "Una Empresa");
        Chirigota chirigota1 = new Chirigota("Chirigota1", "Juan", "Juan", "Juan", "Gorila", 75, 5);
        Cuarteto cuarteto1 = new Cuarteto("Cuarteto1", "Clara", "Clara", "Clara", "Sirena", 90, 4);
        Romancero romancero1 = new Romancero("Romancero1", "Julio", "Julio", "Julio", "Caballo", "Animales");
        Integrante integrante1 = new Integrante(1, "Pepe", 43, "Sevilla");
        Integrante integrante2 = new Integrante(2, "Marta", 34, "Cadiz");
        COAC coac = new COAC();

//        Mostrar agrupaciones y sus métodos
        System.out.println(coro1);
        coro1.cantar_la_presentacion();
        coro1.hacer_tipo();
        coro1.caminito_del_falla();

        System.out.println(comparsa1);
        comparsa1.cantar_la_presentacion();
        comparsa1.hacer_tipo();
        comparsa1.caminito_del_falla();

        System.out.println(chirigota1);
        chirigota1.cantar_la_presentacion();
        chirigota1.hacer_tipo();
        chirigota1.caminito_del_falla();
        chirigota1.amo_a_escucha();

        System.out.println(cuarteto1);
        cuarteto1.cantar_la_presentacion();
        cuarteto1.hacer_tipo();
        cuarteto1.caminito_del_falla();
        cuarteto1.amo_a_escucha();

        System.out.println(romancero1);
        romancero1.cantar_la_presentacion();
        romancero1.hacer_tipo();
        romancero1.amo_a_escucha();

//        Mostrar el número de agrupaciones creadas
        System.out.println("Agrupaciones totales: " + Agrupacion.getNumAgrupaciones());

//        Insertar y eliminar integrantes
        coro1.insertar_integrante(integrante1);
        coro1.insertar_integrante(integrante2);
        System.out.println(coro1);
        coro1.eliminar_integrante(integrante1);
        System.out.println(coro1);

//        Insertar agrupaciones
        coac.inscribir_agrupacion(coro1);
        coac.inscribir_agrupacion(comparsa1);
        coac.inscribir_agrupacion(chirigota1);
        coac.inscribir_agrupacion(cuarteto1);
        System.out.println(coac);

//        Mostrar agrupaciones por diferentes ordenaciones
        System.out.println("Mostrando ordenaciones por el nombre:");
        coac.ordenar_por_nombre();
        System.out.println("Mostrando ordenaciones por el autor:");
        coac.ordenar_por_autor();
        System.out.println("Mostrando ordenaciones por los puntos:");
        coac.ordenar_por_puntos();

//        Eliminar agrupaciones
        coac.eliminar_agrupacion(comparsa1);
        coac.eliminar_agrupacion(coro1);
        coac.eliminar_agrupacion(cuarteto1);
        System.out.println(coac);
    }
}
