package Examen2021_Manana;

public class Main2 {
    public static void main(String[] args) {
        Maraton2 maraton = new Maraton2();
        Atleta at1 = new Atleta("Pepe", "España", Categoria.SENIOR);
        Atleta at2 = new Atleta("Ana", "España", Categoria.JUNIOR);
        Atleta at3 = new Atleta("Juan", "Portugal", Categoria.VETERANO);

        maraton.inscribirAtleta(at1);
        maraton.inscribirAtleta(at2);
        maraton.inscribirAtleta(at3);

        maraton.guardarTiempo(1, 100);
        maraton.guardarTiempo(2, 150);
        maraton.guardarTiempo(3, 200);
        maraton.mostrarListaFinishers();
        maraton.mostrarListaCategoria(Categoria.VETERANO);
    }
}
