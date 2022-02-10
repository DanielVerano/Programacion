package Juego_RPG;

public abstract class Personaje implements Comparable<Personaje> {
    private String nombre;
    private int energia;
    private int capAtaque;
    private int capDefensa;
    private boolean encantado;

    public Personaje(String nombre, int energia, int capAtaque, int capDefensa) {
        if (energia < 0 || energia > 1000) {
            energia = 500;
        }

        if (capAtaque < 0 || capAtaque > 100) {
            capAtaque = 50;
        }

        if (capDefensa < 0 || capDefensa > 100) {
            capDefensa = 50;
        }
        this.nombre = nombre;
        this.energia = energia;
        this.capAtaque = capAtaque;
        this.capDefensa = capDefensa;
        this.encantado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getCapAtaque() {
        return capAtaque;
    }

    public void setCapAtaque(int capAtaque) {
        this.capAtaque = capAtaque;
    }

    public int getCapDefensa() {
        return capDefensa;
    }

    public void setCapDefensa(int capDefensa) {
        this.capDefensa = capDefensa;
    }

    public boolean isEncantado() {
        return encantado;
    }

    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", capAtaque=" + capAtaque +
                ", capDefensa=" + capDefensa +
                ", encantado=" + encantado +
                '}';
    }

    @Override
    public int compareTo(Personaje personaje) {
        return this.getEnergia() - personaje.getEnergia();
    }
}
