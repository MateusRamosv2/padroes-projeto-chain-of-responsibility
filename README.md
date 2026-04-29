# Padrões de Projeto - Chain of Responsibility

---

## Estrutura do Projeto

- **Interface (Problema):** `TipoProblema` → Define o contrato base (assinatura) que todos os tipos de problemas do sistema devem seguir.
- **Classes Concretas (Tipos Específicos):** `TipoProblemaDuvida`, `TipoProblemaConexao`, `TipoProblemaReembolso` e `TipoProblemaJuridico` → Implementam a interface utilizando o padrão de projeto Singleton, garantindo que exista apenas uma instância em memória de cada tipo de problema.
- **Objeto de Requisição:** `Chamado` → Classe que encapsula a requisição do usuário, carregando consigo o tipo de problema que precisa ser resolvido.
- **Manipulador Abstrato (Handler Base):** `Suporte` → Classe abstrata que dita as regras do jogo. Ela gerencia a lista de problemas que cada nível sabe resolver, mantém a referência para o próximo elo da cadeia (`suporteSuperior`) e executa a lógica principal de repassar ou resolver o chamado no método `resolverChamado()`.
- **Manipuladores Concretos (Elos da Cadeia):** `SuporteAtendente`, `SuporteTecnico` e `SuporteGerente` → Herdam de `Suporte`, definem especificamente quais problemas têm autoridade para resolver em seus construtores e implementam suas descrições.
- **Testes:** `ChamadoTest` → Valida se os chamados estão escalando a hierarquia corretamente e atingindo os manipuladores adequados (ou falhando quando não há solução) com a biblioteca JUnit.

---

## Diagrama de Classes

Abaixo está o diagrama de classes representando a estrutura da implementação. O grande destaque é a relação de auto-referência na classe abstrata `Suporte`, ilustrando perfeitamente a passagem da responsabilidade adiante (o *chain*).

<img width="932" height="553" alt="Diagrama (chain-of-responsibility)" src="https://github.com/user-attachments/assets/7de7b795-2100-4a33-b3fc-d8abfbc4761c" />
