package com.bag.hotelmanagementsystem.model;



import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="room")
public class RoomModel  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "roomnumber",nullable=false)
    private Long roomNumber;

    @Column(name = "isReserved",nullable=false)
    private boolean isReserved;

    @Column(name = "description",nullable=false)
    private String description;

    @Column(name = "roomcount",nullable = false)
    private Long roomCount;

    @Column(name = "price",nullable = false)
    private Long price;

    @Column(name = "roomtype",nullable = false)
    private String roomType;


/*
    @ManyToOne
    @JoinColumn(name = "room_id")
    private ReservationModel reservation;
*/
    /*@ManyToOne(mappedBy = "room")
    private Set<ReservationModel> reservation;*/
    /*@ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel category;
*/







}
