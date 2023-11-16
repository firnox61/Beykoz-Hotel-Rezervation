package com.bag.hotelmanagementsystem.repository;

import com.bag.hotelmanagementsystem.model.HotelModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HotelRepository extends JpaRepository<HotelModel, Long> {



    @Query(value = "SELECT * FROM hotel.hotel where hotel.starLevel = ?;", nativeQuery = true)
    public HotelModel getHotelstartLevel(String starLevel);

    @Query(value = "SELECT * FROM hotel.hotel where hotel.hotelId = ?;", nativeQuery = true)
    public HotelModel getHotelByid(Long hotelId);




}
