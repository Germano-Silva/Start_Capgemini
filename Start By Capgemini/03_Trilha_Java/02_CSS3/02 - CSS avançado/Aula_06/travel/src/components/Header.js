import React from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';

const Navbar = styled.nav`
  background-color: #0d1117;
  padding: 1rem;
  display: flex;
  justify-content: space-between;
`;

const NavLinks = styled.div`
  a {
    color: white;
    text-decoration: none;
    margin: 0 15px;
    font-size: 1rem;
  }
`;

function Header() {
  return (
    <Navbar>
      <h1 style={{ color: '#ffa500' }}>Travel</h1>
      <NavLinks>
        <Link to="/">Home</Link>
        <Link to="/about">About</Link>
        <Link to="/travel-guide">Travel Guide</Link>
        <Link to="/help">Help</Link>
        <Link to="/top-cities">Top Cities</Link>
      </NavLinks>
    </Navbar>
  );
}

export default Header;
