package tarea4_tablas_Adicionales;

public class Entregable_1 {
    public static void main(String[] args) {
        System.out.println(convierteEnMorse(12345));
        System.out.println(convierteEnMorse(67890));
    }

    public static String convierteEnMorse(int n) {
        String[] sistemaMorse = {"_____","·____","··___","···__","····_","·····","_····","__···","___··","____·"};
        String resultado = "";
        String numero = String.valueOf(n);

        for (int i = 0; i < numero.length(); i++) {
            resultado += sistemaMorse[Integer.parseInt(""+numero.charAt(i))];
        }
        return resultado;
    }
}
