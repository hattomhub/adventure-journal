import React, { Component } from 'react';
import Popup from '../popups/card-popup';

class Card extends Component {
    render() {
        return (
            <div class="card" onClick={Popup}>
                <img src="../img/download.png" alt="Avatar"/>
                <div class="container">
                    <h4><b>John Doe</b></h4>
                    <p>Architect & Engineer</p>
                </div>
            </div>
        )
    }
}

export default Card;