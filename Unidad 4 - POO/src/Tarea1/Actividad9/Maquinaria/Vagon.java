package Tarea1.Actividad9.Maquinaria;

class Vagon {
    private int capacidadMaxima;
    private int capacidadActual;
    private String tipoMercancia;

    public Vagon(int capacidadMaxima, String tipoMercancia) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = 0;
        this.tipoMercancia = tipoMercancia;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", capacidadActual=" + capacidadActual +
                ", tipoMercancia='" + tipoMercancia + '\'' +
                '}';
    }
}
