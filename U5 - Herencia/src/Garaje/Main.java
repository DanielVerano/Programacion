package Garaje;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche("Coche1",5,"1111-XXX",2000,Color.ROJO);
        Coche c2 = new Coche("Coche2",6,"2222-XXX",2004,Color.AMARILLO);
        Coche c3 = new Coche("Coche3",4,"3333-XXX",2003,Color.VERDE);
        Motocicleta m1 = new Motocicleta("Moto1",2,"4444-XXX",2005, Color.AZUL);
        Motocicleta m2 = new Motocicleta("Moto2",2,"5555-XXX",2007, Color.ROJO);
        Motocicleta m3 = new Motocicleta("Moto3",2,"6666-XXX",2010, Color.AMARILLO);
        Helicoptero h1 = new Helicoptero("Helicoptero1",10,1000,"ABCD1");
        Avioneta av1 = new Avioneta("Avioneta1",3,800,"ASDF2");

        VehiculoTerrestre[] vehiculos = {c3,c2,m1,m2,c1,m3};

        System.out.println("Orden original:");
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }

        System.out.println("Orden por defecto (matricula):");
        Arrays.sort(vehiculos);

        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }

        System.out.println("Orden por año de fabricación:");
        Arrays.sort(vehiculos, new ComparadorAnio());

        for (VehiculoTerrestre v : vehiculos) {
            System.out.println(v);
        }

        h1.transportar(9);
        System.out.println(h1);

        h1.volar();
        av1.volar();
    }
}
