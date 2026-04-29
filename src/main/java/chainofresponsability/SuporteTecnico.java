package chainofresponsability;

public class SuporteTecnico extends Suporte {
    public SuporteTecnico(Suporte superior) {
        listaProblemas.add(TipoProblemaConexao.getTipoProblemaConexao());
        setSuporteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Suporte Técnico Nível 2";
    }
}