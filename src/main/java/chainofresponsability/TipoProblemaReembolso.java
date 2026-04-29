package chainofresponsability;

public class TipoProblemaReembolso implements TipoProblema {
    private static TipoProblemaReembolso tipoProblemaReembolso = new TipoProblemaReembolso();
    private TipoProblemaReembolso() {}
    public static TipoProblemaReembolso getTipoProblemaReembolso() {
        return tipoProblemaReembolso;
    }
}