package Empresa_FARA;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Conductor c1 = new Conductor("Pepe", "Perez", "1234");
        CamionCajas camion1 = new CamionCajas("1111-AAA",200, c1);
        CamionCajas camion2 = new CamionCajas("2222-BBB",250, c1);
        CamionCajas camion3 = new CamionCajas("3333-CCC",230, c1);
        CamionPerchas camion4 = new CamionPerchas("4444-DDD", 300, c1);
        CamionPerchas camion5 = new CamionPerchas("5555-EEE", 250, c1);
        CamionPerchas camion6 = new CamionPerchas("6666-FFF", 150, c1);

        CamionCajas[] camiones = {camion1, camion2, camion3};
        CamionPerchas[] camionesPerchas = {camion4, camion5, camion6};

        Caja caja1 = new Caja(1);
        Caja caja2 = new Caja(2);
        Caja caja3 = new Caja(3);

        Prenda prenda1 = new Prenda(10, "Prenda1", "100", 50);
        Prenda prenda2 = new Prenda(20, "Prenda2", "101", 40);
        PrendaColgada prenda3 = new PrendaColgada(30, "Prenda3", "102", 60, 30);
        PrendaColgada prenda4 = new PrendaColgada(50, "Prenda4", "103", 50, 25);

        caja1.addPrenda(prenda1);
        caja1.addPrenda(prenda2);
        caja2.addPrenda(prenda3);
        caja3.addPrenda(prenda4);

        camion1.addCaja(caja1);
        camion1.addCaja(caja2);
        camion1.addCaja(caja3);
        camion2.addCaja(caja2);
        camion2.addCaja(caja3);
        camion3.addCaja(caja1);

        System.out.println("Camiones ordenados por el número de cajas:");
        Arrays.sort(camiones);

        for (CamionCajas c : camiones) {
            System.out.println(c.getMatricula() + " Cajas: " + c.getCajas().length);
        }

        System.out.println("Camiones ordenados por la carga:");
        Arrays.sort(camiones, new Comparator<CamionCajas>() {
            @Override
            public int compare(CamionCajas c1, CamionCajas c2) {
                return Double.compare(c1.getCarga(), c2.getCarga());
            }
        });

        for (CamionCajas c : camiones) {
            System.out.println(c.getMatricula() + " Carga: " + c.getCarga());
        }

        camion1.descargar();
        camion2.descargar();
        camion3.descargar();
        camion4.descargar();

        prenda1.devolver();
        prenda2.devolver();
        prenda3.devolver();
        prenda4.devolver();

        prenda1.doblar();
        prenda2.doblar();
        prenda3.doblar();
        prenda4.doblar();

        prenda3.colgar();
        prenda4.colgar();

        System.out.println("Número de prendas creadas: " + Prenda.getNumPrendas());
    }
}
