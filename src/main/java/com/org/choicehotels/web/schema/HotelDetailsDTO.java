package com.org.choicehotels.web.schema;

import com.org.choicehotels.domain.Address;
import com.org.choicehotels.domain.AddressLines;
import com.org.choicehotels.domain.HotelDetails;

import java.util.UUID;

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

    public static HotelDetails to(UUID employeeId, HotelDetailsDTO hotelDetailsDTO){
        Address address = AddressDTO.to(hotelDetailsDTO.getAddress());
        return new HotelDetails(employeeId, hotelDetailsDTO.getName(), address, hotelDetailsDTO.getRating());
    }
}
