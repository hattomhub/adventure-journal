import React, { Component } from 'react';

class LoginCard extends Component {

    handleClick = () => {
        this.props.toggle();
    };


    render() {
        return (
            <div className="modalle">
                <div className="button_card" >
                    <span className="close" onClick={this.handleClick}>&times;</span>
                    <div className="modalle_container">
                        <h3><b>Log In</b></h3>
                        <form>
                            <input type="text" placeholder="Username" name="username"></input>
                            <input type="text" placeholder="Password" name="password"></input>
                            <a class="button">Submit</a>
                        </form>
                    </div>
                </div>
            </div >

        );
    }
}

export default LoginCard;