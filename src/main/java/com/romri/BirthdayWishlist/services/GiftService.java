package com.romri.BirthdayWishlist.services;

import com.romri.BirthdayWishlist.repositories.GiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiftService {
    private final GiftRepository presentRepository;

    @Autowired
    public GiftService(GiftRepository giftRepository) {
        this.presentRepository = giftRepository;
    }
}
