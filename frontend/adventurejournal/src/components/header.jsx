import React, { Component } from 'react';

class Header extends Component {
    render() {
        return (
            <div class="header">
                <a href="/" class="logo">Adventure Journal</a>
                <div class="header-right">
                    <a href="#contact" class="button">Sign in</a>
                    <a href="#about" class="button">Log in</a>
                </div>

            </div>
        )
    }
}

export default Header;