import React, { Component } from 'react';
import PopUp from './popup';
import axios from 'axios';

class Card extends Component {


    state = {
        seen: false
    };

    togglePop = () => {
        this.setState({
            seen: !this.state.seen
        });
        //document.getElementById('root').classList.add('modal-open');
    };

    getAdventures() {
        const response = axios.get('http://192.168.1.28:8080/adventurejournal/api/adventure/list');
        this.setState({ adventures: response });
        console.log(this.state.adventures);
    }


    render() {
        return (
            <div className="topevents">
                <div className="eventCard" onClick={this.togglePop}>
                    <img src="../img/download.png" alt="Avatar" className="cardimg"/>
                    <div className="container">
                        <h4><b>John Doe</b></h4>
                        <p>Architect & Engineer</p>
                    </div>
                </div>
                {this.state.seen ? <PopUp toggle={this.togglePop} /> : null}
            </div>

        );
    }
}

export default Card;