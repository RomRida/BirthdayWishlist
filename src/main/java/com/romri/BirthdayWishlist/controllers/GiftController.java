package com.romri.BirthdayWishlist.controllers;

import com.romri.BirthdayWishlist.services.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gifts")
public class GiftController {

    private final GiftService presentService;

    @Autowired
    public GiftController(GiftService giftService) {
        this.presentService = giftService;
    }

    //test endpoint TODO remove later
    @GetMapping("/hello")
    public String getMainMethod(){
        return "Hello World";
    }
}
