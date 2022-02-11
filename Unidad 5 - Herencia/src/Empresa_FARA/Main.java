package Empresa_FARA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Conductor c1 = new Conductor("Pepe", "Perez", "1234");
        CamionCajas camion1 = new CamionCajas("1111-AAA",200, c1);
        CamionCajas camion2 = new CamionCajas("2222-BBB",250, c1);
        CamionCajas camion3 = new CamionCajas("3333-CCC",230, c1);
        CamionPerchas camion4 = new CamionPerchas("4444-DDD", 300, c1);

        Caja caja1 = new Caja(1);
        Caja caja2 = new Caja(2);
        Caja caja3 = new Caja(3);

        camion1.addCaja(caja1);
        camion1.addCaja(caja2);
        camion1.addCaja(caja3);

        camion2.addCaja(caja2);
        camion2.addCaja(caja3);

        camion3.addCaja(caja1);

        CamionCajas[] camiones = {camion1, camion2, camion3};

        for (CamionCajas c : camiones) {
            System.out.println(c);
        }

        Arrays.sort(camiones);
        System.out.println("Camiones ordenados por número de cajas:");

        for (CamionCajas c : camiones) {
            System.out.println(c);
        }
    }
}
