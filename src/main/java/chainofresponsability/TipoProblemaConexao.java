package chainofresponsability;

public class TipoProblemaConexao implements TipoProblema {
    private static TipoProblemaConexao tipoProblemaConexao = new TipoProblemaConexao();
    private TipoProblemaConexao() {}
    public static TipoProblemaConexao getTipoProblemaConexao() {
        return tipoProblemaConexao;
    }
}