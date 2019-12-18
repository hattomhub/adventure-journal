import React, { Component } from 'react';
import RegisterCard from './login-card.jsx';

class LoginButton extends Component {


    state = {
        seen: false
    };

    togglePop = () => {
        this.setState({
            seen: !this.state.seen
        });
    };


    render() {
        return (
            <span>
                <a class="button" onClick={this.togglePop}>Log in</a>
                {this.state.seen ? <RegisterCard toggle={this.togglePop} /> : null}
            </span>

        );
    }
}

export default LoginButton;