package Tarea1.Actividad5;

public class Texto {
    private String cadena;
    private int longitud;

    public Texto() {
        this.cadena = "";
        this.longitud = 50;
    }

    public Texto(String cadena) {
        this(cadena, 100);
    }

    public Texto(String cadena, int longitud) {
        if (cadena.length() > longitud) {
            this.cadena = cadena.substring(0, longitud);
        } else {
            this.cadena = cadena;
        }
        this.longitud = longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

//    Se pone boolean para saber si el metodo se ejecuta con exito o no
    public boolean addCharStart(Character c) {
        if (this.cadena.length() < this.longitud) {
            this.cadena = c + this.cadena;
            return true;
        }
        return false;
    }

    public boolean addCharFin(Character c) {
        if (this.cadena.length() < this.longitud) {
            this.cadena += c;
            return true;
        }
        return false;
    }

    public boolean addStringStart(String cadena) {
        if (cadena.length() + this.cadena.length() <= this.longitud) {
            this.cadena = cadena + this.cadena;
            return true;
        }
        return false;
    }

    public boolean addStringFin(String cadena) {
        if (cadena.length() + this.cadena.length() <= this.longitud) {
            this.cadena += cadena;
            return true;
        }
        return false;
    }

    public int mostrarVocales() {
        int contador = 0;

        for (int i = 0; i < this.cadena.length(); i++) {
            if (esVocal(this.cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "cadena='" + cadena + '\'' +
                ", longitud=" + longitud +
                '}';
    }

    private boolean esVocal(Character c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}
