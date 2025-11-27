package dominio;

public class FuenteAlimentacion {
    private String Potencia;
    private String Conectividad;
    private String Dimensiones;

    public String getPotencia() {
        return Potencia;
    }

    public void setPotencia(String potencia) {
        Potencia = potencia;
    }

    public String getConectividad() {
        return Conectividad;
    }

    public void setConectividad(String conectividad) {
        Conectividad = conectividad;
    }

    public String getDimensiones() {
        return Dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        Dimensiones = dimensiones;
    }
}
