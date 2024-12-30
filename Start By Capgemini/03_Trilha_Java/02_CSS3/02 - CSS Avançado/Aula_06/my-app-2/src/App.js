import React, {Component} from 'react';
import 'primereact/resources/primereact.min.css';
import './App.css';
import header from './components/header';
import footer from './components/footer';
import {Menubar} from 'primereact/menubar';
import {BrowserRouter} from 'react-router-dom';
import styled from 'styled-components';

const DivMain = styled.h1`
color: black
font-size: 10px
`;

class app extends Component{
  render(){
    const menuitems = [
      {
        label: 'Home',
        command: () => this.props.history.push('/')
      },
      {
        label: 'Sobre',
        command: () => this.props.history.push('/sobre')
      },
      {
        label: 'Contato',
        command: () => this.props.history.push('/contato')
      }
    ];
     return(
      <div className='App'>
        <Menubar model={menuitems}/>
        <header/>
        <DivMain>
          <main>
            <div className="content" id="content">
              {this.props.children}
            </div>
          </main>
        </DivMain>
        <footer/>
      </div>
     );
  }
}
export default BrowserRouter(app);