package dominio;


public class CPU {
    private String type;
    private String velocidad;
    private String memCache;
    private String generacion;
    private String nucleo;
    private String Arquitectura;

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMemCache() {
        return memCache;
    }

    public void setMemCache(String memCache) {
        this.memCache = memCache;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getNucleo() {
        return nucleo;
    }

    public void setNucleo(String nucleo) {
        this.nucleo = nucleo;
    }

    public String getArquitectura() {
        return Arquitectura;
    }

    public void setArquitectura(String arquitectura) {
        Arquitectura = arquitectura;
    }
}
