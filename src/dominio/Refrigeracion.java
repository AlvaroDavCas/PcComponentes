package dominio;

public class Refrigeracion {
    private String Tamanyo;
    private String Compactible;
    private String ventiladores;

    public String getTamanyo() {
        return Tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        Tamanyo = tamanyo;
    }

    public String getCompactible() {
        return Compactible;
    }

    public void setCompactible(String compactible) {
        Compactible = compactible;
    }

    public String getVentiladores() {
        return ventiladores;
    }

    public void setVentiladores(String ventiladores) {
        this.ventiladores = ventiladores;
    }
}
