package chainofresponsability;

public class TipoProblemaDuvida implements TipoProblema {
    private static TipoProblemaDuvida tipoProblemaDuvida = new TipoProblemaDuvida();
    private TipoProblemaDuvida() {}
    public static TipoProblemaDuvida getTipoProblemaDuvida() {
        return tipoProblemaDuvida;
    }
}