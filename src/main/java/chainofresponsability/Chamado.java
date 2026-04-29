package chainofresponsability;

public class Chamado {
    private TipoProblema tipoProblema;

    public Chamado(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public TipoProblema getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }
}