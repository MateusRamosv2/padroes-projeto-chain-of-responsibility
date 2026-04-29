package chainofresponsability;

import java.util.ArrayList;

public abstract class Suporte {

    protected ArrayList<TipoProblema> listaProblemas = new ArrayList<>();
    private Suporte suporteSuperior;

    public Suporte getSuporteSuperior() {
        return suporteSuperior;
    }

    public void setSuporteSuperior(Suporte suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }

    public abstract String getDescricaoNivel();

    public String resolverChamado(Chamado chamado) {

        if (listaProblemas.contains(chamado.getTipoProblema())) {
            return getDescricaoNivel();
        }
        else {

            if (suporteSuperior != null) {
                return suporteSuperior.resolverChamado(chamado);
            }
            else {
                return "Sem solução - Encaminhado ao jurídico";
            }
        }
    }
}