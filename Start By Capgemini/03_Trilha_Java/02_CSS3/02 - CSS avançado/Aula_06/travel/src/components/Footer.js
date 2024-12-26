import React from 'react';
import styled from 'styled-components';

const FooterWrapper = styled.footer`
  background-color: #0d1117;
  padding: 1rem;
  text-align: center;
  color: white;
`;

function Footer() {
  return (
    <FooterWrapper>
      <p>© 2024 Travel Website. All Rights Reserved.</p>
    </FooterWrapper>
  );
}

export default Footer;
