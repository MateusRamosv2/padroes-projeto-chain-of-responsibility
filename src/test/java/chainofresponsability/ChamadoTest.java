package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    SuporteGerente gerente;
    SuporteTecnico tecnico;
    SuporteAtendente atendente;

    @BeforeEach
    void setUp() {
        // Montando a cadeia de baixo para cima (do maior cargo para o menor)
        gerente = new SuporteGerente(null); // Fim da linha
        tecnico = new SuporteTecnico(gerente); // Técnico repassa para o Gerente
        atendente = new SuporteAtendente(tecnico); // Atendente repassa para o Técnico
    }

    @Test
    void deveRetornarAtendenteParaDuvidaBasica() {
        assertEquals("Atendente Nível 1", atendente.resolverChamado(new Chamado(TipoProblemaDuvida.getTipoProblemaDuvida())));
    }

    @Test
    void deveRetornarTecnicoParaProblemaDeConexao() {
        assertEquals("Suporte Técnico Nível 2", atendente.resolverChamado(new Chamado(TipoProblemaConexao.getTipoProblemaConexao())));
    }

    @Test
    void deveRetornarGerenteParaProblemaDeReembolso() {
        assertEquals("Gerente de Atendimento", atendente.resolverChamado(new Chamado(TipoProblemaReembolso.getTipoProblemaReembolso())));
    }

    @Test
    void deveRetornarSemSolucaoParaProblemaJuridico() {
        assertEquals("Sem solução - Encaminhado ao jurídico", atendente.resolverChamado(new Chamado(TipoProblemaJuridico.getTipoProblemaJuridico())));
    }


    @Test
    void deveTestarMudancaDeProblemaNoChamado() {
        Chamado chamado = new Chamado(TipoProblemaDuvida.getTipoProblemaDuvida());
        assertEquals("Atendente Nível 1", atendente.resolverChamado(chamado));

        chamado.setTipoProblema(TipoProblemaConexao.getTipoProblemaConexao());


        assertEquals("Suporte Técnico Nível 2", atendente.resolverChamado(chamado));
    }

    @Test
    void deveVerificarHierarquiaDeSuporteSuperior() {


        assertEquals(tecnico, atendente.getSuporteSuperior());
        assertEquals(gerente, tecnico.getSuporteSuperior());


        assertNull(gerente.getSuporteSuperior());
    }


}