## Aula 02 - Sintaxe

#### Aula 2.A

![CSS e suas versões](assets/CSS3.png)

**1996** : A W3C (World Wide Web Consortium) publicou o CSS1, a primeira versão do CSS. Introduziu propriedades básicas para estilização de texto e layout, permitindo separar o conteúdo do design.

**1998** : O CSS2 foi lançado, expandindo as capacidades do CSS1. Incluía suporte para posicionamento absoluto, z-index, e mídia, como impressão, além de melhorias no layout e suporte para fontes.

**2001** : O CSS2.1 começou a ser desenvolvido como uma atualização ao CSS2, visando corrigir erros e melhorar a consistência. Tornou-se um padrão oficial em 2011.

**2011** : Iniciou-se o desenvolvimento do CSS3, que foi dividido em módulos para facilitar o avanço gradual. CSS3 trouxe muitos novos recursos, incluindo seletores avançados, gradientes, sombras, bordas arredondadas, e animações.

**2012** : A introdução do "flexbox" no CSS3 revolucionou a maneira como layouts complexos podem ser construídos, facilitando a criação de designs responsivos e flexíveis.

**2014** : O CSS Grid Layout foi publicado como parte do CSS3, oferecendo uma abordagem poderosa e flexível para criar layouts de página mais complexos e responsivos.

**2016** : O CSS4 começou a ser desenvolvido, mas, ao invés de uma nova versão, muitas das propostas foram incorporadas nas atualizações contínuas do CSS3. O foco continuou na evolução gradual e adição de novos recursos.

O CSS está em constante evolução, com novos recursos sendo adicionados em ciclos contínuos. A comunidade de desenvolvedores continua a trabalhar em melhorias e novas especificações para atender às necessidades emergentes do design web.

#### Aula 2.A

A sintaxe do CSS é relativamente simples e segue um padrão consistente:

1. **Seletores**: Identificam os elementos HTML que você deseja estilizar. Podem ser tags, classes, IDs ou outros tipos de seletores.

2. **Propriedades**: Especificam os aspectos do estilo que você deseja aplicar, como cor, tamanho, ou margem.

3. **Valores**: Definem o valor das propriedades, como uma cor específica ou uma medida em pixels.



Aqui está a estrutura básica de uma regra CSS:

```css
seletor {
  propriedade: valor;
}
```

**Exemplo:**

```css
/* Seleciona todos os parágrafos e define a cor do texto como azul */
p {
  color: blue;
}

/* Seleciona o elemento com id "main-header" e define a fonte como Arial e o tamanho como 24px */
#main-header {
  font-family: Arial, sans-serif;
  font-size: 24px;
}

/* Seleciona todos os elementos com a classe "button" e define o fundo como verde e o texto como branco */
.button {
  background-color: green;
  color: white;
}
```

**Componentes principais:**

- **Seletores**: Podem ser simples (como `p`, `.button`, `#main-header`) ou combinados (como `div > p`, `a:hover`).
  
- **Declarações**: Dentro das chaves `{}`, você coloca uma ou mais declarações. Cada declaração é uma combinação de uma propriedade e um valor.

- **Propriedades e Valores**: As propriedades são seguidas por dois pontos e, em seguida, o valor é definido, finalizado por um ponto e vírgula. 

Por exemplo:
```css
font-size: 16px;
color: red;
```

