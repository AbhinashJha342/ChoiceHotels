package com.org.choicehotels.service.impl;

import com.org.choicehotels.domain.HotelDetails;
import com.org.choicehotels.service.HotelService;
import org.springframework.stereotype.Service;

@Service
public class BasicHotelService implements HotelService {


    @Override
    public HotelDetails createHotel(HotelDetails hotelDetails) {
        return hotelDetails;
    }
}
