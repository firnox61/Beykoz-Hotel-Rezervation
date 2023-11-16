package com.bag.hotelmanagementsystem.service;

import com.bag.hotelmanagementsystem.model.HotelModel;


import java.util.List;

public interface HotelService {

    List<HotelModel> getAllHotel();
    HotelModel saveHotel(HotelModel hotelModel);
    HotelModel getHotelById(Long hotelId);
    HotelModel updateHotel(HotelModel hotelModel);
    void deleteHotelById(Long hotelId);

   // List<HotelModel> getHotelBystarLevel(String starLevel);
   // HotelModel getHotelByid(Long hotelId);

}
