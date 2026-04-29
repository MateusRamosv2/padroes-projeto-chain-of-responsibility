package chainofresponsability;

public class SuporteGerente extends Suporte {
    public SuporteGerente(Suporte superior) {
        listaProblemas.add(TipoProblemaReembolso.getTipoProblemaReembolso());
        setSuporteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Gerente de Atendimento";
    }
}