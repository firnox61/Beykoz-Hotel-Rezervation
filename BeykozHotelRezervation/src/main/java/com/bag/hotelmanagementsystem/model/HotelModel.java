package com.bag.hotelmanagementsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name="hotel")
public class HotelModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;

    @Column(name = "hotelName",nullable=false)
    private String hotelName;

    @Column(name = "starLevel",nullable=false)
    private String starLevel;
/*
    @OneToMany(mappedBy = "hotel")
    private Set<ReservationModel> reservation;*/
}
