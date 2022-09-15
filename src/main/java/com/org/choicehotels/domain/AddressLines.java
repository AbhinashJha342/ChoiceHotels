package com.org.choicehotels.domain;

public class AddressLines {

    private String exterior;

    private String street;

    public AddressLines(String exterior, String street) {
        this.exterior = exterior;
        this.street = street;
    }

    public AddressLines() {
    }

    public String getExterior() {
        return exterior;
    }

    public String getStreet() {
        return street;
    }
}
