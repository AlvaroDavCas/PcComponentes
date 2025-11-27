package dominio;


public class MotherBoard {
    private String socket;
    private String slotsExpansion;
    private String MemoriaMaxima;
    private String Tamanyo;

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getMemoriaMaxima() {
        return MemoriaMaxima;
    }

    public void setMemoriaMaxima(String memoriaMaxima) {
        MemoriaMaxima = memoriaMaxima;
    }

    public String getSlotsExpansion() {
        return slotsExpansion;
    }

    public void setSlotsExpansion(String slotsExpansion) {
        this.slotsExpansion = slotsExpansion;
    }

    public String getTamanyo() {
        return Tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        Tamanyo = tamanyo;
    }
}
