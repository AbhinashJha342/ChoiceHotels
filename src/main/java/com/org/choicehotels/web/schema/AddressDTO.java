package com.org.choicehotels.web.schema;

public class AddressDTO {

    private final String city;

    private final State state;

    private final String postalCode;

    private final AddressLinesDTO addressLinesDTO;

    public AddressDTO(String city, State state, String postalCode, AddressLinesDTO addressLinesDTO) {
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.addressLinesDTO = addressLinesDTO;
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

    public AddressLinesDTO getAddressLinesDTO() {
        return addressLinesDTO;
    }
}
