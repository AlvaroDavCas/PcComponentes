package dominio;

public class Caja {
    private String Dimensiones;
    private String CompatibilidadSuperior;
    private String ConectividadCompleta;

    public String getDimensiones() {
        return Dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        Dimensiones = dimensiones;
    }

    public String getCompatibilidadSuperior() {
        return CompatibilidadSuperior;
    }

    public void setCompatibilidadSuperior(String compatibilidadSuperior) {
        CompatibilidadSuperior = compatibilidadSuperior;
    }

    public String getConectividadCompleta() {
        return ConectividadCompleta;
    }

    public void setConectividadCompleta(String conectividadCompleta) {
        ConectividadCompleta = conectividadCompleta;
    }
}
