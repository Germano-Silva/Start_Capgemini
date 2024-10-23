import logo from './logo.svg';
import './App.css';
import styled from 'styled-components';

const Titulo = styled.h1`
color: #31e636;

`;

const Subtitulo = styled.h2`
color: green;
`;

const Artigo = styled.section`
color: #9393e2;
`;

const Titulo2 = styled.h1`
color: blue;
font-size: 25px
`;

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Titulo>Meu site</Titulo>
        <Subtitulo>Bem-vindo ao nosso site!</Subtitulo>
        <Artigo>Aqui, pensamos em soluções simples e eficazes. Nosso objetivo é fornecer serviços de qualidade que atendam às suas necessidades, com foco na inovação e praticidade. Trabalhamos para oferecer uma experiência acessível e intuitiva para todos os nossos clientes, garantindo que cada projeto seja concluído com excelência</Artigo>
        <Titulo2>Nossos serviços incluem:</Titulo2>
        <Artigo>Estamos prontos para ajudá-lo a alcançar seus objetivos com rapidez e eficiência. Se você procura uma equipe comprometida e preparada para fazer a diferença, não há lugar certo!</Artigo>
      </header>
    </div>
  );
}

export default App;
