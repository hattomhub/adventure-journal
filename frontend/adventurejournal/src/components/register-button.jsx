import React, { Component } from 'react';
import RegisterCard from './register-card';

class RegisterButton extends Component {


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
                <a class="button" onClick={this.togglePop}>Sign up</a>
                {this.state.seen ? <RegisterCard toggle={this.togglePop} /> : null}
            </span>

        );
    }
}

export default RegisterButton;