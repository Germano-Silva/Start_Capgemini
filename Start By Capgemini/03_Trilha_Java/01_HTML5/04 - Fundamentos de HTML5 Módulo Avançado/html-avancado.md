## Aula 02 - Apresentação do Curso

##### **HTML Avançado**

* Onpage SEO
* Boas particasde acessibilidade
* Segurança
* PWA
* Web Components

## Aula 03 - SEO Onpage

#### **Aula 3.A**

###### **Onpage SEO**

* Não confunda com site ONEPAGE!
* Não tem relação com colocar palavras-chave no código (meta name="keywords"), isso não se usa mais. Era usado para interpretar a relevância do sites, mas isso fazia que os desenvolvedores colocasse palavras chaves irrelevantes para usuário.
* Diferente do outbound (panfleto, telemarketing), vai oferece a explicação e conteudo e depois oferece o produto.
* Há tanto o Onpage quanto o Offpage
* O Onpage é que está no seu site, que vou mostrar a seguir.
* O Offpage é o que está fora, como o que os outros sites falam de você, onde é citado.
* Se falam do seu site em outros sites de boa relevância, sua relevância sobe, se estiver em sites de baixa relevância, seu site cai.
* Há empresas que colocam no nome da concorrência em sites de baixa relevância para que eles caiam, essa prática não é correta.

#### **Aula 3.B**

###### **Onpage SEO**

**SEO (6 principais)**

* URL Amigável
* Meta title
* Meta description
* Site map
* Título da página
* Conteúdo de texto

#### **Aula 3.C**

**Título da página**

* Não tem limite de caracteres, mas não exagere, é o >
* Meta title/SEO title
* Não é o título da página.
* Também é o título da aba.
* Deve ter no máximo 70 caracteres.
* Tag `<title>` dentro do `<head>`.

#### **Aula 3.D**

**Meta description**

* Deve conter o resumo da página.
* Usa-se call to Action (verbo no imperativo).
* Deve ter no máximo 1 60 caracteres.
* `<meta name= "description" content= "XPTO">`

#### **Aula 3.E**

**URL Amigável**

* Incluir palavras-chave, sem caracteres especiais.
* Separar por hífen.

#### **Aula 3.F**

**Sitemap**

* Arquivo XML com todas as páginas do site.
* Facilita para que você não precise esperar o Crawler do Google encontrar o seu site para ser analisado, você manda direto para o servidor. A partir disso o Google lá começa analisar para definir o posicionamento.

#### **Aula 3.G**

**Imagens**

* Coloque texto ALT e descrição da imagem.
* Sempre salve com nome otimizado, nunca com nome aleatório.
* `<img src="camisa-gola-poslo.jpg" alt="camisa azul gola polo">`
* Opcionalmente, você pode colocar um title na sua imagem para quando o usuário passar o mouse.

  ![](https://i.sstatic.net/hFRDK.png)

#### **Aula 3.H**

**Campos únicos**

* São os dados relacionados ao SEO, como o meta title.
* Não devem ser copiados de outras empresas.
* Não devem ser copiados de outras partes do seu site.

#### **Aula 3.I**

**Conteúdo**

* Ser Original.
* Ter qualidade.
* Ter relevância para o tema abordado.

#### **Aula 3.J**

**Hiperlinks**

* Use, quando possível, links para outras páginas suas que corrobore com o texto e crie interatividade.
* Neste caso, são os links que vão para páginas, que muitas vezes explicam algum ponto abordado.

#### **Aula 3.K**

**Intertítulos `<h2>`**

* Facilita a leitura do texto.
* Organiza o conteúdo.Intertítulos `<h2>`.
* Facilita a leitura do texto.
* Organiza o conteúdo.

#### **Aula 3.L**

**Outros pontos são:**

* Moblile-friendliness.
* Velocidade de carregamento.
* Legibilidade (fácil leitura).
* Inexistência de erros.
* Segurança.
* Entre outros (são 200 pontos).

## Aula 04 - Boas práticas de acessibilidade

#### **Aula 4.A**

**BOAS PRÁTICAS DE ACESSIBILIDADE MOZILLA FOUNDATION**

* Visa aumentar a facilidade de acesso ao seu site ou software web.
* Precisa pensar de forma que todos possam acessar o conteúdo.

#### **Aula 4.B**

* Aplicações acessíveis independente de capacidade auditivas, visuais, físicas ou congnitivas.
* Deve ser acessível por:
  * Teclado.
  * Mouse.
  * Touch screen.
  * Comandos de voz.

#### **Aula 4.C**

* Sites seguros do ponto de vista de saúde, exemplos:
  * Sem cores não pensadas.
  * Sem telas piscantes que prejudicam epiléticos.
  * Sem item que podem causar dor de cabeça.

#### **Aula 4.D**

**Site com documentação:**
[MDN Web Docs (antes era MDN - Mozilla Developer link)](https://developer.mozilla.org/pt-BR/docs/Learn/Accessibility/HTML)

#### **Aula 4.E**

[Multimídia acessível](https://developer.mozilla.org/en-US/docs/Learn/Accessibility/Multimedia)

#### **Aula 4.F**

[Acessibilidade móvel](https://developer.mozilla.org/en-US/docs/Learn/Accessibility/Moble)

#### **Aula 4.G**

[CSS e JavaScript - melhores prátias de acessibilidade](https://developer.mozilla.org/en-US/docs/Learn/Accessibility/CSS_and_JavaScript)

#### **Aula 4.H**

[Google Mobile Friendly](https://search.google.com/test/mobile-friendly)

#### **Aula 4.I**

* **As vantagens de um site acessível e com boa semântica podem ser:**
  * Bom para SEO.
  * Boa usabilidade em dispositivos móveis.
  * Fácil de ser desenvolvido.
    ➡️ Aumenta a audiência do site e com isso os ganhos.

## **Aula 05 - Segurança**

#### **Aula 5.A**

* **Segurança**
  * SSL/TLC
  * CORS
  * CSP
  * OWASP Top 10

#### **Aula 5.B**

* **SSL**
  * Protocolo de Camada de Sockets Segura (Secure Sockets Layer).
  * Há também o TLS (Segurança da Camada de Transporte/ Transport Layer
  * Alguns consideram o SSL depreciado e sugerem o uso do TLS.
  * É um protocolo criptografado que permite ter mais segurança de comunicação para acessar um ambiente virtual como páginas web ou e-mail.
  * Os dados são criptografados, impossibilitando outras pessoas de utilizar.
  * Geralmente o usuário pode escolher em usar sem o protocolo de segurança (http) ou com (https).
  * A instalação é feita normalmente através do servidor contratado, alguns comuns e alguns oferecem versões pagas e gratuitas.
  * No WordPress há plugins para esta funcionalidade.

#### **Aula 5.C**
* **CORS**
  * Cross-origin Resource Sharing ou compartilhamento de recursos de origem cruzadas de origens diferentes.
  * É um mecanismos que usa cabeçalhos adicionais HTTP para permitir que um WebApp seja executado numa origem/domínio com permissão para acessar recursos pré-selecionados de um outro servidor.
  * Executa requisição Cross-origin HTTP ao solicitar um recurso de origem diferente, podendo ser domínio ou protocolo ou porta diferente da origem.
  * Pode ocorrer nos testes que utilizamos recursos em portas diferentes: http://localhost:3000/ e http://localhost:3001/
  * Ou usar recursos de outros domínios dentro do nosso WebApp, como imagens estão no nosso domínio.
#### **Aula 5.D**

* **CORS: Possíveis erros:**
  * Erros mais comuns são com as requisições Javascript que utilizam XMLHttpRequest ou Fetch APIs.
  * XMLHttpRequest são objetos usados para interagir entre servidores, indo de obtenção/recuperação de dados dentro de uma URL até atualização completa.
  * Fetch APIs são interfaces para buscar recursos, usada para acessar e manipular HTML, com requests e responses obiects.
  * Erros de CSS Shapes.
  * Erros de carregamentos de imagens.

#### **Aula 5.E**

* **CORS: Algumas soluções:**
  * Geralmente os problemas são causados por ausência de header. Exemplos:
    * Header set Access-Control-Allow-Origin: https://google.com.br
    * Header set Access-Control-Allow-Methods: POST, GET
    * Header set Access-ControI-AIIow-Headers: * /*Podendo ser Accept para burlar restrições adicionais* /
    * Header set Access-Control-Max-Age: 86400 /*tempo de manutenção da cache*/
    * Há a opção também de fazer esta configuração no servidor web (Exemplo Apache).
    * A forma de usar depende da ferramenta que está usando, se for Express, a documentação é: http://expressis.com/en/resources/middleware/cors.html

#### **Aula 5.F**

**CSP**

* Content Security Policy, ou Politica de Segurança de Conteúdo.
* É uma camada adicional de segurança, visando detectar e amenizar alguns tipos de ataque, como injeção de dados e Cross Site Scripting/XSS.
  * Geralmente estes ataques baseiam-se em ir em algum formulário e inserir JavaScript para obter alguma vantagem, como roubo de dados ou distribuição de malwer.
* Para habilitar, usamos a seguinte linha no `<head>`:
   `<meta http-equiv="Content-Security-PoIicy" content="default-src 'self'; img-src https://* child-src'none';">`
* Guia completo: https://content-security-policy.com/

#### **Aula 5.G**

**Análise Observatory Mozilla**

* Podemos analisar o site sobre este ponto através do https://observatory.mozilla.org.
* Este site nos dá uma nota e a análise completa do que foi testado.
* Através da análise, o site nos indica sugestões de melhoria.

#### **Aula 5.H**
**OWASP Top 10**
* Open Web Application Security Project, ou Projeto Aberto de Segurança em Aplicações Web.
* É um documento de conscientização para segurança de sites e aplicações web.
* Aponta as principais falhas de segurança, apontados por vários especialistas de vario lugares.
#### **Aula 5.I**
Tem também o OWASP Top 1 0 de controles preventivos.
Site com toda a documentação https://owasp.org/www-proiect-top-ten/ e em português tem um pdf: https://wiki.owasp.org/images/O/06/OWASP_Top_10-2017-pt_pt.pdf (visitar também página 23) - https://owasp.org/Top10/pt_BR/.

## Aula 06 -PWA

#### **Aula 6.A**

**Progressive Web App**
  * É basicamente uma página web, ou seja, um site com cara de app.
  * Pode ser desenvolvido para se comportar como um app nativo.
  * Se o browser não suportar um recurso, só não irá ter o recurso, mas o resto funciona.
  * Instalar ou não, a escolha é do usuário.
  * Usado por Twitch, Facebook, Twiter e Uber, por exemplo.

#### **Aula 6.B**

**Vantagens:**

* Poucas alterações fonte.
* Permite o uso de HTML/CSS/Javascript.
* Acesso à API's como câmera, microfone e localização.
* Aplicações leves.
* Envio de notificações push (alertas ou pop-up de sites ou apps, abas ou não).
* Pode ser usado offline.
* Multiplataforma (IOS, Androide, SmartTVs, MacOS, Linux, Windows).

#### **Aula 6.C**

**Desvantagens:**

* Não fica disponível nas loias do sistema operacional.
* Se a aplicação for pesada, pode ficar lento.
* Acesso limitado ou inexistente à alguns recursos: https://whatwebcando.today/ [mostrar recursos].
* Pode funcionar de forma diferentes quando usa diferentes.

#### **Aula 6.D**

**APP SHELL**

É o mínimo de HTML, CSS e JavaScript que alimenta uma interface de usuário. Entre as premissas, estão:
* Carregamento rápido.
* Ter armazenamento em cache.
* Ter exibição dinâmica de conteúdo.

**A arquitetura do app Shell leva em consideração os seguintes pontos:**

* Priorização do carregamento inicial, ou seja, o service worker armazenará cache dos itens básicos para economizar tempo de carregamento.
* Carregamento assíncrono visando já montar de forma rápida o aplicativo. Uso de cache é bem-vindo.
* Usar ferramentas confiáveis de gerenciamento de conteúdo estático para armazenar e atualizar cache.
#### **Aula 6.E**
Vamos instalar o serviceworker.

`npm install serviceworker`

Depois vamos incluir o serviceWorker:
```
<script>
    if ('serviceWorker' in navigator) {
    navigator.serviceWorker.register('generate-sw.is');
    }
</script>
```

#### **Aula 6.F**

* **Criar arquivo manifest.ison**
  * Exemplo de gerador de arquivo Manifest:
    * https://app-manifest.firebaseapp.com/
    * https://www.simicart.com/manifest-generator.html/
* Criar ícone (é sugerido 512px por 512px).
#### **Aula 6.G**

**CACHE**

O Service Worker possui então as seguintes etapas:
* **Install**: Ativado só uma vez, se alterar, é chamado novamente.
* **Activate**: Chamado só uma vez, quando uma nova versão do sw.is é instalada e se não tiver outra versão sendo executada. É aqui onde deleta as antigas.
* **Fetch**: Usado toda vez que a página é requisitada.
* **message**
* **sync**
* **push**

#### **Aula 6.I**
**EXERCíClO PWA**

Vamos dar início ao nosso projeto:
* Criar um PWA e instalar no seu smartphone.
* Usar Less ou Sass para CSS (se conhecer alguma opção de PostCSS, também usar).
* Tratar visualização e usar boas práticas (Google Mobile Friendly: search.google.com/test/mobile-friendly).

