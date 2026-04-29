package chainofresponsability;

public class SuporteAtendente extends Suporte {
    public SuporteAtendente(Suporte superior) {
        listaProblemas.add(TipoProblemaDuvida.getTipoProblemaDuvida());
        setSuporteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Atendente Nível 1";
    }
}