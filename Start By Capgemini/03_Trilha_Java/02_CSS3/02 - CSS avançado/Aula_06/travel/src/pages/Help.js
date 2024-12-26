import React from 'react';
import styled from 'styled-components';

const HelpContainer = styled.section`
  padding: 3rem;
  text-align: center;
  background-color: #161b22;
  color: white;
`;

const HelpHeading = styled.h1`
  font-size: 2.5rem;
  color: #ffa500;
`;

const FAQList = styled.div`
  margin-top: 2rem;
  max-width: 800px;
  margin-left: auto;
  margin-right: auto;
`;

const FAQItem = styled.div`
  background: #0d1117;
  padding: 1rem;
  margin: 1rem 0;
  border-radius: 5px;
`;

const Question = styled.h3`
  font-size: 1.5rem;
  margin: 0;
`;

const Answer = styled.p`
  margin: 0.5rem 0 0;
  font-size: 1.2rem;
  color: #aaa;
`;

function Help() {
  return (
    <HelpContainer>
      <HelpHeading>Help & Support</HelpHeading>
      <FAQList>
        <FAQItem>
          <Question>How do I book a trip?</Question>
          <Answer>Click on the "Book Now" button and follow the instructions.</Answer>
        </FAQItem>
        <FAQItem>
          <Question>What payment methods are accepted?</Question>
          <Answer>We accept credit cards, PayPal, and bank transfers.</Answer>
        </FAQItem>
        <FAQItem>
          <Question>Can I cancel my booking?</Question>
          <Answer>Yes, cancellations are allowed up to 48 hours before departure.</Answer>
        </FAQItem>
      </FAQList>
    </HelpContainer>
  );
}

export default Help;
