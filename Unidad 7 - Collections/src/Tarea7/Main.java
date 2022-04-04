package Tarea7;

public class Main {
    public static void main(String[] args) {
        Coordenadas coor1 = new Coordenadas(10, 20);
        Medicion med1 = new Medicion(25, 80, 100);
        Medicion med2 = new Medicion(30, 70, 50);
        Medicion med3 = new Medicion(-2, 90, 30);
        Medicion med4 = new Medicion(10, 20, 60);
        Medicion med5 = new Medicion(17, 0, 10);
        EstacionMeteorologica estacion1 = new EstacionMeteorologica("mediciones.dat", coor1);
        estacion1.addMedicion(med1);
        estacion1.addMedicion(med2);
        estacion1.addMedicion(med3);
        estacion1.addMedicion(med4);
        estacion1.addMedicion(med5);

        System.out.println("***Orden ascendente***");
        estacion1.ordenaTemperaturasAsc();
        System.out.println("***Orden descendente***");
        estacion1.ordenaTemperaturasDesc();
        System.out.println("***Presión máxima***");
        System.out.println(estacion1.presionMaxima());
        System.out.println("***Busca medición***");
        System.out.println(estacion1.buscaMedicion(med3));
        System.out.println("***Guardar fichero***");
        estacion1.guardarFichero("mediciones.dat");
    }
}
