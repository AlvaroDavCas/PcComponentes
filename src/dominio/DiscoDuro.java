package dominio;

public class DiscoDuro {
    private String Tipo;
    private String Capacidad;
    private String velocidadLectura;
    private String velocidadEscritura;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String capacidad) {
        Capacidad = capacidad;
    }

    public String getVelocidadLectura() {
        return velocidadLectura;
    }

    public void setVelocidadLectura(String velocidadLectura) {
        this.velocidadLectura = velocidadLectura;
    }

    public String getVelocidadEscritura() {
        return velocidadEscritura;
    }

    public void setVelocidadEscritura(String velocidadEscritura) {
        this.velocidadEscritura = velocidadEscritura;
    }
}
