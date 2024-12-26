import React from 'react';
import styled from 'styled-components';

const CitiesContainer = styled.section`
  padding: 3rem;
  background-color: #0d1117;
  color: white;
  text-align: center;
`;

const CityGrid = styled.div`
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
  gap: 1.5rem;
  margin-top: 2rem;
`;

const CityCard = styled.div`
  background-color: #161b22;
  border-radius: 8px;
  overflow: hidden;
  text-align: left;
`;

const CityImage = styled.img`
  width: 100%;
  height: 150px;
  object-fit: cover;
`;

const CityContent = styled.div`
  padding: 1rem;
`;

const CityTitle = styled.h3`
  margin: 0;
  color: #ffa500;
`;

const CityDescription = styled.p`
  margin: 0.5rem 0 0;
  color: #aaa;
`;

function TopCities() {
  const cities = [
    { name: 'Mancher', image: '/assets/images/Mancher.jpg', description: '3 days, 4 nights.' },
    { name: 'Caustin', image: '/assets/images/Caustin.jpg', description: '3 days, 4 nights.' },
    { name: 'Toronto', image: '/assets/images/Toronto.jpg', description: '3 days, 4 nights.' },
  ];

  return (
    <CitiesContainer>
      <h1>Top Cities</h1>
      <CityGrid>
        {cities.map((city, index) => (
          <CityCard key={index}>
            <CityImage src={city.image} alt={city.name} />
            <CityContent>
              <CityTitle>{city.name}</CityTitle>
              <CityDescription>{city.description}</CityDescription>
            </CityContent>
          </CityCard>
        ))}
      </CityGrid>
    </CitiesContainer>
  );
}

export default TopCities;
