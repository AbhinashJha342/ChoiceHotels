package com.org.choicehotels.web.schema;

import com.org.choicehotels.domain.Address;
import com.org.choicehotels.domain.AddressLines;

import java.util.Optional;

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

    public static Address to(AddressDTO addressDTO){

        AddressLines addressLines =
                Optional.ofNullable(addressDTO.getAddressLinesDTO())
                        .filter(addressLinesDTO1 -> addressLinesDTO1!=null)
                        .map(addressLinesDTO1 -> new AddressLines(addressLinesDTO1.getExterior(), addressLinesDTO1.getStreet()))
                        .get();
        return new Address(addressDTO.getCity(), addressDTO.getState(), addressDTO.getPostalCode(), addressLines);
    }
}
