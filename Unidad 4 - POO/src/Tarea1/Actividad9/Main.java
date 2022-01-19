package Tarea1.Actividad9;

public class Main {
    public static void main(String[] args) {
        Maquinista maq1 = new Maquinista("Pepe Perez","2222222",1000, "Oficial");
        Mecanico mec1 = new Mecanico("Pepe Perez","12345678", Especialidad.OTRO);
        Locomotora loc1 = new Locomotora("2222A",1000,1999, mec1);

        Tren t1 = new Tren(loc1, maq1);

        System.out.println(t1);

        Vagon v1 = new Vagon(1000,"Cacahuetes");
        Vagon v2 = new Vagon(2000,"Cacahuetes");
        Vagon v3 = new Vagon(3000,"Cacahuetes");
        Vagon v4 = new Vagon(4000,"Cacahuetes");
        Vagon v5 = new Vagon(5000,"Cacahuetes");
        Vagon v6 = new Vagon(6000,"Cacahuetes");

        t1.addVagon(v1);
        t1.addVagon(v2);
        t1.addVagon(v3);
        t1.addVagon(v4);
        t1.addVagon(v5);
        t1.addVagon(v6);

        System.out.println(t1);

        t1.removeVagon();
        t1.removeVagon();

        System.out.println(t1);
    }
}
