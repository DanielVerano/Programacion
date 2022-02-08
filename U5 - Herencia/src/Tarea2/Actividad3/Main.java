package Tarea2.Actividad3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PoligonoRegular[] figuras = new PoligonoRegular[5];

        Cuadrado cuad1 = new Cuadrado(5, Color.ROJO);
        Triangulo t1 = new Triangulo(8, Color.VERDE, 12);
        Circulo cir1 = new Circulo(6, Color.AZUL, 9);
        Circulo cir2 = new Circulo(6, Color.AZUL, 6);
        Circulo cir3 = new Circulo(6, Color.AZUL, 3);
        Circulo cir4 = new Circulo(6, Color.AZUL, 1);

        Circulo[] circulos = new Circulo[4];

        circulos[0] = cir1;
        circulos[1] = cir2;
        circulos[2] = cir3;
        circulos[3] = cir4;

        System.out.println(Arrays.toString(circulos));

        Arrays.sort(circulos);

        System.out.println(Arrays.toString(circulos));

        figuras[0] = cuad1;
        figuras[1] = t1;
        figuras[2] = cir1;

        for (PoligonoRegular figura : figuras) {
            if (figura != null) {
                System.out.println(figura);
                System.out.println(figura.getArea());
            }
        }

        System.out.println(PoligonoRegular.getContadorPoligonos());
    }
}
