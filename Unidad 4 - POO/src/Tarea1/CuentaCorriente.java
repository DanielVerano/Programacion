package Tarea1;

public class CuentaCorriente {

    private int saldo;
    private int limite;
    public String nombre;
    String dni;
    private Banco banco;

    public CuentaCorriente(String nombre, String dni, Banco banco) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limite = -50;
        this.banco = banco;
    }

    public CuentaCorriente(String nombre, String dni) {
        this(nombre, dni, null);
    }

    public CuentaCorriente(int saldo) {
        this.saldo = saldo;
        this.limite = 0;
    }

    public CuentaCorriente(int saldo, int limite, String dni) {
        this.saldo = saldo;
        this.limite = limite;
        this.dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public boolean sacarDinero(double dinero) {
        if (this.saldo - dinero >= this.limite) {
            saldo -= dinero;
            return true;
        }
        return false;
    }

    public void ingresarDinero(double cantidad) {
        this.saldo += cantidad;
    }

    public void mostrar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return  "Nombre:" + nombre + ", DNI:" + dni + ", Saldo:" + saldo;
    }
}
