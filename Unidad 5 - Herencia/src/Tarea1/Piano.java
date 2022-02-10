package Tarea1;

public class Piano extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("Soy un piano");

        for (Nota nota : this.getNotas()) {
            System.out.println(nota);
        }
    }
}
