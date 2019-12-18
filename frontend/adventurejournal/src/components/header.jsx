import React, { Component } from 'react';
import RegisterButton from './register-button';
import LoginButton from './login-button';

class Header extends Component {
    render() {
        return (
            <div className="header">
                <a href="/" class="logo">Adventure Journal</a>
                <LoginButton />
                <RegisterButton />
            </div>
        )
    }
}

export default Header;