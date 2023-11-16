package com.bag.hotelmanagementsystem.model;

import javax.persistence.*;

import lombok.Data;


@Data
@Entity
@Table(name="users")
public class UserModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable=false)
    private String name;

    @Column(name = "surname",nullable=false)
    private String surName;

    @Column(name = "email",nullable=false)
    private String email;


    @Column(name = "tcnumber",nullable=false)
    private Long tcNumber;

    @Column(name = "telephonenumber",nullable=false)
    private Long telephoneNumber;

    @Column(name = "isAdmin",nullable=false)
    private boolean isAdmin;

  /*  @OneToOne(mappedBy = "users")
    private ReservationModel reservation;*/

}
