import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import About from './pages/About';
import TravelGuide from './pages/TravelGuide';
import Help from './pages/Help';
import TopCities from './pages/TopCities';
import Header from './components/Header';
import Footer from './components/Footer';

function App() {
  return (
    <Router>
      <Header />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="/travel-guide" element={<TravelGuide />} />
        <Route path="/help" element={<Help />} />
        <Route path="/top-cities" element={<TopCities />} />
      </Routes>
      <Footer />
    </Router>
  );
}

export default App;
