package com.org.choicehotels.domain;

import com.org.choicehotels.web.schema.AddressDTO;

import java.util.UUID;

public class HotelDetails {

    private UUID hotelID;

    private String name;

    private Address address;

    private String rating;

    public HotelDetails(UUID hotelID, String name, Address address, String rating) {
        this.hotelID = hotelID;
        this.name = name;
        this.address = address;
        this.rating = rating;
    }

    public HotelDetails() {
    }

    public UUID getHotelID() {
        return hotelID;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getRating() {
        return rating;
    }
}
