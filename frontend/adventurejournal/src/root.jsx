import React from 'react';
import Header from './components/header';
import Footer from './components/footer';
import Card from './components/card';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

const screensRoot = () => (
    <BrowserRouter>
        <Route path='/' component={Header} />
        <Switch>
            <Card />
        </Switch>
        <Route path='/' component={Footer} />
    </BrowserRouter>
);

export default screensRoot;