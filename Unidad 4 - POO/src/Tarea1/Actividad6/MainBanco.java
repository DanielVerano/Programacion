package Tarea1.Actividad6;

public class MainBanco {
    public static void main(String[] args) {
        Banco banco1 = new Banco("BBVA","Aqui");
        CuentaCorriente cc1 = new CuentaCorriente("Pepe", "12345678Z", banco1);
        CuentaCorriente cc2 = new CuentaCorriente("Ana", "222222X", new Banco("Santander", "Alla"));

        cc1.ingresarDinero(100);
        cc1.mostrar();
        cc1.sacarDinero(80);
        cc1.mostrar();

        if (!cc1.sacarDinero(100)) {
            System.out.println("Saldo insuficiente");
        }
        cc1.mostrar();
    }
}
