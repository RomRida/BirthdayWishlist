package com.romri.BirthdayWishlist.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Getter
@Setter
public class AppUser {
    //id Name email role
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    //TODO Change to ENUM
    @Column(name = "role")
    private String role;
}
