import React from 'react';
import styled from 'styled-components';

const Banner = styled.div`
  background: url('/assets/images/banner.jpg') no-repeat center center/cover;
  height: 70vh;
  display: flex;
  justify-content: center;
  align-items: center;
  color: white;
`;

const Content = styled.section`
  padding: 2rem;
  text-align: center;
`;

function Home() {
  return (
    <div>
      <Banner>
        <h1>Explore Canada</h1>
      </Banner>
      <Content>
        <h2>Feel The Beautiful Canada Town</h2>
        <p>Discover amazing destinations, tailored packages, and breathtaking views.</p>
        <button>Explore Now</button>
      </Content>
    </div>
  );
}

export default Home;
