import logo from './logo.svg';
import estilo from'./App.module.css';
import novo from'./NovoCSS.module.css';


function App() {
  return (
    // utilizando o modulo css para estilizar o componente quando a classe não possuí "-" no nome.
    <div className={estilo.App}>
      {/* utilizando o modulo css para estilizar o componente quando a classe possuí "-" no nome. */}
      <header className={novo["App-header"]}>
        <img src={logo} className={estilo["App-logo"]} alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className={estilo["App-link"]}
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
