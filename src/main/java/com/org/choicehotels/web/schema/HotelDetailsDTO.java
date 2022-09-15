package com.org.choicehotels.web.schema;

public class HotelDetailsDTO {

    private final String name;

    private final AddressDTO address;

    private final String rating;

    public HotelDetailsDTO(String name, AddressDTO address, String rating) {
        this.name = name;
        this.address = address;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public String getRating() {
        return rating;
    }
}
