package Tarea1;

public class Campana extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("Soy una campana");

        for (Nota nota : this.getNotas()) {
            System.out.println(nota);
        }
    }
}
