package com.romri.BirthdayWishlist.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Gifts")
@Getter
@Setter
public class Gift {
    //id name link roleThatCanAccess taken
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "link")
    private String link;

}
