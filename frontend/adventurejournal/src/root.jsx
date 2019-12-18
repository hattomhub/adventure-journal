import React from 'react';
import Header from './components/header';
import Carousel from './components/carousel';
import Card from './components/card';
import Footer from './components/footer';
import { BrowserRouter, Route} from 'react-router-dom';

const screensRoot = () => (
    <BrowserRouter>
        <Route path='/' component={Header} />
        <Carousel />
        <Card />
        <Route path='/' component={Footer} />
    </BrowserRouter>
);

export default screensRoot;