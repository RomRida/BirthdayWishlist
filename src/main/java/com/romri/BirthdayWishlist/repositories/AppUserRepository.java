package com.romri.BirthdayWishlist.repositories;

import com.romri.BirthdayWishlist.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
