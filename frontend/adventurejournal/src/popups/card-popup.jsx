import React from "react";
import Popup from "reactjs-popup";
import Card from "../components/card";

const CardPopup = () => (
    <Popup modal trigger={Card} position="right center">
        <div><p>Estou aqui!</p></div>
    </Popup>
);

export default CardPopup;
