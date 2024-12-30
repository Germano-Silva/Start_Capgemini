import React from 'react';
import styled from 'styled-components';

const GuideSection = styled.section`
  padding: 3rem;
  background-color: #0d1117;
  color: white;
`;

const GuideTitle = styled.h1`
  text-align: center;
  font-size: 2.5rem;
  color: #ffa500;
`;

const GuideList = styled.ul`
  margin: 2rem auto;
  max-width: 600px;
  list-style: none;
  padding: 0;
`;

const GuideItem = styled.li`
  background-color: #161b22;
  margin: 1rem 0;
  padding: 1rem;
  border-radius: 8px;
  font-size: 1.2rem;
`;

function TravelGuide() {
  return (
    <GuideSection>
      <GuideTitle>Travel Guide</GuideTitle>
      <GuideList>
        <GuideItem>📍 Top destinations in Canada</GuideItem>
        <GuideItem>🎒 Packing tips for your trip</GuideItem>
        <GuideItem>🛡️ Safety and health guidelines</GuideItem>
        <GuideItem>📅 Best travel seasons</GuideItem>
      </GuideList>
    </GuideSection>
  );
}

export default TravelGuide;
