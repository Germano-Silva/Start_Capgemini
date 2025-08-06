# 📚 Sistema de Notas Escolares

Sistema completo de gerenciamento escolar desenvolvido em Angular para controle de alunos, disciplinas e notas com relatórios de desempenho.

## 🚀 Funcionalidades

### 👥 Gestão de Alunos
- ✅ Cadastro de novos alunos
- ✅ Listagem de alunos matriculados
- ✅ Exclusão de alunos com confirmação
- ✅ Campos: Nome, Matrícula, Turma

### 📖 Gestão de Disciplinas
- ✅ Cadastro de novas disciplinas
- ✅ Listagem de disciplinas disponíveis
- ✅ Exclusão de disciplinas com confirmação
- ✅ Campos: Nome, Carga Horária
- ✅ Interface intuitiva com modo edição

### 📊 Lançamento de Notas
- ✅ Seleção de aluno e disciplina
- ✅ Lançamento por bimestre (1º, 2º, 3º, 4º)
- ✅ Notas de 0 a 10
- ✅ Visualização das notas por aluno
- ✅ Validação de campos obrigatórios

### 📈 Relatórios de Disciplinas
- ✅ Seleção de disciplina para análise
- ✅ Cálculo automático de médias
- ✅ Status de aprovação por aluno:
  - 🟢 **Aprovado** - Média ≥ 7.0 com 4 bimestres completos
  - 🔴 **Reprovado** - Média < 7.0 com 4 bimestres completos
  - 🔵 **Incompleto** - Faltam notas de alguns bimestres
  - 🔵 **Sem avaliação** - Nenhuma nota lançada
- ✅ Estatísticas visuais (aprovados vs reprovados)
- ✅ Interface com botões coloridos não clicáveis

## 🛠️ Tecnologias Utilizadas

- **Angular 14.2.13** - Framework principal
- **TypeScript** - Linguagem de programação
- **Bootstrap** - Framework CSS para estilização
- **RxJS** - Programação reativa
- **Angular CLI** - Ferramenta de desenvolvimento

## 📁 Estrutura do Projeto

```
src/
├── app/
│   ├── components/
│   │   ├── alunos/           # Gestão de alunos
│   │   ├── disciplinas/      # Gestão de disciplinas e relatórios
│   │   └── notas/           # Lançamento de notas
│   ├── models/
│   │   ├── aluno.model.ts    # Interface do aluno
│   │   ├── disciplina.model.ts # Interface da disciplina
│   │   └── nota.model.ts     # Interface da nota
│   ├── services/
│   │   ├── aluno.service.ts     # Serviço de alunos
│   │   ├── disciplina.service.ts # Serviço de disciplinas
│   │   └── nota.service.ts      # Serviço de notas
│   └── app-routing.module.ts    # Configuração de rotas
```

## 🚀 Como Executar

### Pré-requisitos
- Node.js (versão 14 ou superior)
- npm ou yarn
- Angular CLI

### Instalação
```bash
# Clone o repositório
git clone https://github.com/Germano-Silva/Start_Capgemini.git

# Navegue até o diretório do projeto
cd "Start_Capgemini/Start By Capgemini/03_Trilha_Java/05_Angular/01 - Angular/Aulas/sistema-notas-escolares"

# Instale as dependências
npm install
```

### Executar em Desenvolvimento
```bash
# Inicie o servidor de desenvolvimento
ng serve

# Ou em uma porta específica
ng serve
```

Acesse `http://localhost:4200` (ou a porta especificada) no seu navegador.

### Build para Produção
```bash
# Gerar build de produção
ng build --prod
```

## 📋 Como Usar

### 1. Cadastrar Alunos
1. Acesse a aba **"Alunos"**
2. Preencha: Nome, Matrícula, Turma
3. Clique em **"Adicionar"**
4. Para excluir: clique no botão **"Excluir"** na tabela

### 2. Gerenciar Disciplinas
1. Acesse a aba **"Disciplinas"**
2. Clique em **"Nova Disciplina"** para adicionar
3. Preencha: Nome e Carga Horária
4. Para excluir: ative o modo edição e use o botão 🗑️

### 3. Lançar Notas
1. Acesse a aba **"Notas"**
2. Selecione o aluno
3. Selecione a disciplina
4. Escolha o bimestre
5. Digite a nota (0-10)
6. Clique em **"Lançar Nota"**

### 4. Visualizar Relatórios
1. Acesse a aba **"Disciplinas"**
2. Clique em uma disciplina da lista
3. Visualize o desempenho de todos os alunos
4. Acompanhe as estatísticas de aprovação

## 🎨 Interface

- **Design Responsivo** - Funciona em desktop e mobile
- **Bootstrap** - Interface moderna e profissional
- **Navegação por Abas** - Fácil acesso às funcionalidades
- **Feedback Visual** - Alertas e confirmações
- **Botões Coloridos** - Status visual claro

## 📊 Regras de Negócio

### Aprovação de Alunos
- **Aprovado**: Média ≥ 7.0 com notas dos 4 bimestres
- **Reprovado**: Média < 7.0 com notas dos 4 bimestres
- **Incompleto**: Faltam notas de alguns bimestres
- **Sem avaliação**: Nenhuma nota foi lançada

### Cálculo de Médias
- Média aritmética das notas dos 4 bimestres
- Arredondamento para 2 casas decimais
- Validação de notas entre 0 e 10

## 🔧 Comandos Úteis

```bash
# Gerar novo componente
ng generate component nome-componente

# Gerar novo serviço
ng generate service nome-servico

# Executar testes
ng test

# Verificar versão do Angular
ng version

# Ajuda do Angular CLI
ng help
```

## 📝 Versão

**Versão 1.0.0** - Sistema completo com todas as funcionalidades implementadas

## 👨‍💻 Desenvolvedor

Desenvolvido como parte do programa **Start by Capgemini** - Trilha Java/Angular

## 📄 Licença

Este projeto é parte de um programa educacional e está disponível para fins de aprendizado.

---
