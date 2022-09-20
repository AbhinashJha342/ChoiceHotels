package com.org.choicehotels.web;

import com.org.choicehotels.domain.HotelDetails;
import com.org.choicehotels.service.HotelService;
import com.org.choicehotels.web.schema.HotelDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/hotels")
public class HotelController {


    private HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService){
        this.hotelService = hotelService;
    }

    @PostMapping
    public ResponseEntity<HotelDetails> createHotel(@RequestBody HotelDetailsDTO hotelDetailsDTO){
        UUID hotelID = UUID.randomUUID();
        return new ResponseEntity(hotelService.createHotel(HotelDetailsDTO.to(hotelID, hotelDetailsDTO)), HttpStatus.OK);
    }

    @GetMapping
    public String getSampleResponse(){
        return "Hello!";
    }
}
