# Curso: Linguagem de Programação em JAVA

### Professor Marcelo

Bem-vindo ao curso de Linguagem de Programação em JAVA! Este curso foi desenvolvido para fornecer uma base sólida na programação Java, abrangendo desde conceitos fundamentais até tópicos avançados. Com as orientações do professor Marcelo, exploraremos as principais ferramentas e conceitos que fazem de Java uma das linguagens mais utilizadas no mundo, focando em resolver problemas, estruturar soluções e criar aplicações robustas e escaláveis. Nosso objetivo é capacitar você a desenvolver aplicações robustas e eficientes, utilizando as melhores práticas da linguagem.

## Índice

- [Aula 01 - Boas Vindas](#aula-01---boas-vindas)
- [Aula 02 - Interfaces](#aula-02---interfaces)
- [Aula 03 - Construtores](#aula-03---construtores)
- [Aula 04 - Enumeradores](#aula-04---enumeradores)
- [Aula 05 - Modificadores de acesso](#aula-05---modificadores-de-acesso)
- [Aula 06 - Matriz](#aula-06---matriz)
- [Aula 07 - Cobranças](#aula-07---cobranças)
- [Aula 08 - Tópicos avançados](#aula-08---tópicos-avançados)
- [Aula 09 - Genéricos](#aula-09---genéricos)
- [Aula 10 - Anotações](#aula-10---anotações)
- [Aula 11 - Fios](#aula-11---fios)
- [Aula 12 - Laços](#aula-12---laços)
- [Aula 13 - Trabalhando com dados](#aula-13---trabalhando-com-dados)
- [Aula 14 - Persistência de dados](#aula-14---persistência-de-dados)
- [Aula 15 - Exceções e controle de erros](#aula-15---exceções-e-controle-de-erros)
- [Aula 16 - Considerações finais](#aula-16---considerações-finais)

## Aula 01 - Boas Vindas

#### Aulas 1.A

- **Curso de Java Intermediário:**
  - Objetivo: Capacitar o aluno para desenvolver um projeto Java com atualização em banco de dados.
  - Revisão: Continuação do aprendizado iniciado no curso básico, com foco na orientação a objetos.

- **Conceitos Abordados:**
  - **Consultores**, **interfaces** e **numeradores**.
  - Manipulação de **arrays**.
  - Integração de Java com **banco de dados**.

- **Projeto Final:**
  - Desenvolvimento de um sistema utilizando uma única tabela.
  - Implementação de métodos para:
    - Acessar banco de dados.
    - **Incluir**, **alterar**, **excluir** e **consultar** elementos específicos.
    - **Consultar todos** os elementos de uma tabela.

- **Objetivo Final:** Possibilitar a aplicação prática dos conceitos aprendidos em um sistema funcional com banco de dados.

## Aula 02 - Interfaces

#### Aulas 2.A

- **Conceito de Interface:**
  - Uma **interface** é um elemento do Java, criado de forma similar a **classes** e **numeradores**.
  - Permite agrupar classes com características em comum.
  - **Diferencial:** Uma interface pode ser vinculada a várias classes, ao contrário da herança.

- **Funcionalidades de uma Interface:**
  - Define métodos comuns para classes relacionadas.
  - Métodos podem incluir ações ou propriedades compartilhadas.

- **Características das Interfaces:**
  - Contêm assinaturas de métodos e suas propriedades.
  - Classes vinculadas devem implementar os métodos com a **mesma assinatura**:
    - Mesmo nome.
    - Mesmo retorno.
    - Mesmos parâmetros.
  - Garante **reaproveitamento de código** e melhora a manutenibilidade e legibilidade do programa.

- **Assinaturas de Métodos:**
  - Devem ser idênticas entre a interface e as classes que a implementam.
  - Reforçam o princípio de **orientação a objetos** focado no **reaproveitamento de código**.

- **Benefícios:**
  - Programas mais **flexíveis** e **manuteníveis**.
  - Melhoria na **legibilidade** do código.

- **Próximos Passos:**
  - Demonstração de como criar interfaces e utilizá-las em situações práticas.

#### Aulas 2.B

- **O que uma interface deve ter:**
  - Nomeação clara e objetiva.
  - Declaração de métodos com assinaturas específicas, sem implementação.

- **Criação de Classes que Implementam a Interface:**
  - Classes utilizam a palavra-chave **implements** para implementar a interface.
  - Implementação obrigatória de todos os métodos declarados na interface.
  - Métodos nas classes devem ter:
    - Mesmo nome.
    - Mesmo tipo de retorno.
    - Mesmos parâmetros.

- **Uso de Notações:**
  - O **@Override** é adicionado automaticamente para identificar que o método foi sobrescrito.

- **Regras Importantes:**
  - Todos os métodos da interface devem ser implementados nas classes correspondentes.
  - O código gerado automaticamente pode ser ajustado para atender às especificações do projeto.

- **Benefícios do Uso de Interfaces:**
  - Promove organização e consistência no código.
  - Facilita a reutilização e a implementação de comportamentos comuns em várias classes.

## Aula 03 - Construtores

#### Aulas 3.A

- **O que são Construtores:**
  - São elementos presentes em todas as classes.
  - Toda classe possui pelo menos um **construtor padrão**.
  - Permitem a comunicação entre a parte externa da classe e seus métodos ou atributos.

- **Função dos Construtores:**
  - Atuam como um meio de ligação entre a parte externa e interna da classe.
  - Facilitam a inicialização de variáveis e atributos de uma classe.
  - Podem retornar uma, várias ou todas as variáveis de uma classe, conforme necessário.

- **Características:**
  - Utilizam a variável **this** para diferenciar valores recebidos e atributos da classe.
  - Reduzem o tráfego de atributos entre diferentes partes do programa.
  - São importantes para o gerenciamento de memória, sendo auxiliados pelo **Garbage Collector** para liberar memória quando não são mais utilizados.

- **Regras Importantes:**
  - Construtores são essenciais para a **instanciação** de classes.
  - Ajudam a evitar o uso desnecessário de memória ao limitar a quantidade de atributos trafegados.

- **Benefícios:**
  - Facilitam a **organização e encapsulamento** em classes.
  - Contribuem para uma melhor **eficiência no uso da memória**.

#### Aulas 3.B

- **Construtores com Sobrecarga:**
  - Permitem receber múltiplos parâmetros ao instanciar uma classe.
  - Podem ser gerados automaticamente utilizando IDEs como Eclipse.
  - Construtores sobrecarregados são úteis para inicializar diversos atributos em uma única chamada.

- **Funcionamento:**
  - Atributos são definidos dentro da classe e podem ser inicializados através dos parâmetros do construtor.
  - A variável **this** diferencia os atributos da classe dos valores recebidos pelo construtor.
  - Após a execução, os valores dos parâmetros são atribuídos aos atributos correspondentes.

- **Gerenciamento de Memória:**
  - Construtores não utilizados são descartados pelo **Garbage Collector**.
  - Variáveis são carregadas na memória apenas quando criadas.

- **Cálculo de Valores:**
  - Métodos dentro da classe podem ser chamados após a inicialização dos atributos para realizar cálculos.
  - Os métodos utilizam os valores armazenados nos atributos da classe.

- **Uso de Enumeradores:**
  - Enumeradores podem ser utilizados para definir valores específicos associados a atributos.
  - Ajudam a representar estados ou categorias, como "aprovado" ou "reprovado".

- **Regras Importantes:**
  - Todos os parâmetros definidos no construtor devem ser devidamente atribuídos aos atributos da classe.
  - Construtores são flexíveis e podem ser adaptados conforme a necessidade do programa.

- **Benefícios dos Construtores:**
  - Facilitam a troca de informações entre o método principal e as classes.
  - Melhoram a organização e a inicialização de variáveis dentro das classes.
  - São cruciais para garantir consistência e eficiência na manipulação de dados.

## Aula 04 - Enumeradores

#### Aulas 4.A

- **Enumeradores:**
  - Enumeradores são estruturas que permitem definir valores fixos associados a um atributo.
  - Ajudam a representar estados ou categorias com valores limitados e bem definidos.
  - Substituem tabelas de banco de dados para armazenar valores simples e repetitivos.

- **Criação de Enumeradores:**
  - Podem ser definidos dentro ou fora de uma classe.
  - Cada valor do enumerador é tratado como uma constante.
  - Exemplo de uso: `matriculado`, `pendente`, `reprovado`.

- **Funcionamento:**
  - Atributos da classe utilizam o enumerador como tipo de dado.
  - Ao atribuir valores, o enumerador fornece opções pré-definidas, facilitando o controle e a validação.

- **Benefícios dos Enumeradores:**
  - Melhoram a legibilidade do código ao substituir valores arbitrários por constantes nomeadas.
  - Facilitam a manutenção e evitam erros ao limitar as opções possíveis.
  - São amplamente utilizados para representar status ou condições específicas.

- **Regras Importantes:**
  - Enumeradores são imutáveis, ou seja, seus valores não podem ser alterados em tempo de execução.
  - Devem ser usados para categorias com um número fixo de opções.

- **Uso Prático:**
  - Permitem verificar e alterar o estado de atributos com base em condições do programa.
  - Podem ser exibidos ou manipulados diretamente no código com boa integração em IDEs.
  - Garantem que o programa seja mais eficiente e consistente.

- **Legibilidade e Flexibilidade:**
  - Enumeradores tornam o código mais claro e compreensível.
  - São úteis para estruturar programas com requisitos fixos e categorias predefinidas.

## Aula 05 - Modificadores de acesso

#### Aulas 5.A
- **Modificadores de Acesso:**
  - Definem o nível de acesso a classes, atributos e métodos em um programa Java.
  - São fundamentais para implementar **encapsulamento** e controlar a visibilidade de elementos.

- **Funções Principais:**
  - Garantir **segurança** e **controle** ao proteger informações sensíveis.
  - Melhorar a **organização** e a **manutenibilidade** do código.
  - Restringir ou permitir o uso de elementos conforme necessário.

- **Benefícios:**
  - Promovem **segurança** no acesso aos dados.
  - Facilitam o **encapsulamento** e a modularização do código.
  - Garantem que apenas partes relevantes do código sejam expostas.

- **Boas Práticas:**
  - Evitar uso desnecessário de **public** em atributos e métodos.
  - Manter consistência na aplicação dos modificadores para melhorar a clareza do código.

#### Aulas 5.B

- **Tipos de Modificadores de Acesso:**
  - **Private:** Maior nível de restrição, acesso permitido apenas dentro da própria classe.
  - **Default:** Acesso restrito ao mesmo pacote, aplicado automaticamente quando nenhum modificador é explicitado.
  - **Protected:** Permite acesso dentro do mesmo pacote e por subclasses, mesmo em pacotes diferentes.
  - **Public:** Menor nível de restrição, permite acesso de qualquer classe.

- **Níveis de Modificadores:**
  - **Nível Superior:**
    - Aplicável a **classes**.
    - Modificadores possíveis: **Public** e **Default**.
    - O **Default** é assumido quando nenhum modificador é definido explicitamente.
  - **Nível de Membro:**
    - Aplicável a **atributos** e **métodos**.
    - Modificadores possíveis: **Private**, **Default**, **Protected** e **Public**.
    - O **Default** é assumido automaticamente caso nenhum modificador seja declarado.

- **Ordem de Restrição:**
  - **Private** → **Default** → **Protected** → **Public**.
  - A visibilidade aumenta conforme o nível de acesso se torna menos restritivo.

- **Função dos Modificadores:**
  - Controlar a visibilidade e acessibilidade de elementos entre classes e pacotes.
  - Garantir **segurança** e **encapsulamento**, restringindo o uso indevido de atributos e métodos.

- **Regras Importantes:**
  - Sempre definir modificadores de acesso para evitar ambiguidade no código.
  - Utilizar **private** para dados sensíveis e expor apenas o necessário usando **getters** e **setters**.

#### Aulas 5.C

- **Modificador de Acesso Público (Public):**
  - Permite acesso irrestrito a atributos e métodos de uma classe.
  - Pode ser acessado de qualquer classe, independentemente do pacote.

- **Características:**
  - Compartilha informações entre classes relacionadas ou não.
  - Não há limitações de visibilidade em pacotes diferentes ou no mesmo pacote.
  - Permite instanciar e acessar atributos ou métodos de qualquer lugar.

- **Casos de Uso:**
  - Em uma classe, atributos ou métodos marcados como **public** podem ser acessados por outras classes sem restrição.
  - Exemplos comuns incluem métodos utilitários e atributos que precisam ser amplamente disponíveis.

- **Visibilidade do Modificador Public:**

| **Contexto**                              | **Visibilidade do Modificador Public** |
|-------------------------------------------|----------------------------------------|
| Classes derivadas no mesmo pacote         | Acessível                              |
| Classes derivadas em pacotes diferentes   | Acessível                              |
| Classes não relacionadas no mesmo pacote  | Acessível                              |
| Classes não relacionadas em pacotes diferentes | Acessível                          |

- **Regras Importantes:**
  - Usar com cautela, pois **public** expõe todos os detalhes sem restrições.
  - Deve ser aplicado apenas a elementos que precisam ser amplamente acessíveis.

- **Riscos:**
  - Reduz o encapsulamento e pode comprometer a segurança do programa.
  - Requer planejamento cuidadoso para evitar uso inadequado ou excessivo.

- **Benefícios:**
  - Simplifica o compartilhamento de funcionalidades entre diferentes partes do programa.
  - Facilita a reutilização de código em múltiplos contextos.

#### Aulas 5.D

- **Modificador de Acesso Protected:**
  - Define que atributos e métodos marcados como **protected** são acessíveis:
    - Dentro da mesma classe.
    - Por classes derivadas, mesmo que estejam em pacotes diferentes.
    - Por classes no mesmo pacote.

- **Características:**
  - Funciona como uma combinação entre os níveis **default** e **public**.
  - Permite visibilidade limitada para manter o encapsulamento em pacotes diferentes.
  - Classes não relacionadas, em pacotes diferentes, não têm acesso.

- **Casos de Uso:**
  - Utilizado para proteger atributos e métodos que devem ser acessíveis apenas por classes diretamente relacionadas.
  - Ideal para herança, permitindo que subclasses acessem elementos protegidos.

- **Visibilidade do Modificador Protected:**

| **Contexto**                              | **Visibilidade do Modificador Protected** |
|-------------------------------------------|-------------------------------------------|
| Classes derivadas no mesmo pacote         | Acessível                                 |
| Classes derivadas em pacotes diferentes   | Acessível                                 |
| Classes não relacionadas no mesmo pacote  | Acessível                                 |
| Classes não relacionadas em pacotes diferentes | Não acessível                         |

- **Regras Importantes:**
  - Classes no mesmo pacote têm acesso aos elementos **protected**.
  - Subclasses podem acessar elementos **protected** mesmo fora do pacote original.
  - Classes não relacionadas, em pacotes diferentes, não conseguem acessar.

- **Benefícios:**
  - Garante encapsulamento parcial, permitindo acesso controlado para herança.
  - Promove organização ao limitar acessos desnecessários em pacotes diferentes.

#### Aulas 5.E

- **Modificador de Acesso Private:**
  - É o modificador mais restritivo.
  - Permite acesso somente dentro da própria classe.
  - Nenhuma classe externa, mesmo no mesmo pacote, pode acessar diretamente atributos ou métodos privados.

- **Características:**
  - Garante total encapsulamento de atributos e métodos.
  - Torna obrigatória a instanciação da classe para acesso indireto aos seus elementos.
  - Atributos e métodos **private** podem ser expostos externamente apenas por meio de **getters**, **setters** ou construtores.

- **Funcionamento:**
  - Mesmo ao importar uma classe de outro pacote, atributos e métodos privados não são acessíveis.
  - Apenas elementos **public** ou com visibilidade compatível (como **protected**) podem ser acessados por classes relacionadas.

- **Casos de Uso:**
  - Para proteger informações sensíveis ou evitar manipulação direta de dados internos.
  - Permite maior controle sobre como os dados são manipulados.

- **Regras Importantes:**
  - Atributos ou métodos marcados como **private** só podem ser acessados pela própria classe.
  - Construtores, **getters** e **setters** são meios para expor dados de forma controlada.

- **Comparativo de Visibilidade:**
  | **Modificador** | **Mesma Classe** | **Mesmo Pacote** | **Subclasses (Pacotes Diferentes)** | **Classes Não Relacionadas** |
  |------------------|------------------|------------------|-------------------------------------|------------------------------|
  | Public           | Sim              | Sim              | Sim                                 | Sim                          |
  | Protected        | Sim              | Sim              | Sim                                 | Não                          |
  | Default          | Sim              | Sim              | Não                                 | Não                          |
  | Private          | Sim              | Não              | Não                                 | Não                          |

- **Benefícios:**
  - Garante o controle total sobre os dados internos da classe.
  - Melhora a segurança e a integridade do programa.
  - Promove boas práticas de encapsulamento, incentivando o uso de métodos controladores como **getters** e **setters**.

#### Aulas 5.F

- **Modificador de Acesso Default:**
  - Aplicado automaticamente quando nenhum modificador é explicitado.
  - Restringe o acesso aos elementos apenas dentro do mesmo pacote.

- **Características:**
  - Permite acesso entre classes e métodos que compartilham o mesmo pacote.
  - Não permite acesso por classes de pacotes diferentes, mesmo se forem relacionadas.
  - É mais restritivo que o **public**, mas menos que o **protected** e **private**.

- **Funcionamento:**
  - Atributos ou métodos sem um modificador declarado explicitamente assumem o **default**.
  - Classes dentro do mesmo pacote podem acessar atributos e métodos **default** sem restrições.
  - Classes fora do pacote original não têm acesso, mesmo que sejam subclasses.

- **Casos de Uso:**
  - Utilizado para organizar o acesso de elementos que devem ser visíveis apenas dentro de um contexto restrito (pacote).
  - Útil para programas que possuem pacotes claramente segmentados por funcionalidades.

- **Regras Importantes:**
  - O modificador **default** é o padrão quando não se especifica **public**, **protected** ou **private**.
  - É restritivo a classes do mesmo pacote e não é recomendado para elementos que precisam ser amplamente acessíveis.

- **Comparação com Outros Modificadores:**
  - O **default** é mais restritivo que o **public** e o **protected**, mas menos que o **private**.
  - A diferença é perceptível ao tentar acessar atributos ou métodos a partir de pacotes diferentes.

- **Benefícios:**
  - Mantém o encapsulamento parcial ao limitar o acesso ao escopo do pacote.
  - Facilita a organização e segurança em sistemas com múltiplos pacotes.

## Aula 06 - Matriz

#### Aulas 6.A

- **Arrays em Java:**
  - Estruturas fundamentais para armazenar e organizar dados.
  - Semelhantes a conceitos de listas e matrizes.

- **Objetivo:**
  - Facilitar o armazenamento e manipulação de múltiplos valores relacionados em uma única estrutura.

- **Características:**
  - Os arrays são sequências ordenadas.
  - Cada elemento do array pode ser acessado por sua posição, chamada de índice.

- **Importância:**
  - Proporcionam uma maneira eficiente de trabalhar com grandes volumes de dados.
  - Fundamentais para a lógica de programação e organização de dados em Java.

#### Aulas 6.B

- **Arrays em Java:**
  - Estruturas de dados utilizadas para armazenar múltiplos valores do mesmo tipo.
  - Divididos em **unidimensionais** (vetores) e **multidimensionais** (matrizes).

- **Criação de Arrays:**
  - Requer a definição do tipo de dado, nome do array e alocação de memória usando `new`.
  - O tamanho do array é fixo e definido no momento de sua criação.
  - Exemplo básico:
    - `int[] numeros = new int[4];` (array com quatro posições).

- **Atributos e Funcionamento:**
  - Os índices começam em **0** e vão até o tamanho do array menos um.
  - Cada posição do array armazena um valor específico do tipo declarado.
  - Acessar índices fora do limite resulta em um erro (**ArrayIndexOutOfBoundsException**).

- **Inicialização de Arrays:**
  - **Imediata:** Valores são definidos no momento da declaração.
    - Exemplo: `int[] valores = {12, 32, 64, 6, 8};`.
  - **Posterior:** A memória é alocada e os valores atribuídos posteriormente.
    - Exemplo:
      - `int[] meuArray;`
      - `meuArray = new int[10];`.

- **Utilização:**
  - Ideal para armazenar dados sequenciais ou estruturados de maneira eficiente.
  - Pode ser usado em combinação com laços como **for** para iterar sobre seus elementos.

- **Erros Comuns:**
  - Acessar posições que não existem no array.
  - Não inicializar o array antes de utilizá-lo.

- **Vantagens:**
  - Permite organizar e acessar dados de forma sequencial.
  - Estrutura simples e eficiente para trabalhar com volumes fixos de dados.

#### Aulas 6.C

- **Inicialização Padrão de Arrays:**
  - Elementos de arrays recebem valores padrão se não forem inicializados explicitamente:
    - **Numéricos:** Inicializados com `0`.
    - **Booleanos:** Inicializados com `false`.
    - **Referências:** Inicializadas com `null`.

- **Inicialização Personalizada:**
  - Arrays podem ser inicializados com valores específicos no momento da criação.
  - Exemplo: `String[] paises = {"Brasil", "Alemanha", "Itália", "Polônia"};`.

- **Iteração sobre Arrays:**
  - O loop **for-each** é uma forma eficiente de iterar sobre os elementos de um array.
    - Exemplo básico:
      ```java
      for (String pais : paises) {
          System.out.println(pais);
      }
      ```
  - O laço percorre os elementos do array automaticamente, parando quando todos os itens são acessados.

- **Indexação em Arrays:**
  - Outra forma de iterar é utilizando um índice para acessar posições específicas do array.
  - Essa abordagem permite modificar elementos diretamente no array.

- **Práticas com Arrays:**
  - Inicializar arrays interativamente (como entrada do usuário).
  - Alterar valores armazenados em posições específicas.
  - Explorar diferentes abordagens para manipular e listar elementos.

- **Vantagens de Iteração com Arrays:**
  - **For-each:** Simplicidade e legibilidade.
  - **Indexador:** Maior controle sobre índices e valores individuais.

#### Aulas 6.D

- **Manipulação de Arrays em Java:**
  - Arrays são estruturas de dados que armazenam múltiplos valores do mesmo tipo.
  - Permitem tanto inicialização direta quanto inserção de dados de forma iterativa.

- **Declaração e Inicialização de Arrays:**
  - Podem ser declarados com tamanho fixo e valores iniciais:
    - Exemplo: `String[] paises = new String[4];`.
  - Valores podem ser atribuídos diretamente ou por meio de interação com o usuário.

- **Iteração sobre Arrays:**
  - Utiliza-se laços como **for** para preencher ou listar os valores.
  - O índice começa em **0** e vai até o tamanho do array menos um.
  - O laço **for** facilita a navegação e manipulação dos elementos.

- **Alteração de Valores em Arrays:**
  - É possível modificar valores específicos indicando a posição desejada.
  - Exemplo: `array[2] = novoValor;`.

- **Erros Comuns e Prevenção:**
  - Tentar acessar posições inexistentes gera uma exceção (**ArrayIndexOutOfBoundsException**).
  - Garantir que o índice utilizado esteja dentro do limite definido.

- **Boas Práticas:**
  - Utilizar comentários para descrever a funcionalidade de partes importantes do código.
  - Evitar a duplicação de lógica e manter a legibilidade do código.

- **Benefícios:**
  - Permitem organização de dados de maneira sequencial e eficiente.
  - Suportam cálculos e manipulações diretas em valores armazenados.
  - Oferecem flexibilidade para inicialização e alteração conforme necessidade.

#### Aulas 6.E

- **Matrizes (Arrays Bidimensionais) em Java:**
  - Representam **vetores de vetores**, ou seja, arrays contendo outros arrays.
  - Utilizadas para organizar dados em linhas e colunas, como tabelas ou planilhas.

- **Criação de Matrizes:**
  - Declaradas com dois conjuntos de colchetes.
    - Exemplo: `float[][] notas = new float[3][4];`.
    - **3 linhas** e **4 colunas** no exemplo acima.
  - Cada posição é acessada por dois índices: `[linha][coluna]`.

- **Funcionamento:**
  - Permite armazenar dados como em um boletim:
    - Cada linha representa um aluno.
    - Cada coluna representa uma nota.
  - Exemplo:
    - `notas[0][0]`: Primeira nota do primeiro aluno.
    - `notas[1][2]`: Terceira nota do segundo aluno.

- **Iteração com Matrizes:**
  - Utiliza dois laços **for** aninhados:
    - O **for externo** itera sobre as linhas.
    - O **for interno** itera sobre as colunas.
  - Exemplo:
    ```java
    for (int i = 0; i < alunos.length; i++) {
        for (int j = 0; j < notas[i].length; j++) {
            // Processar cada nota
        }
    }
    ```

- **Cálculo e Condições:**
  - Calcular a média de cada aluno somando as notas e dividindo pelo número de colunas.
  - Regras para definir o status do aluno:
    - Média maior ou igual a 7.5: **Aprovado**.
    - Média entre 5.5 e 7.5: **Recuperação**.
    - Média menor que 5.5: **Reprovado**.

- **Boletins e Resultados:**
  - Para cada aluno:
    - Imprimir o nome, notas, média e status (Aprovado, Recuperação ou Reprovado).
  - Exemplo de saída:
    ```
    Aluno: João
    Nota 1: 8
    Nota 2: 8
    Nota 3: 8
    Nota 4: 8
    Média: 8
    Status: Aprovado
    ```

- **Boas Práticas:**
  - Inicializar variáveis como somatórios dentro do laço externo para evitar contaminação entre alunos.
  - Usar comentários para descrever a lógica de cálculo e iteração.

- **Benefícios de Matrizes:**
  - Organizam dados de forma estruturada e eficiente.
  - Facilmente iteráveis com laços aninhados.
  - Permitem a representação de relacionamentos entre conjuntos de dados.


## Aula 07 - Cobranças

#### Aulas 7.A

- **Collections em Java:**
  - **Introdução ao Tema:**
    - As **Collections** são interfaces que fornecem estruturas de dados dinâmicas e flexíveis.
    - Permitem manipular listas, mapas e conjuntos de forma eficiente.
    - São amplamente utilizadas para substituir arrays fixos e oferecem métodos prontos para manipulação.

- **O que será abordado:**
  - **Listas (List):**
    - Estruturas que armazenam elementos ordenados e permitem duplicatas.
  - **Mapas (Map):**
    - Associam chaves únicas a valores, facilitando buscas.
  - **ArrayList:**
    - Lista dinâmica baseada em arrays.
    - Oferece funcionalidades como adição, remoção, alteração e busca de elementos.
    - Integra métodos úteis para manipulação de dados e controle de posições.

- **Objetivo do Estudo:**
  - Explorar a flexibilidade e as funcionalidades do **ArrayList**.
  - Demonstrar como localizar, modificar e substituir elementos em um **ArrayList**.
  - Mostrar como as **Collections** tornam a manipulação de dados mais prática e eficiente.

#### Aulas 7.B

- **Collections no Java:**
  - As Collections são estruturas de dados dinâmicas que permitem manipular e organizar objetos de maneira eficiente.
  - A interface **Collection** fornece métodos gerais para operações como adição, remoção, busca e iteração de elementos.

- **Diferentes Implementações de Lists:**
  - **ArrayList:**
    - Otimizado para acesso e manipulação no meio da lista.
    - Similar a arrays, mas com tamanho ajustável dinamicamente.
  - **LinkedList:**
    - Ideal para operações nas extremidades (início e fim da lista).
    - Baseada em nós ligados, o que facilita inserções e remoções.

- **Características de ArrayList:**
  - Permite adicionar elementos sem um tamanho pré-definido.
  - Oferece métodos como `add()`, `remove()`, `get()`, e `set()`.
  - Dinamicamente ajustável:
    - Exemplo: O tamanho inicial pode ser 10, mas cresce conforme elementos são adicionados.
  - Integra-se bem com laços como **for**, utilizando métodos como `size()` para determinar o tamanho atual.

- **Diferença entre Arrays e ArrayList:**
  - **Arrays:**
    - Tamanho fixo, definido no momento da criação.
    - Menor flexibilidade para adicionar ou remover elementos.
  - **ArrayList:**
    - Tamanho ajustável dinamicamente.
    - Oferece maior flexibilidade e métodos para manipulação.

- **Vantagens das Lists em Collections:**
  - Evitam a necessidade de definir tamanhos fixos.
  - Permitem localizar e modificar elementos facilmente.
  - Suportam operações dinâmicas como adição e remoção em qualquer posição.

- **Próximos Passos:**
  - Praticar o uso de **ArrayList** com métodos dinâmicos.
  - Explorar a utilização de **LinkedList** e compreender suas diferenças.

#### Aulas 7.C

- **Uso Prático do ArrayList:**
  - Estrutura dinâmica que substitui arrays tradicionais com maior flexibilidade.
  - Permite operações como adição, remoção, modificação e busca de elementos.

- **Criação e Configuração:**
  - Declarado utilizando a **estrutura de diamante** para especificar o tipo:
    - Exemplo: `ArrayList<String> carros = new ArrayList<>();`.
  - Requer importação da classe `java.util.ArrayList`.

- **Principais Métodos do ArrayList:**
  - **add(element):** Adiciona um elemento ao final da lista.
  - **add(index, element):** Insere um elemento em uma posição específica.
  - **get(index):** Retorna o elemento na posição especificada.
  - **set(index, element):** Substitui o elemento em uma posição específica.
  - **remove(element):** Remove o primeiro elemento encontrado que corresponda ao valor.
  - **size():** Retorna o tamanho atual da lista.
  - **clear():** Remove todos os elementos da lista.
  - **contains(element):** Verifica se um elemento existe na lista.
  - **indexOf(element):** Retorna a posição do elemento especificado.

- **Características:**
  - Elementos são armazenados na ordem de inserção.
  - O tamanho da lista é ajustado automaticamente conforme elementos são adicionados ou removidos.

- **Exemplo de Operações:**
  - **Adicionar elementos:**
    ```java
    carros.add("Fusca");
    carros.add("Sandero");
    ```
  - **Substituir elementos:**
    ```java
    carros.set(1, "BMW");
    ```
  - **Remover elementos por valor:**
    ```java
    carros.remove("Fusca");
    ```
  - **Buscar elementos e modificar dinamicamente:**
    - Utilizando um laço `for` para localizar e alterar elementos.

- **Iteração e Verificação:**
  - O método `for` é utilizado para percorrer os elementos com base no tamanho da lista (`size()`).
  - Permite buscas e alterações dinâmicas baseadas no conteúdo ou posição dos elementos.

- **Tratamento de Casos Específicos:**
  - Implementação de lógica condicional para situações em que elementos não sejam encontrados.
  - Uso de métodos como `contains()` para evitar operações em elementos inexistentes.

- **Benefícios do ArrayList:**
  - Evita a necessidade de pré-definir tamanhos como em arrays.
  - Oferece maior flexibilidade com métodos integrados para manipulação eficiente.
  - Simples de integrar com interfaces gráficas ou métodos que interajam com o usuário.

#### Aulas 7.D

- **LinkedList em Java:**
  - Estrutura de dados dinâmica similar ao **ArrayList**.
  - Especializada para operações nas extremidades (início e fim da lista).

- **Diferenciais do LinkedList:**
  - Otimizado para inserções e remoções nas pontas.
  - Oferece métodos específicos como `addFirst()`, `addLast()`, `removeFirst()`, e `removeLast()`.

- **Comparação com ArrayList:**
  - **LinkedList:** Melhor performance em operações nas extremidades.
  - **ArrayList:** Melhor performance em acessos e manipulações na parte central da lista.

#### Aulas 7.E

- **LinkedList em Java:**
  - Estrutura de dados dinâmica especializada em manipulação de elementos nas extremidades.
  - Compartilha características com o **ArrayList**, mas com foco em operações no início e fim da lista.

- **Criação do LinkedList:**
  - Declaração semelhante ao **ArrayList**, utilizando a estrutura de diamante:
    ```java
    LinkedList<String> carros = new LinkedList<>();
    ```
  - Requer importação da classe `java.util.LinkedList`.

- **Principais Métodos do LinkedList:**
  - **Inserções:**
    - `addFirst(element)`: Adiciona um elemento no início.
    - `addLast(element)`: Adiciona um elemento no fim.
    - `add(index, element)`: Insere em uma posição específica.
  - **Remoções:**
    - `removeFirst()`: Remove o primeiro elemento.
    - `removeLast()`: Remove o último elemento.
  - **Acessos:**
    - `getFirst()`: Retorna o primeiro elemento.
    - `getLast()`: Retorna o último elemento.
    - `get(index)`: Retorna o elemento em uma posição específica.
  - **Outros Métodos:**
    - `clear()`: Remove todos os elementos da lista.
    - `isEmpty()`: Verifica se a lista está vazia.

- **Exemplo de Operações:**
  - Inserção de elementos:
    ```java
    carros.addFirst("Mazda");
    carros.addLast("Bugatti");
    ```
  - Remoção de elementos:
    ```java
    carros.removeFirst();
    carros.removeLast();
    ```
  - Acessar elementos:
    ```java
    String primeiroCarro = carros.getFirst();
    String ultimoCarro = carros.getLast();
    ```

- **Comparação com ArrayList:**
  - **LinkedList:**
    - Melhor para operações frequentes de inserção e remoção nas extremidades.
  - **ArrayList:**
    - Mais eficiente para acesso e manipulação de elementos no meio da lista.

- **Finalização:**
  - Os métodos de `LinkedList` permitem flexibilidade em diferentes contextos, mesmo compartilhando funções comuns com o **ArrayList**, como `clear()` e `isEmpty()`.

## Aula 08 - Tópicos avançados

#### Aulas 8.A

- **Próximos Tópicos em Java:**
  - **Genéricos (Generics):**
    - Ferramentas que permitem criar classes, interfaces e métodos que trabalham com tipos parametrizados.
    - Garantem maior segurança e flexibilidade ao lidar com diferentes tipos de dados.

  - **Anotações (Annotations):**
    - Metadados que fornecem informações ao compilador ou ao tempo de execução.
    - Amplamente utilizados em frameworks e bibliotecas Java.

  - **Threads (Multithreading):**
    - Técnicas para executar várias tarefas simultaneamente dentro de um programa.
    - Cruciais para aplicações que requerem desempenho e paralelismo.

- **Objetivo do Estudo:**
  - Explorar conceitos avançados para melhorar a escrita, organização e execução de programas Java.
  - Demonstrar como Genéricos, Anotações e Threads tornam o código mais robusto e eficiente.

#### Aulas 8.B

- **Classes Wrapper em Java:**
  - São classes disponíveis no pacote **java.lang**, que encapsulam tipos primitivos em objetos.
  - Permitem conversões e operações avançadas com tipos primitivos.

- **Tipos e Correspondências:**
  - **Lógicos:** `boolean` → `Boolean`.
  - **Caractere:** `char` → `Character`.
  - **Numéricos Integrais:**
    - `byte` → `Byte`.
    - `short` → `Short`.
    - `int` → `Integer`.
    - `long` → `Long`.
  - **Numéricos Flutuantes:**
    - `float` → `Float`.
    - `double` → `Double`.

- **Vantagens das Classes Wrapper:**
  - Realizam conversões entre tipos primitivos e objetos de forma eficiente.
  - Facilitam operações complexas como cálculos, formatações e comparações.
  - Permitem o uso de métodos utilitários, como `parse` e `toString`.

- **Boxing e Unboxing:**
  - **Boxing:** Converte um tipo primitivo em um objeto Wrapper.
    - Exemplo: `Integer numero = Integer.valueOf(5);`.
  - **Unboxing:** Converte um objeto Wrapper de volta para o tipo primitivo.
    - Exemplo: `int numero = Integer.parseInt("5");`.

- **Automação de Boxing e Unboxing:**
  - O compilador realiza essas conversões automaticamente quando necessário:
    - **Auto-boxing:** De primitivo para Wrapper.
    - **Auto-unboxing:** De Wrapper para primitivo.

- **Aplicação Prática:**
  - Uso comum em coleções e métodos que exigem objetos, como listas (`ArrayList`).
  - Permitem manipular tipos primitivos como objetos, adicionando flexibilidade ao código.

- **Exemplo de Conversão com Classes Wrapper:**
  ```java
  int numero = 10;
  Integer wrapperNumero = numero; // Auto-boxing
  int primitivoNumero = wrapperNumero; // Auto-unboxing
  ```

- **Importância:**
  - Facilita a manipulação de dados em estruturas complexas e métodos avançados.
  - Oferece eficiência e conveniência, especialmente em laços e expressões complexas.

#### Aulas 8.C

- **Implementação de Classes Wrapper:**
  - As **classes wrapper** encapsulam tipos primitivos, permitindo utilizá-los como objetos.
  - São amplamente utilizadas para conversões de tipos primitivos para objetos e vice-versa.

- **Uso de Classes Wrapper:**
  - **Boolean, Character, Integer, Float, Double, etc.**
    - Representam os tipos primitivos correspondentes como objetos.
    - Possuem métodos utilitários como `parse` e `valueOf` para conversões e manipulações.

- **Exemplo Prático:**
  - Conversão de uma **String** para um tipo primitivo utilizando **Integer.parseInt**:
    ```java
    String numeroTexto = "1";
    int numero = Integer.parseInt(numeroTexto); // Conversão para int
    numero = numero + 1; // Operação com o valor convertido
    System.out.println(numero); // Saída: 2
    ```

- **Boxing e Unboxing na Implementação:**
  - **Boxing:** O valor primitivo é encapsulado em um objeto wrapper.
  - **Unboxing:** O objeto wrapper é convertido de volta para um tipo primitivo.
    - Exemplo:
      ```java
      Integer numeroWrapper = Integer.valueOf(10); // Boxing
      int numeroPrimitivo = numeroWrapper; // Unboxing
      ```

- **Vantagens:**
  - Permitem manipular tipos primitivos em estruturas de dados que exigem objetos, como **ArrayList**.
  - Facilitam operações complexas, como conversões e manipulação em coleções.
  - Integram métodos utilitários para facilitar cálculos e transformações.

- **Considerações:**
  - As classes wrapper são essenciais para trabalhar com dados em Java modernos.
  - Serão frequentemente usadas em operações com coleções e manipulação de dados no decorrer do curso.

## Aula 09 - Genéricos

#### Aulas 9.A
#### Aulas 9.B

## Aula 10 - Anotações

#### Aulas 10.A
#### Aulas 10.B

## Aula 11 - Fios

#### Aulas 11.A
#### Aulas 11.B

## Aula 12 - Laços

#### Aulas 12.A
#### Aulas 12.B

## Aula 13 - Trabalhando com dados

#### Aulas 13.A
#### Aulas 13.B
#### Aulas 13.C
#### Aulas 13.D

## Aula 14 - Persistência de dados

#### Aulas 14.A
#### Aulas 14.B
#### Aulas 14.C
#### Aulas 14.D
#### Aulas 14.E
#### Aulas 14.F
#### Aulas 14.G
#### Aulas 14.H
#### Aulas 14.I
#### Aulas 14.J
#### Aulas 14.K
#### Aulas 14.L
#### Aulas 14.M
#### Aulas 14.N

## Aula 15 - Exceções e controle de erros

#### Aulas 15.A
#### Aulas 15.B
#### Aulas 15.C

## Aula 16 - Considerações finais

#### Aulas 16.A
