package com.org.choicehotels.domain;

import com.org.choicehotels.web.schema.State;

public class Address {

    private String city;

    private State state;

    private String postalCode;

    private AddressLines addressLines;

    public Address(String city, State state, String postalCode, AddressLines addressLines) {
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.addressLines = addressLines;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public AddressLines getAddressLines() {
        return addressLines;
    }
}
