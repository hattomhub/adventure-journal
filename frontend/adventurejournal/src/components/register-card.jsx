import React, { Component } from 'react';
import axios from 'axios';

class RegisterCard extends Component {

    state = { };

    handleClick = () => {
        this.props.toggle();
    };

    handleUsername = event => {
        this.setState({ username: event.target.value });
    };

    handlePassword = event => {
        this.setState({ password: event.target.value });
    };

    handleEmail = event => {
        this.setState({ email: event.target.value });
    };

    register = (username, password, email) => {
        axios.post('http://192.168.1.28:8080/adventurejournal/api/user/add/', {
            username: username,
            md5Passwd: password,
            email: email
        })
    };

    render() {
        return (
            <div className="modalle">
                <div className="button_card" >
                    <span className="close" onClick={this.handleClick}>&times;</span>
                    <div className="modalle_container">
                        <h3><b>Register Form</b></h3>
                        <form>
                            <input id="registerInput" type="text" placeholder="Username" name="username" onChange={this.handleUsername}></input>
                            <input id="registerInput" type="text" placeholder="E-mail" name="email" onChange={this.handleEmail}></input>
                            <input id="registerInput" type="password" placeholder="Password" name="password" onChange={this.handlePassword}></input>
                            <a class="button" onClick={() => this.register(this.state.username, this.state.password, this.state.email)}>Submit</a>
                        </form>
                    </div>
                </div>
            </div >

        );
    }
}

export default RegisterCard;