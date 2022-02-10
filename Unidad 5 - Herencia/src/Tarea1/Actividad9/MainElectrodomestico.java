package Tarea1.Actividad9;

public class MainElectrodomestico {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        Lavadora[] lavadoras = new Lavadora[5];

        Lavadora lav1 = new Lavadora();
        Lavadora lav2 = new Lavadora(100,Color.AZUL,Consumo.A,80, 10);
        Lavadora lav3 = new Lavadora(200,30);

        Television tele1 = new Television();
        Television tele2 = new Television(150, 40);
        Television tele3 = new Television(500,Color.GRIS,Consumo.B,30,45,true);

        electrodomesticos[0] = lav1;
        electrodomesticos[1] = lav2;
        electrodomesticos[2] = lav3;
        electrodomesticos[3] = tele1;
        electrodomesticos[4] = tele2;
        electrodomesticos[5] = tele3;

        lavadoras[0] = lav1;
        lavadoras[1] = lav2;
        lavadoras[2] = lav3;

        for (int i = 0; i < electrodomesticos.length; i++) {
            System.out.println(electrodomesticos[i]);
        }
    }
}
