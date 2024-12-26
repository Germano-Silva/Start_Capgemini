import React from 'react';
import styled from 'styled-components';

const AboutSection = styled.section`
  padding: 3rem;
  text-align: center;
  background-color: #161b22;
  color: white;
`;

const Heading = styled.h1`
  font-size: 2.5rem;
  color: #ffa500;
`;

const Content = styled.p`
  font-size: 1.2rem;
  line-height: 1.8;
  margin: 2rem auto;
  max-width: 800px;
`;

function About() {
  return (
    <AboutSection>
      <Heading>About Us</Heading>
      <Content>
        We are a travel agency dedicated to helping you explore the beauty of Canada. 
        Our mission is to provide the best travel packages and guidance for adventurers 
        and explorers. Let us help you make unforgettable memories!
      </Content>
    </AboutSection>
  );
}

export default About;
