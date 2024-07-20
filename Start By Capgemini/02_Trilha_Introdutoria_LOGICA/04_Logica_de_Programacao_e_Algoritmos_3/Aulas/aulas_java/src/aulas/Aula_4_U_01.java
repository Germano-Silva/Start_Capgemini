package aulas;

public class Aula_4_U_01 {
/**
 * Modificadores de Acesso:
 * Em Java, existem quatro modificadores de acesso que determinam a visibilidade
 * de classes, atributos, métodos e construtores:
 * 
 * public: O código pode ser acessado de qualquer lugar, ou seja, não há
 * restrições de acesso.
 * 
 * private: O código só pode ser acessado dentro da própria classe em que foi
 * declarado. Ele não pode ser acessado por classes ou objetos externos.
 * 
 * protected: O código pode ser acessado pela própria classe, por classes do
 * mesmo pacote (package) e por subclasses, mesmo que estejam em pacotes
 * diferentes.
 * 
 * Sem modificador (default/package-private): O código só pode ser acessado
 * dentro do mesmo pacote (package). Se nenhum modificador de acesso for
 * especificado, o acesso é permitido apenas para classes no mesmo pacote.
 * 
 * A tabela a seguir resume a visibilidade dos modificadores de acesso:
 * 
 * Modificador de Acesso    Classe     Pacote    Subclasse    Outro Pacote
 * public                   Sim        Sim       Sim          Sim
 * protected                Sim        Sim       Sim          Não
 * Sem modificador          Sim        Sim       Não          Não
 * private                  Sim        Não       Não          Não
 * 
 * É importante utilizar os modificadores de acesso de forma adequada para
 * garantir a encapsulação e a segurança do código. Uma boa prática é tornar
 * privados os atributos da classe e fornecer métodos públicos para acessá-los
 * (encapsulamento). Dessa forma, o acesso aos atributos é controlado e a
 * consistência dos dados é mantida.
 * 
 * Métodos Acessores:
 * Em Java, os métodos assessores são usados para acessar (ou ler) e alterar
 * (ou escrever) os valores dos atributos de uma classe. Eles são conhecidos
 * como "getters" e "setters".
 * 
 * O método acessor do tipo "setter" (ou "setNome") é usado para alterar o valor
 * do atributo "nome". Por exemplo, se você quisesse mudar o nome de uma pessoa,
 * você chamaria o método "setNome" passando o novo valor do nome como parâmetro.
 * 
 * Resumindo, os métodos assessores (getters e setters) são usados para ler e
 * alterar os valores dos atributos de uma classe de forma controlada,
 * garantindo a segurança e a integridade dos dados.
 */


}
