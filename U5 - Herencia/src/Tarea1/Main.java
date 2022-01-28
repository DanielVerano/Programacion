package Tarea1;

public class Main {
    public static void main(String[] args) {
        Hora hora1 = new Hora(11,45);
        HoraExacta horaE1 = new HoraExacta(11,45,56);
        System.out.println(horaE1.equals(hora1));

        for (int i = 0; i < 60; i++) {
            hora1.inc();
            System.out.println(hora1);
        }

        Hora12 hora2 = new Hora12(23,30);

        for (int i = 0; i < 1440; i++) {
            hora2.inc();
            System.out.println(hora2);
        }

        /*HoraExacta hora4 = new HoraExacta(23,59,59);
        System.out.println(hora4);

        for (int i = 0; i < 61; i++) {
            hora4.inc();
            System.out.println(hora4);
        }*/
    }
}
