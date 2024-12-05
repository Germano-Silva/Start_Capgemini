//import React from 'react';
//import ReactDOM from 'react-dom/client';
//import './index.css';
//import App from './App';
//import reportWebVitals from './reportWebVitals';

//const root = ReactDOM.createRoot(document.getElementById('root'));
//root.render(
//  <React.StrictMode>
//    <App />
//  </React.StrictMode>
//);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
//reportWebVitals();

import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import { BrowserRouter, Route, Routes} from 'react-router-dom';
import Home from './pages/home';
import Sobre from './pages/sobre';
import Contato from './pages/contato';
import { BrowserRouter } from 'react-router-dom/cjs/react-router-dom.min';
import something from 'react-router-dom';


ReactDOM.render(
  (
    <BrowserRouter>
      <App>
        <Routes>
          <Route exact path="/" component ={Home}/>
          <Route path="/sobre" component ={Sobre}/>
          <Route path="/contato" component ={Contato}/>
        </Routes>
      </App>
    </BrowserRouter>
  ),
  document.getElementById('root')
)