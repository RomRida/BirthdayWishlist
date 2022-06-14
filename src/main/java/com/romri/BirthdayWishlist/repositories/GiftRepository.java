package com.romri.BirthdayWishlist.repositories;

import com.romri.BirthdayWishlist.models.Gift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftRepository extends JpaRepository<Gift, Long> {
}
