package chainofresponsability;


public class TipoProblemaJuridico implements TipoProblema {
    private static TipoProblemaJuridico tipoProblemaJuridico = new TipoProblemaJuridico();
    private TipoProblemaJuridico() {}
    public static TipoProblemaJuridico getTipoProblemaJuridico() {
        return tipoProblemaJuridico;
    }
}