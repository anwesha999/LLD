package com.atm.model;

// class ATMCard logic goes here

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ATMCard {
    private String cardNumber;
    private String cardHolderName;
    private String pin;

    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }
}
