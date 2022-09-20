package com.org.choicehotels.web;

import com.org.choicehotels.springsoap.client.ChoiceHotelSoapClient;
import com.org.choicehotels.springsoap.client.gen.CreateHotelRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private ChoiceHotelSoapClient choiceHotelSoapClient;

    @GetMapping
    public String getSampleResponse(){
        return "Hello!";
    }

    @PostMapping
    public ResponseEntity createHotel(){
        CreateHotelRequest hotelRequest = new CreateHotelRequest();
        hotelRequest.setHotelId(UUID.randomUUID().toString());
        hotelRequest.setName("ChoiceHotel-1");
        hotelRequest.setRating("4");
        choiceHotelSoapClient.createHotel(hotelRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
